package web.stepdef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.ConstantsAPI;

public class InContent extends BaseClass {

	public InContent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// private static ChromeDriver driver;
	//
	// public static void main(String[] args) throws InterruptedException {
	// WebDriverManager.chromedriver().setup();
	// driver = new ChromeDriver();
	// driver.get("https://uat.clinicaloptions.com/login");
	// driver.manage().window().maximize();
	// //
	// driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/div/div/a[1]/span")).click();
	// driver.findElement(By.id("useremail")).sendKeys("krunal.rana@extentia.com");
	// driver.findElement(By.id("password")).sendKeys("Krunal@2023");
	// driver.findElement(By.xpath("//*[@id='createlogin']/div[1]/div[4]/button")).click();
	// Thread.sleep(5000);
	// driver.get("https://uat.clinicaloptions.com/activity/ecase/1E85C0D0-84E0-4AAC-A1F1-839FCC72D72F/1");
	// // driver.findElement(By.id("btnurl")).click();
	// List<WebElement> Questionlist = driver
	// .findElements(By.xpath("//div[@class='chck-box-sec my-2
	// all-section-questions']"));
	// int TotalQA = Questionlist.size();
	// System.out.println("total questions=" + TotalQA);
	// // getCountFromJson();
	// // fetchAnswerIds("B22BC80F-121D-4C58-8D8B-E588FB21558");
	// }

	/*
	 * public static void getCountFromJson() { JSONParser parser = new JSONParser();
	 * try { Object obj = parser.parse(new
	 * FileReader("./src/test/resources/data/activity.json")); JSONObject jsonObject
	 * = (JSONObject) obj;
	 * 
	 * obj = jsonObject.get("data"); jsonObject = (JSONObject) obj; obj =
	 * jsonObject.get("steps"); jsonObject = (JSONObject) obj; JSONArray evaluation
	 * = (JSONArray) jsonObject.get("evaluation"); // int size = ((Map)
	 * evaluation).size(); for (int i = 0; i < evaluation.size() ; i++) { jsonObject
	 * = (JSONObject) evaluation.get(i); System.out.println("map_question_uuid: " +
	 * jsonObject.get("map_question_uuid")); JSONArray answerOptions = (JSONArray)
	 * jsonObject.get("answerOptions"); for (int j = 0; j < answerOptions.size();
	 * j++) { jsonObject = (JSONObject) answerOptions.get(j);
	 * System.out.println("correct_answer: " + jsonObject.get("correct_answer"));
	 * System.out.println("sort_order: " + jsonObject.get("sort_order")); } //
	 * System.err.println(
	 * "###########################################################"); } } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */

