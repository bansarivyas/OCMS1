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

public class SoftLoginMultiMedia extends BaseClass {

	@FindBy(how = How.XPATH, using = "//iframe[@id='activityvideoifrmemultimedia']")
	private WebElement iframe1;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Parts 1 - 10']")
	private WebElement Chapters1_10;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"chapter_79CEAF11-96EB-407D-814D-D508A58BB3C5\"]/button")
	private WebElement Chapters1_10_Prod;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Parts 11 - 17']")
	private WebElement Chapters_11;
	

	@FindBy(how = How.XPATH, using = "//*[@id='collapse_561']/div/ul/li[7]")
	private WebElement Chapter17_Clip9;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Parts 11 - 17']")
	private WebElement Chapter17_Clip9_prod;
	
	@FindBy(how = How.XPATH, using = "//*[@id='collapse_834']/div/ul/li[7]")
	private WebElement Clip9_Prod;

	@FindBy(how = How.XPATH, using = "(//a[@id='continue_post_test'])[2]")
	private WebElement Continueposttestbutton;

	@FindBy(how = How.XPATH, using = "(//input[@id='15463_16675'])[1]")
	private WebElement PosttestAnswer1;

	@FindBy(how = How.XPATH, using = "(//input[@id='15464_16681'])[1]")
	private WebElement PosttestAnswer2;

	@FindBy(how = How.XPATH, using = "(//input[@id='15465_16686'])[1]")
	private WebElement PosttestAnswer3;
	
	@FindBy(how = How.XPATH, using = "//*[@id='15465_16686']")
	private WebElement PosttestAnswer3_Prod;
	
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Password Required']")
	private WebElement pwdrequire;

	@FindBy(how = How.XPATH, using = "(//input[@id='useremail'])[1]")
	private WebElement EmailAddressxpath;

	@FindBy(how = How.XPATH, using = "(//input[@id='password'])[1]")
	private WebElement Passwordxpath;

	@FindBy(how = How.XPATH, using = "(//button[normalize-space()='Log In'])[1]")
	private WebElement Loginbtn;

	@FindBy(how = How.XPATH, using = "(//input[@id='26895_49263'])[1]")
	private WebElement EvalAnswer1;

	@FindBy(how = How.XPATH, using = "(//input[@value='121'])[1]")
	private WebElement EvalAnswer2;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28849][9470][ratinggroupid]'])[1]")
	private WebElement EvalAnswer3_01;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28849][9471][ratinggroupid]'])[1]")
	private WebElement EvalAnswer3_02;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28849][9472][ratinggroupid]'])[1]")
	private WebElement EvalAnswer3_03;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9473][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_01;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9474][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_02;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9475][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_03;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9476][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_04;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9477][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_05;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9478][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_06;

	@FindBy(how = How.XPATH, using = "(//input[@name='forms[28850][9479][ratinggroupid]'])[1]")
	private WebElement EvalAnswer4_07;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26907'])[1]")
	private WebElement EvalAnswer5;

	@FindBy(how = How.XPATH, using = "(//input[@id='26908_49264'])[1]")
	private WebElement EvalAnswer6;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26909'])[1]")
	private WebElement EvalAnswer7;

	@FindBy(how = How.XPATH, using = "(//input[@id='26910_49266'])[1]")
	private WebElement EvalAnswer8;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26911'])[1]")
	private WebElement EvalAnswer9;

	@FindBy(how = How.XPATH, using = "(//input[@id='26912_49269'])[1]")
	private WebElement EvalAnswer10;

	@FindBy(how = How.XPATH, using = "(//input[@id='26913'])[1]")
	private WebElement EvalAnswer11;

	@FindBy(how = How.XPATH, using = "(//input[@id='26914_49273'])[1]")
	private WebElement EvalAnswer12;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26915'])[1]")
	private WebElement EvalAnswer13;

	@FindBy(how = How.XPATH, using = "(//input[@id='26916_49275'])[1]")
	private WebElement EvalAnswer14;

	@FindBy(how = How.XPATH, using = "(//input[@id='26917_49277'])[1]")
	private WebElement EvalAnswer15;

	@FindBy(how = How.XPATH, using = "(//input[@id='26918_49280'])[1]")
	private WebElement EvalAnswer16;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26919'])[1]")
	private WebElement EvalAnswer17;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26920'])[1]")
	private WebElement EvalAnswer18;

	@FindBy(how = How.XPATH, using = "(//textarea[@id='26921'])[1]")
	private WebElement EvalAnswer19;

	@FindBy(how = How.XPATH, using = "(//input[@id='26922_49288'])[1]")
	private WebElement EvalAnswer20;

	@FindBy(how = How.XPATH, using = "//*[@id='nxtbtn']")
	private WebElement SubmitEvaluation1;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='CONGRATULATIONS']")
	private WebElement CongratulationsScreen1;
	
	@FindBy(how = How.XPATH, using = "(//label[@class='first_last'])[2]")
	private WebElement Profile;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='dropdown-item logout hdercls'])[1]")
	private WebElement logout;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public SoftLoginMultiMedia(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void watchvideo() {
		selUtil.hardWait(10);
		js.executeScript("window.scrollBy(0,570)");

		// Switch to Frame using id
		driver.switchTo().frame(iframe1);

		//UAT Steps
		/*
		 * // Collapse the Parts 1-10 tab selUtil.hardWait(10); String name =
		 * Chapters1_10.getText(); System.out.println("User is clicked on " + name);
		 * Chapters1_10.click();
		 * 
		 * // Expands the tab "Parts 11-17" selUtil.hardWait(10); String name1 =
		 * Chapters_11.getText(); System.out.println("User is clicked on " + name1);
		 * Chapters_11.click();
		 */

		
		//Poduction steps
		selUtil.hardWait(10);
		String name1 = Chapters1_10_Prod.getText();
		System.out.println("User is clicked on " + name1);
		Chapters1_10_Prod.click();
		
		// Expands the tab "Parts 11-17"
		selUtil.hardWait(10);
		String name2 = Chapters_11.getText();
		System.out.println("User is clicked on " + name2);
		Chapters_11.click();
		selUtil.hardWait(10);
		Clip9_Prod.click();

		// Click on last chapter
		//uat
//		selUtil.hardWait(10);
//		String name2 = Chapter17_Clip9.getText();
//		System.out.println("User is clicked on " + name2);
//		Chapter17_Clip9.click();
//		
//		//prod
//		selUtil.hardWait(10);
//		String name2 = Chapter17_Clip9_prod.getText();
//		System.out.println("User is clicked on " + name2);
//		Chapter17_Clip9_prod.click();
//		//Clip9_Prod.click();
	}

	public void ClickOnContinueToPosttestbutton() {
		// Switch to defaultContent from iframe
		driver.switchTo().defaultContent();

		// Click on Continue to Post test button
		js.executeScript("window.scrollBy(0,500)");
		selUtil.hardWait(5);
		Continueposttestbutton.click();
		
		
	}

	public void PosttestAnswer() {
		driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,450)");
		selUtil.hardWait(15);
		PosttestAnswer1.click();

		js.executeScript("window.scrollBy(0,570)");
		selUtil.hardWait(5);
		PosttestAnswer2.click();
		selUtil.hardWait(5);
		js.executeScript("window.scrollBy(0,640)");
		//PosttestAnswer3.click();
		selUtil.hardWait(5);
		//PosttestAnswer3_Prod.click();
		js.executeScript("arguments[0].click();", PosttestAnswer3_Prod);
		selUtil.hardWait(5);
	}

	public void PasswordBanner(String ExpectedLoginTitle, String EmailAddress, String Password) {
		String ActualLoginTitle = pwdrequire.getText();
		Assert.assertEquals(ActualLoginTitle, ExpectedLoginTitle);
		System.out.println("Header found on login page is  " + ExpectedLoginTitle);

		// login to application
		js.executeScript("window.scrollBy(0,350)");
		// EmailAddressxpath.sendKeys(EmailAddress);
		Passwordxpath.sendKeys(Password);
		selUtil.hardWait(5);
		Loginbtn.click();
	}

	public void EvaAnswer() {

		js.executeScript("arguments[0].click();", EvalAnswer1);

		js.executeScript("arguments[0].click();", EvalAnswer2);

		js.executeScript("arguments[0].click();", EvalAnswer3_01);

		js.executeScript("arguments[0].click();", EvalAnswer3_02);

		js.executeScript("arguments[0].click();", EvalAnswer3_03);

		js.executeScript("arguments[0].click();", EvalAnswer4_01);

		js.executeScript("arguments[0].click();", EvalAnswer4_02);

		js.executeScript("arguments[0].click();", EvalAnswer4_03);

		js.executeScript("arguments[0].click();", EvalAnswer4_04);

		js.executeScript("arguments[0].click();", EvalAnswer4_05);

		js.executeScript("arguments[0].click();", EvalAnswer4_06);

		js.executeScript("arguments[0].click();", EvalAnswer4_07);

		EvalAnswer5.sendKeys("123");

		js.executeScript("arguments[0].click();", EvalAnswer6);

		EvalAnswer7.sendKeys("NA");

		js.executeScript("arguments[0].click();", EvalAnswer8);

		EvalAnswer9.sendKeys("test");

		js.executeScript("arguments[0].click();", EvalAnswer10);

		EvalAnswer11.sendKeys("89");

		js.executeScript("arguments[0].click();", EvalAnswer12);

		EvalAnswer13.sendKeys("test");

		js.executeScript("arguments[0].click();", EvalAnswer14);

		js.executeScript("arguments[0].click();", EvalAnswer15);

		js.executeScript("arguments[0].click();", EvalAnswer16);

		EvalAnswer17.sendKeys("test");
		EvalAnswer18.sendKeys("test");
		EvalAnswer19.sendKeys("test");

		js.executeScript("arguments[0].click();", EvalAnswer20);
		js.executeScript("window.scrollBy(0,2300)");
	}

	public void clickSubmitEvaluation1() {
		selUtil.hardWait(7);
		js.executeScript("arguments[0].click();", SubmitEvaluation1);
	}
	
	public void VerifyCongratulationsScreen1() {
		selUtil.hardWait(15);
		js.executeScript("window.scrollBy(0,560)");
		String ActualText = CongratulationsScreen1.getText();
		String ExpectedText= "CONGRATULATIONS";
		Assert.assertEquals(ActualText, ExpectedText);
	}

	public void logout() {
		selUtil.hardWait(5);
		js.executeScript("arguments[0].click();", Profile);
		js.executeScript("arguments[0].click();", logout);
	}
}