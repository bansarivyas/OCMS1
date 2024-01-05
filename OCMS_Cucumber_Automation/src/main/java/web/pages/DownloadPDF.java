package web.pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadPDF {
	
	final String expectedFileName = "wk252_end-glp-ra_infographic-patient";
	final String downloadLocation = "C:\\Users\\Tanaya.jadhav\\git\\omni-channel-testing-automation\\OCMS Framework\\Downloads";


	//public static String File_path = "C:\\Users\\Tanaya.jadhav\\Downloads\\OCMS Framework\\OCMS Framework";

	WebDriver driver;
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement btn_login;

	@FindBy(xpath = "//a[text()='ACTIVITIES']")
	public 
	WebElement ActivitiesonHomePage;

	@FindBy(xpath = "(//input[@placeholder='Search Topic'])[2]")
	WebElement SearchTopic;
	
	
	@FindBy(xpath = "//a[text()='Learn More']")
	WebElement activityListingLearnMore;
	
	/*@FindBy(xpath ="//a[text()='Begin Activity ']")
	WebElement BeginActivity;*/

	/*@FindBy(xpath = "//a[@onclick=\"viewmoreclick(32,'https://uat.proce.com/CE-CME/diabetes/glp-1-ras-what-you-need-to-know/11713',21,'glp-1-ras-what-you-need-to-know',11713)\"]")
	WebElement activityListingLearnMore;*/

	/*
	 * @FindBy(xpath = "//a[text()='Download PDF']") 
	 * WebElement downloadPDFbutton;
	 * 
	 * @FindBy(xpath = "//a[text()='Review Activity']") 
	 * WebElement reviewActivity;
	 */

	@FindBy(xpath = "//a[text()='Review Activity' or //a[text()='Download PDF']]")
	public WebElement RevieworDownload;

	@FindBy(xpath = "//a[@class =\"begin-btn btn btn-primary px-5 rounded-pill mb-3\"]")
	WebElement downloadPDFInsideContentPage;

	public DownloadPDF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void sendEmailPassword(String email, String password) {

		Email.sendKeys(email);
		pass.sendKeys(password);
		btn_login.click();

	}

	public void clickonActivities() throws InterruptedException {

		ActivitiesonHomePage.click();
		SearchTopic.click();
		Thread.sleep(3000);
		SearchTopic.sendKeys("What You Need to Know About GLP-1 Receptor Agonists");
		SearchTopic.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	public void clickOnSearchedActivity() {
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(activityListingLearnMore));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", activityListingLearnMore);
		// activityListingLearnMore.click();
	}

	public void downloadPDFFile() {
		
		
		

		
		RevieworDownload.click();

//		if (downloadPDFInsideContentPage.isDisplayed()) {
//
//			downloadPDFInsideContentPage.click();
//
//		}

	}

	public void verifyDownloadedPDFFile() {
		
		String home = System.getProperty("user.home");
		String file_name = "wk252_end-glp-ra_infographic-patient.pdf";
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out.println("Function Name ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {

			System.out.println(file_with_location + " is present");

		} else {

			System.out.println(file_with_location + " is not present");

		}
		
		
			}
}