	public static void testIncorrectAnswersForContent(String currentStep, JSONObject jObj) {
		pauseInSeconds(5);
		int[] questions = fetchQuestionsFromHTML();
		List<Integer> list = convertToList(questions);
		// Apply loop on questionIDs
		for (int i = 0; i < list.size(); i++) {
			if (isDisplayed(By.cssSelector("[data-elementid='" + list.get(i) + "']"))) {
				Integer randomAnswer = getRandomValueFromArray(fetchAnswerIds(list.get(i), currentStep, jObj));
				selectAnswerOnHTMLForContent(randomAnswer);
			}
			pauseInSeconds(3);
			WebElement element = driver.findElement(By.xpath("//*[text()='NEXT']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			pauseInSeconds(3);
			if (isDisplayed(By.xpath("//*[text()='You need to select an answer to continue.']"))) {
				pauseInSeconds(3);
				driver.findElement(By.xpath("//*[text()='OK']")).click();
			} else if (!isDisplayed(By.xpath("(//a[text()='NEXT' and @class='deact-pg-btn'])[1]"))) {
				questions = fetchQuestionsFromHTML();
				List<Integer> list1 = convertToList(questions);
				list.addAll(list1);
			} else {
				pauseInSeconds(3);
				driver.findElement(By.xpath("(//a[text()='Continue'])[1]")).click();
				break;
			}
		}
	}

	public static void testIncorrectAnswersForPoll(JSONObject jObj) {
		pauseInSeconds(5);
		if (isDisplayed(By.xpath("//*[normalize-space()='Poll']"))) {
			int[] questions = fetchQuestionsFromHTML();
			List<Integer> list = convertToList(questions);
			// Apply loop on questionIDs
			for (int i = 0; i < list.size(); i++) {
				if (isDisplayed(By.cssSelector("[data-elementid='" + list.get(i) + "']"))) {
					Integer randomAnswer = getRandomValueFromArray(fetchAnswerIds(list.get(i), "poll", jObj));
					selectAnswerOnHTMLForContent(randomAnswer);
				}
				pauseInSeconds(3);
				WebElement element = driver.findElement(By.xpath("//a[text()='Submit']"));
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
				pauseInSeconds(3);
				element = driver.findElement(By.xpath("(//a[text()='Continue to Activity'])[1]"));
				executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
				pauseInSeconds(3);
				element = driver.findElement(By.xpath("(//a[text()='Continue'])[1]"));
				executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
			}
		}
	}

	private static List<Integer> convertToList(int[] questions) {
		List<Integer> list = new ArrayList<>();
		for (Integer i : questions) {
			list.add(i);
		}
		return list;
	}

	public static boolean isDisplayed(By by) {
		try {
			WebElement element = driver.findElement(by);
			if (element == null)
				return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void testIncorrectAnswers(String currentStep, JSONObject jObj) {
		pauseInSeconds(5);
		int[] questions = fetchQuestionsFromHTML();
		// Apply loop on questionIDs
		for (int i = 0; i < questions.length; i++) {
			Integer randomAnswer = getRandomValueFromArray(fetchAnswerIds(questions[i], currentStep, jObj));
			selectAnswerOnHTML(randomAnswer);
		}
		pauseInSeconds(5);
		driver.findElement(By.xpath("(//*[text()='Continue to Activity'])[last()]")).click();
		pauseInSeconds(5);
		if (isDisplayed(By.xpath("(//*[text()='Continue to Post Test'])[last()]")))
			driver.findElement(By.xpath("(//*[text()='Continue to Post Test'])[last()]")).click();
		WebElement countinue_btn = driver.findElement(By.xpath("//button[text()='Continue to Activity']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", countinue_btn);
	}

	/*
	 * public static void testCorrectAnswers(String questionID) { String[] questions
	 * = fetchQuestionsFromHTML(); // Apply loop on questionIDs for (int i = 0; i <
	 * questions.length; i++) { selectAnswerOnHTML(fetchCorrectAnswer(questionID));
	 * } }
	 */

	public static Integer fetchCorrectAnswer(Integer questionID, String currentStep, JSONObject jObj) {
		JSONArray arrInContent = jObj.getJSONArray(currentStep);
		for (int i = 0; i < arrInContent.length(); i++) {
			JSONObject inContentQuestion = arrInContent.getJSONObject(i);
			int inContentQuestionID = inContentQuestion.getInt("data-elementid");
			if (inContentQuestionID == questionID) {
				JSONArray arrAnsOptions = inContentQuestion.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject answerObject = arrAnsOptions.getJSONObject(j);
					int ansId = answerObject.getInt("id");
					int inCorrectAns = answerObject.getInt("correct_answer");
					if (inCorrectAns == 1) {
						return ansId;
					}
				}
			}
		}
		return 0;
	}

	public static int[] fetchQuestionsFromHTML() {
		List<WebElement> Questionlist = driver
				.findElements(By.xpath("//div[starts-with(@id,'secquest') or starts-with(@id,'question')]"));
		int arr[] = new int[Questionlist.size()];
		for (int i = 0; i < Questionlist.size(); i++) {
			arr[i] = Integer.parseInt(Questionlist.get(i).getAttribute("data-elementid"));
		}
		return arr;
	}

	public static ArrayList<Integer> fetchAnswerIds(int questionID, String currentStep, JSONObject jObj) {
		ArrayList<Integer> incorrectAnswerIDArray = new ArrayList<Integer>();
		JSONArray arrInContent = jObj.getJSONArray(currentStep);
		for (int i = 0; i < arrInContent.length(); i++) {
			JSONObject inContentQuestion = arrInContent.getJSONObject(i);
			int inContentQuestionID = inContentQuestion.getInt("data-elementid");
			if (inContentQuestionID == questionID) {
				JSONArray arrAnsOptions = inContentQuestion.getJSONArray("answerOptions");
				for (int j = 0; j < arrAnsOptions.length(); j++) {
					JSONObject answerObject = arrAnsOptions.getJSONObject(j);
					int ansId = answerObject.getInt("id");
					int inCorrectAns = answerObject.getInt("correct_answer");
					if (inCorrectAns == 0) {
						incorrectAnswerIDArray.add(ansId);
					}
				}
			}
		}
		return incorrectAnswerIDArray;
	}

	public static Integer getRandomValueFromArray(ArrayList<Integer> answerIDs) {
		// array of numnbers which should return random value
		System.out.println("Selecting a random element from the list : " + answerIDs.size());
		if (answerIDs.size() > 0) {
			Random randomObj = new Random();
			return answerIDs.get(randomObj.nextInt(answerIDs.size()));
		} else {
			return 0;
		}

	}

	public static void selectAnswerOnHTML(Integer answerID) {
		// if(answerID == 0)
		// {
		// //driver.findElement(By.xpath("//p[text()='"']")).click();
		//
		// }else {
		WebElement element = driver.findElement(By.xpath("//input[@value='" + answerID + "']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		// }
		// select answer with this answerID
		pauseInSeconds(5);
		element = driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
		executor.executeScript("arguments[0].click();", element);
	}

	public static void selectAnswerOnHTMLForContent(Integer answerID) {
		// if(answerID == 0)
		// {
		// //driver.findElement(By.xpath("//p[text()='"']")).click();
		//
		// }else {
		WebElement element = driver.findElement(By.xpath("//input[@value='" + answerID + "']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		// }
		// select answer with this answerID
	}

	private static void pauseInSeconds(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void jumpToLastPage() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		List<WebElement> lastPage = driver.findElements(By.xpath("//*[text()='Course Completed']"));
		if (lastPage.size() == 0) {
			List<WebElement> nextPage = driver.findElements(By.xpath("//span[@class='active-step']"));
			if (nextPage.size() >= 1) {
				nextPage.get(0).click();
			}
		} else
			lastPage.get(0).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void testCorrectAnswers(String currentStep, JSONObject jObj) {
		pauseInSeconds(5);
		int[] questions = fetchQuestionsFromHTML();
		// Apply loop on questionIDs
		for (int i = 0; i < questions.length; i++) {
			selectAnswerOnHTML(fetchCorrectAnswer(questions[i], currentStep, jObj));
		}
		pauseInSeconds(5);
		driver.findElement(By.xpath("//button[text()='Continue to Evaluation']")).click();
		pauseInSeconds(5);
		driver.findElement(By.xpath("//*[text()='Save & Continue  to Evaluation ']")).click();
		pauseInSeconds(5);
		driver.findElement(By.xpath("//*[text()='OK']")).click();
	}

	public static void testEvaluation() {

		// For Long Text and Numbers
		try {
			enterText(driver, ConstantsAPI.LONG_TEXT_EVAL_ID);
			enterText(driver, ConstantsAPI.NUMBER_EVAL_ID);
			clickSingleSelectRandomOptions(driver, ConstantsAPI.SINGLE_SELECT_EVAL_HASH_MAP);
			clickSingleSelectRandomOptions(driver, ConstantsAPI.MULTI_SELECT_EVAL_HASH_MAP);
			clickRatingGroupOptions(driver, ConstantsAPI.RATING_GROUP_EVAL_HASH_MAP);
		} catch (Exception e) {
			e.printStackTrace();
		}

		WebElement e = driver.findElement(By.xpath("(//a[normalize-space(text())='Submit Evaluation'])[1]"));
		clickElementWithJavaScript(driver, e);
	}

	private static void enterText(WebDriver driver, ArrayList<Integer> idList) {

		for (Integer id : idList) {
			if (idList == ConstantsAPI.LONG_TEXT_EVAL_ID) {
				String elementId = "(//div[@data-elementid='%s']//following::textarea)[1]";
				WebElement element = driver.findElement(By.xpath(String.format(elementId, id)));
				element.sendKeys("Test");
			} else if (idList == ConstantsAPI.NUMBER_EVAL_ID) {
				String elementId = "(//div[@data-elementid='%s']//following::input)[1]";
				WebElement element = driver.findElement(By.xpath(String.format(elementId, id)));
				element.sendKeys("70");
			}

		}

	}

	private static void clickSingleSelectRandomOptions(WebDriver driver,
			HashMap<Integer, HashMap<Integer, Integer>> elementOptions) {
		Random random = new Random();

		for (Integer element : elementOptions.keySet()) {
			HashMap<Integer, Integer> options = elementOptions.get(element);

			int randomIndex = random.nextInt(options.size());
			int optionToClick = options.get(randomIndex);

			String elementId = "//div[@data-elementid='%s']//input[@value='%s']";
			WebElement optionElement = driver.findElement(By.xpath(String.format(elementId, element, optionToClick)));

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", optionElement);
//			optionElement.click();
		}
		List<WebElement> ele = driver.findElements(
				By.xpath("(//div[not(@style='display:none;')]//*[normalize-space(text())='Please specify:'])[1]"));
		if (!ele.isEmpty()) {
			WebElement element = driver.findElement(By.xpath(
					"(//div[not(@style='display:none;')]//*[normalize-space(text())='Please specify:']//following-sibling::input)[1]"));
//			element.sendKeys("Test");
			enterTextWithJavaScript(driver, element, "Test");

		}
	}

	private static void clickRatingGroupOptions(WebDriver driver,
			HashMap<Integer, HashMap<Integer, Integer>> elementOptions) {

		for (Integer element : elementOptions.keySet()) {

			String str = "//div[@data-elementid='%d']//tr//td[@data-th='Agree']//input[@type='radio']";
			String elementXpath = String.format(str, element);
			List<WebElement> options = driver.findElements(By.xpath(elementXpath));
			for (WebElement opt : options) {
				clickElementWithJavaScript(driver, opt);
			}
//			optionElement.click();
		}

	}

	private static void clickElementWithJavaScript(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	private static void enterTextWithJavaScript(WebDriver driver, WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value = arguments[1];", element, text);
	}

}
