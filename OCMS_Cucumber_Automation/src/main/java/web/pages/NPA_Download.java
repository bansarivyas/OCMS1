package web.pages;



import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import web.stepdef.BaseClass;

public class NPA_Download extends BaseClass {

	@FindBy(how = How.XPATH, using = "//input[@id='titlesearch']")
	private WebElement Search_activity;

	@FindBy(how = How.XPATH, using = "//img[@alt='AutomationSanity_Advances in Chronic Lymphocytic Leukemia Care: A Master Class for the Community Multidisciplinary Team']")
	private WebElement Activityclick;
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Copy_334_Slideset: Pharmacotherapy of Major Depres')]")
	private WebElement Activityclick_prod;

	@FindBy(how = How.XPATH, using = "//img[@alt='GLP-1 RAs: What You Need to Know']")
	private WebElement Activityclick1;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='Continue Activity' or normalize-space(text())='Download SlideSet']")
	private WebElement BeginActivitybtn;

	@FindBy(how = How.XPATH, using = "//a[@id='downloadContent']")
	private WebElement DownloadSlidesetbtn;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Download SlideSet']")
	private WebElement DownloadSlidesetbtn_prod;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Download PDF']")
	private WebElement DownloadPDFbtn;

	@FindBy(how = How.XPATH, using = "//*[@id='User_Journey']/div/div/div[1]/button")
	private WebElement Cancelbutton;

	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='AutomationSanity_Advances in Chronic Lymphocytic Leukemia Care: A Master Class for the Community Multidisciplinary Team']")
	private WebElement ActualActivityTitle;

	@FindBy(how = How.XPATH, using = "//h1[@id='pageHeading']")
	private WebElement ActualHeading;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Continue Activity']")
	private WebElement Continuebutton;

	@FindBy(how = How.XPATH, using = "//input[@id='1366_2190']")
	private WebElement Answer1;

	@FindBy(how = How.XPATH, using = "//input[@id='1367_2193']")
	private WebElement Answer2;

	@FindBy(how = How.XPATH, using = "//input[@id='1368_2197']")
	private WebElement Answer3;

	@FindBy(how = How.XPATH, using = "//input[@id='42114_94999']")
	private WebElement Answer4;

	@FindBy(how = How.XPATH, using = "//*[@id='downloadContent']")
	private WebElement DownloadSlideset;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Download PDF']")
	private WebElement DownloadPDFfile;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public NPA_Download(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// SlideSet Code
	public void Search_actvity() {
		//UAT_Search_activity.sendKeys("AutomationSanity_Advances in Chronic Lymphocytic Leukemia Care: A Master Class for the Community Multidisciplinary Team");
		
		//Prod activity
		Search_activity.sendKeys("Automation_Sanity_Copy_334_Slides: Pharmacotherapy of Major Depression");
		
		selUtil.hardWait(3);
		Search_activity.sendKeys(Keys.ENTER);
	}

	public void SlideSet_learnmore_button() {
		selUtil.hardWait(10);
		//Prod
		js.executeScript("window.scrollBy(0,750)");
		
		//Activityclick.click();
		selUtil.hardWait(10);
		js.executeScript("arguments[0].click();",Activityclick_prod);
//		Activityclick_prod.click();
	}

	public void Beginactivity() {
		//prod
		BeginActivitybtn.click();
	}
	
	public void DownloadslidesetProd() {
		//prod
		DownloadSlidesetbtn_prod.click();
		//uat
		//DownloadSlidesetbtn.click();
	}

	public void CancelButton() {
		selUtil.hardWait(15);
		Cancelbutton.click();
	}

	public void verify_activityTitle(String Exp_Heading) {
		selUtil.hardWait(5);
		String actualHeading = ActualHeading.getText();
		Assert.assertEquals(actualHeading, Exp_Heading);
		System.out.println("Activity found as  " + actualHeading);
	}

//	public void continuebutton() {
//		Continuebutton.click();
//	}
//
//	public void select_answers_pretest_Slideset() {
//		selUtil.hardWait(10);
//		js.executeScript("window.scrollBy(0,500)");
//		selUtil.hardWait(10);
//		Answer1.click();
//		Answer2.click();
//
//		js.executeScript("window.scrollBy(0,600)");
//		selUtil.hardWait(10);
//		Answer3.click();
//		Answer4.click();
//	}

	public void download_slideset() {
		js.executeScript("window.scrollBy(0,300)");
		selUtil.hardWait(5);
		DownloadSlideset.click();
	}

	public void verify_slideset_downloaded() {
		selUtil.hardWait(10);
		String home = System.getProperty("user.home");
		String file_name = "MM16_Novel ART_Binkley 6.7.23.pptx";
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out.println("Function Name ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {
			System.out.println("PPT file is downloaded successfully and present on " + file_with_location);
		} 
		else {
			   System.out.println(file_with_location + " is not present");
			 }
		
		System.out.println("");
	}

	
	
	
	// DownloadPDF Code
	public void Search_actvity_new() {
		Search_activity.sendKeys("What You Need to Know About GLP-1 Receptor Agonists");
		Search_activity.sendKeys(Keys.ENTER);
	}

	public void PDF_learnmore_button() {
		selUtil.hardWait(5);
		Activityclick1.click();
	}

	public void ClickonDownloadPDF() {
		DownloadPDFbtn.click();
	}

	public void verify_Heading_on_Activity_listing_Page(String exp_Heading) {
		selUtil.hardWait(5);
		String actualHeading = ActualHeading.getText();
		Assert.assertEquals(actualHeading, exp_Heading);
		System.out.println("Heading is displaying on listing page as  " + actualHeading);
	}

//	public void select_answers_pretest_PDF() {
//		selUtil.hardWait(10);
//		js.executeScript("window.scrollBy(0,500)");
//		selUtil.hardWait(10);
//		Answer1.click();
//		Answer2.click();
//
//		js.executeScript("window.scrollBy(0,600)");
//		selUtil.hardWait(10);
//		Answer3.click();
//		Answer4.click();
//	}

	public void download_PDF() {
		js.executeScript("window.scrollBy(0,500)");
		selUtil.hardWait(5);
		DownloadPDFfile.click();
	}

	public void verify_PDF_downloaded() {
		selUtil.hardWait(10);
		String home = System.getProperty("user.home");
		String file_name = "wk252_end-glp-ra_infographic-patient.pdf";
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out.println("Function Name ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {
			System.out.println("PDF file is downloaded successfully and present  on " +file_with_location);
		} 
		else {
			   System.out.println(file_with_location + " is not present");
			 }
	}

	
}