package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import web.stepdef.BaseClass;

public class ProCEActivitiesPage extends BaseClass {

	// Storing all locators

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Automation Sanity NPA Copy 603_Advancing Care for HR+/HER2- Breast Cancer']")
	private WebElement activity;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Advancing Care for HR+/HER2- Breast Cancer']")
	private WebElement Prod_activity;
	
	@FindBy(how = How.XPATH, using = "(//img[contains(@alt,'Automation_Sanity_NPA_Copy_603_Advancing Care for HR+/HER2- Breast Cancer')])[1]")
	private WebElement Activity_image;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='Continue Activity' or normalize-space(text())='View Activity']")
	private WebElement beginactivitybutton;

	@FindBy(how = How.XPATH, using = "//a[@id='btnurl']")
	private WebElement Continuebutton;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Welcome to the PCE site']")
	private WebElement NPApopuptitle;

	@FindBy(how = How.XPATH, using = "//*[@id='submitNPADetails']")
	private WebElement Submit;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Abemaciclib']")
	private WebElement pretestAnswer1;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='After 2 dose reductions']")
	private WebElement pretestAnswer2;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Providing supportive therapies for adverse events']")
	private WebElement pretestAnswer3;

	@FindBy(how = How.XPATH, using = "//label[@for='33231_70125']")
	private WebElement pretestAnswer4;

	@FindBy(how = How.XPATH, using = "//*[@id='question_5E620872-59FE-4F98-BA19-DE0AF265A82D']/ul/li[4]/div/label")
	private WebElement pretestAnswer5;

	@FindBy(how = How.XPATH, using = "//input[@id='33235_70135']")
	private WebElement pretestAnswer6;

	@FindBy(how = How.XPATH, using = "//div[@class='w-100 justify-content-between d-flex align-items-center py-2']//a[@id='nxtbtn']")
	private WebElement ContinueActivitybtn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue to Activity']")
	private WebElement ContinueActivitypopup;
	
	@FindBy(how = How.XPATH, using = "//li[@class='sub-slides menuslide_841_7415']")
	private WebElement lastslide_Prod;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"activityvideoifrmemultimedia\"]")
	private WebElement iframe1;
	
	

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Continue To Post Test' or normalize-space(text())='Continue']")
	private WebElement Continuepostbtn;
	
	@FindBy(how = How.XPATH, using = "(//a[@id='continue_post_test'])[2]")
	private WebElement Continuepostbtn_Prod;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Automation_Sanity_NPA_Copy_603_Advancing Care for ')]")
	private WebElement Activityposttest;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32348_70055']")
	private WebElement PosttestAnswer1;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32349_70062']")
	private WebElement PosttestAnswer2;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32350_70067']")
	private WebElement PosttestAnswer3;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32359_70125']")
	private WebElement PosttestAnswer4;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32361_70135']")
	private WebElement PosttestAnswer5;
	
	@FindBy(how = How.XPATH, using = "//input[@id='32360_70127']")
	private WebElement PosttestAnswer6;
	
	
	@FindBy(how = How.XPATH, using = "(//a[@id='nxtbtn'])[2]")
	private WebElement ContinueEvalBtn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue to Evaluation']")
	private WebElement ContinueEvalPopupBtn;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue to Evaluation']")
	private WebElement ContinueEvalPopupBtn_prod;
			
	@FindBy(how = How.XPATH, using = "//h1[@id='div-title']")
	private WebElement LoginTitle;

	@FindBy(how = How.XPATH, using = "//input[@id='useremail']")
	private WebElement EmailIdXpath;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private WebElement PasswordXpath;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Log In']")
	private WebElement LoginBtn;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Verify Your Details']")
	private String EvaScreenPopup;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Save & Continue to Evaluation']")
	private WebElement EvalPopupButton;

	@FindBy(how = How.XPATH, using = "//button[text()='OK']")
	private WebElement Okbutton;

	@FindBy(how = How.XPATH, using = "(//input[@id='38647_84952'])[1]")
	private WebElement EvalAnswer1;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='forms[33244][12161][ratinggroupid]'])[1]")
	private WebElement EvalAnswer2_1;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='forms[33244][12162][ratinggroupid]'])[1]")
	private WebElement EvalAnswer2_2;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='forms[33244][12163][ratinggroupid]'])[1]")
	private WebElement EvalAnswer2_3;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='forms[33244][12164][ratinggroupid]'])[1]")
	private WebElement EvalAnswer2_4;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='forms[33244][12165][ratinggroupid]'])[1]")
	private WebElement EvalAnswer2_5;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33245_70242'])[1]")
	private WebElement EvalAnswer3;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33246_70245'])[1]")
	private WebElement EvalAnswer4;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33247_70248'])[1]")
	private WebElement EvalAnswer5;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33248_70251'])[1]")
	private WebElement EvalAnswer6;
	
	@FindBy(how = How.XPATH, using = "(//input[@value='179'])[1]")
	private WebElement EvalAnswer7;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33250_70259'])[1]")
	private WebElement EvalAnswer8;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33251_70265'])[1]")
	private WebElement EvalAnswer9;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33252'])[1]")
	private WebElement EvalAnswer10;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='33253'])[1]")
	private WebElement EvalAnswer11;
	
	@FindBy(how = How.XPATH, using = "(//textarea[@id='33254'])[1]")
	private WebElement EvalAnswer12;
	
	@FindBy(how = How.XPATH, using = "//div[@class='w-100 justify-content-between d-flex align-items-center py-2']//a[@id='nxtbtn']")
	private WebElement SubmitEvaluation;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='CONGRATULATIONS']")
	private String CongratulationsScreen;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'d-lg-flex')]//*[@id='dropdownMenuButton1']/div/a/label")
	private WebElement profile_icon;
	
	@FindBy(how = How.XPATH, using = "//*[@id='navbarNav']/div/div/div/ul/div/li[7]/a")
	private WebElement Logoutbutton;
	
	

	
	// Declaring the String

	//Prod data
	public String Pretesturl = "https://practicingclinicians.com/CE-CME/oncology/automation-sanity-copy-911-advancing-care-for-hrher2-breast-cancer/25262";
	public String Posttesturl = "https://practicingclinicians.com/CE-CME/oncology/automation-sanity-copy-911-advancing-care-for-hrher2-breast-cancer/25262/posttest";
	public String Answer1 = "(//label[normalize-space(text())='%s']//parent::*//input)[1]";
	
	//UAT data
