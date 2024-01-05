package web.pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnonymousFunction {
	
	private WebDriver driver = null;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='titlesearch']")
	private WebElement GlobalSearchXpath;
	
	@FindBy(how = How.XPATH, using = "//input[@id='titlesearch']//parent::div//a")
	private WebElement GlobalSearchBtn;
	
	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='View Activity' or normalize-space(text())='Continue Activity']")
	private WebElement BeginActivityBtn;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Continue to Post Test' or normalize-space(text())='Continue'])[1]")
	private WebElement ContinuePostTestBtn;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Continue to Evaluation'])[1]")
	private WebElement ContinueEvalBtn;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Continue to Evaluation']")
	private WebElement ContinueEvalPopupBtn;
	
	@FindBy(how = How.ID, using = "useremail")
	private WebElement EmailIdXpath;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement PasswordXpath;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Log In']")
	private WebElement LoginBtn;
	
	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Save & Continue to Evaluation']")
	private WebElement EvalPopupBtn;
	
	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	private WebElement OKBtn;
	
	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Submit Evaluation']")
	private WebElement submitEval;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space(text())='A. Yes, I plan to implement changes in my practice based on the information presented']//preceding-sibling::input")
	private WebElement Q4xpath;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space(text())='A. Educated other healthcare professionals']//preceding-sibling::input")
	private WebElement Q5xpath;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space(text())='A. Formulary restrictions']//preceding-sibling::input")
	private WebElement Q6xpath;
	
	@FindBy(how = How.XPATH, using = "//input[@type='text' and @data-number='1']")
	private WebElement Q7xpath;
	
	
	String ActivityCard = "(//a//*[normalize-space(text())='%s'])[1]";
	String Answer1 = "(//label[normalize-space(text())='%s']//parent::*//input)[1]";
	String EvalSingleselectAns = "(//td[@data-th='%s']//input)";
	
	
	
	public AnonymousFunction (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void globalSearchActivities (String ActivityName)
	{
		GlobalSearchXpath.sendKeys(ActivityName, Keys.ENTER);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		driver.navigate().refresh();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(ActivityCard, ActivityName))));
//		driver.navigate().refresh();
//		GlobalSearchXpath.clear();
//		GlobalSearchXpath.sendKeys(ActivityName, Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath(String.format(ActivityCard, ActivityName))));
//		driver.findElement(By.xpath(String.format(ActivityCard, ActivityName))).click();
	}
	
	public void clickBeginActivity ()
	{
		BeginActivityBtn.click();
		
	}
	
	public void clickContinuePostTest ()
	{
		ContinuePostTestBtn.click();
	}
	
	public void clickContinueEvaluation ()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ContinueEvalBtn);
//		ContinueEvalBtn.click();
	}
	
	public void clickContinueEvaluationPopup ()
	{
		
		ContinueEvalPopupBtn.click();
	}
	
	public void postTestAnswers(String PT1, String PT2, String PT3, String PT4)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath(String.format(Answer1, PT1))));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath(String.format(Answer1, PT2))));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath(String.format(Answer1, PT3))));
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath(String.format(Answer1, PT4))));
		
//		driver.findElement(By.xpath(String.format(Answer1, PT1))).click();
//		driver.findElement(By.xpath(String.format(Answer1, PT2))).click();
//		driver.findElement(By.xpath(String.format(Answer1, PT3))).click();
	}
	
	public void evaluationPopup () throws InterruptedException
	{
		EvalPopupBtn.click();
		Thread.sleep(5000);
		OKBtn.click();
		Thread.sleep(2000);
	}
	
	public void evaluationAnswers(String Q1_1,String Q1_2,String Q1_3,String Q1_4,String Q2_1,String Q2_2,String Q2_3,String Q2_4,String Q2_5,String Q2_6,String Q3_1,String Q3_2,String Q3_3,String Q3_4,String Q4,String Q5,String Q6,String Q7)
	{
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[1]", Q1_1))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[2]", Q1_2))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[3]", Q1_3))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[4]", Q1_4))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[5]", Q2_1))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[6]", Q2_2))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[7]", Q2_3))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[8]", Q2_4))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[9]", Q2_5))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[10]", Q2_6))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[11]", Q3_1))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[12]", Q3_2))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[13]", Q3_3))).click();
		driver.findElement(By.xpath(String.format(EvalSingleselectAns+"[14]", Q3_4))).click();
		
		Q4xpath.click();
		Q5xpath.click();
		Q6xpath.click();
		Q7xpath.sendKeys("250");
		
	}
	
	public void clickSubmitEval ()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",submitEval);
	}
	
	public void Login (String UserName, String Password)
	{
		EmailIdXpath.sendKeys(UserName);
		PasswordXpath.sendKeys(Password);
		LoginBtn.click();
	}
	

}