//	public String Pretesturl = "https://uat.practicingclinicians.com/CE-CME/oncology/automation-sanity-npa-copy-603-advancing-care-for-hrher2-breast-cancer/24205";
//	public String Posttesturl = "https://uat.practicingclinicians.com/CE-CME/oncology/automation-sanity-npa-copy-603-advancing-care-for-hrher2-breast-cancer/24205/posttest";
//	public String Answer1 = "(//label[normalize-space(text())='%s']//parent::*//input)[1]";

	public String EvalSingleselectAns = "(//td[@data-th='%s']//input)";

	JavascriptExecutor js = (JavascriptExecutor) driver;

	// ActivityPage initialization
	public ProCEActivitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*******************************************************
	 * Function for Pre-test
	 *******************************************************/
	public void PretestActivitydetailpage() {
		driver.navigate().to(Pretesturl);
	}

	public void Activitypage(String Expectedactivity) {
		
		//UAT
//		String actualactivityTitle = activity.getText();
//		Assert.assertEquals(actualactivityTitle, Expectedactivity);
//		System.out.println("Activity found as  " + Expectedactivity);
		
		//Prod
		String ProdactualactivityTitle = Prod_activity.getText();
		Assert.assertEquals(ProdactualactivityTitle, Expectedactivity);
		System.out.println("Activity found as  " + ProdactualactivityTitle);
	}

	public void ContinueActivitybutton() {
		// Calling Javascript function for scroll
		js.executeScript("window.scrollBy(0,400)");

		// Click on Continue/Begin Activity button
		selUtil.hardWait(10);
		beginactivitybutton.click();
		//selUtil.hardWait(10);
	}

	public void Npapopup(String ExpectedNpaPopupTitle)  {
		selUtil.hardWait(20);
		String ActualNpaPopuptitle = NPApopuptitle.getText();
		Assert.assertEquals(ActualNpaPopuptitle, ExpectedNpaPopupTitle);
		System.out.println("NPA Popup tilte found as " + ActualNpaPopuptitle);
	}

	public void Enterdetails(String ExpectedDegree, String ExpectedMedicalSpeciality) {
		// Primary degree
		WebElement testDropDown = driver.findElement(By.xpath("//*[contains(text(),'Choose degree')]"));
		testDropDown.click();
		System.out.println("click on Primary degree drop down");

		WebElement dropdown = driver.findElement(By.xpath("//*[@id='degrees']/option[5]"));
		dropdown.click();

		// Primary_Medical_speciality
		selUtil.hardWait(5);
		WebElement testDropDown2 = driver.findElement(By.xpath("//*[contains(text(),'Choose specialist')]"));
		testDropDown2.click();
		System.out.println("click on Primary_Medical_speciality drop down");

		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='specialities']/option[6]"));
		dropdown2.click();
	}

	public void ClickonSubmit() {
		Submit.click();
	}

	public void pretestquestion(){
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,600)");
		selUtil.hardWait(5);
		pretestAnswer1.click();
		pretestAnswer2.click();

		js.executeScript("window.scrollBy(0,640)");
		selUtil.hardWait(5);
		pretestAnswer3.click();
		pretestAnswer4.click();

		js.executeScript("window.scrollBy(0,700)");
		selUtil.hardWait(10);
		pretestAnswer5.click();
		pretestAnswer6.click();
	}

	public void ContinueActivitybtn1() {
		js.executeScript("window.scrollBy(0,725)");
		selUtil.hardWait(10);
		ContinueActivitybtn.click();
	}

	public void ContinueActivityPopup() {
		selUtil.hardWait(15);
		ContinueActivitypopup.click();
	}

	/*******************************************************
	 * Function for Post test
	 *******************************************************/
	public void ContinuePosttestbtn() {
		//js.executeScript("window.scrollBy(0,910)");
		//Prod_data		
		js.executeScript("window.scrollBy(0,800)");
		selUtil.hardWait(10);
		driver.switchTo().frame(iframe1);
		lastslide_Prod.click();
		
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,500)");
		selUtil.hardWait(10);
		//Continuepostbtn.click();
		Continuepostbtn_Prod.click();
	}

	public void Selectanswersforposttest() {
	
		selUtil.hardWait(10);
		js.executeScript("arguments[0].click();", PosttestAnswer1);
		js.executeScript("arguments[0].click();", PosttestAnswer2);
		js.executeScript("arguments[0].click();", PosttestAnswer3);
		js.executeScript("arguments[0].click();", PosttestAnswer4);
		js.executeScript("arguments[0].click();", PosttestAnswer5);
		js.executeScript("arguments[0].click();", PosttestAnswer6);
		js.executeScript("window.scrollBy(0,800)");
	}

	public void clickOnContinueEvaluation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ContinueEvalBtn);
	}

	public void clickOnContinueEvaluationPopup() {
		selUtil.hardWait(10);
		//ContinueEvalPopupBtn.click();
		js.executeScript("arguments[0].click();", ContinueEvalPopupBtn_prod);
		//ContinueEvalPopupBtn_prod.click();
	}

	public void VerifyTitleOnLogin(String ExpectedLoginTitle) {
		String ActualLoginPageTitle = LoginTitle.getText();
		Assert.assertEquals(ActualLoginPageTitle, ExpectedLoginTitle);
		System.out.println("Activity found as  " + ExpectedLoginTitle);
	}

	public void Login(String UserName, String Password) {
		EmailIdXpath.sendKeys(UserName);
		PasswordXpath.sendKeys(Password);
		LoginBtn.click();
	}

	public void EvaluationScreenPopup() {
		selUtil.hardWait(10);
		//Assert.assertEquals(true, driver.findElement(By.xpath(EvaScreenPopup)).isDisplayed());
	}

	public void evaluationPopup() throws InterruptedException {
		selUtil.hardWait(10);
		EvalPopupButton.click();
		selUtil.hardWait(5);
		Okbutton.click();
		Thread.sleep(2000);
	}

	public void evaluationAnswers() {
		//js.executeScript("window.scrollBy(0,770)");
		selUtil.hardWait(10);
		js.executeScript("arguments[0].click();", EvalAnswer1);
		
		//js.executeScript("window.scrollBy(0,620)");
		js.executeScript("arguments[0].click();", EvalAnswer2_1);
		js.executeScript("arguments[0].click();", EvalAnswer2_2);
		js.executeScript("arguments[0].click();", EvalAnswer2_3);
		js.executeScript("arguments[0].click();", EvalAnswer2_4);
		js.executeScript("arguments[0].click();", EvalAnswer2_5);
			
		//js.executeScript("window.scrollBy(0,640)");
		js.executeScript("arguments[0].click();", EvalAnswer3);
		js.executeScript("arguments[0].click();", EvalAnswer4);
		
		//js.executeScript("window.scrollBy(0,700)");
		
		js.executeScript("arguments[0].click();", EvalAnswer5);
		js.executeScript("arguments[0].click();", EvalAnswer6);
		
		//js.executeScript("window.scrollBy(0,700)");
		js.executeScript("arguments[0].click();", EvalAnswer7);
		js.executeScript("arguments[0].click();", EvalAnswer8);
		js.executeScript("arguments[0].click();", EvalAnswer9);
				
		//js.executeScript("window.scrollBy(0,770)");
		EvalAnswer10.sendKeys("123");
		EvalAnswer11.sendKeys("456");
		EvalAnswer12.sendKeys("789");
	}

	public void clickSubmitEvaluation() {
		
		selUtil.hardWait(10);
		js.executeScript("window.scrollBy(0,1010)");
		SubmitEvaluation.click();
	}

	public void VerifyCongratulationsScreen() {
		Assert.assertEquals(true, driver.findElement(By.xpath("//h1[normalize-space()='CONGRATULATIONS']")).isDisplayed());
		
		profile_icon.click();
		Logoutbutton.click();
	}
	
	public void LogoutPCE()
	{
		profile_icon.click();
		Logoutbutton.click();
	}
	
}