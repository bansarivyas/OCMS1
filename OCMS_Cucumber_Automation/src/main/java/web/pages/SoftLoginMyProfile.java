package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SoftLoginMyProfile {
	WebDriver driver;
	
	@FindBy(xpath = "//div[contains(@class,'collapse')]//img[@class='profileimgcls']")
	WebElement btn_editProfile;

	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[1]")
	WebElement Profile_MyEvents;
	
	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[2]")
	WebElement Profile_CourseinProgress;
	
	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[3]")
	WebElement Profile_MyRecipts;
	
	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[4]")
	WebElement Profile_MyCertificates;
	
	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[5]")
	WebElement Profile_MySurveys;
	
	@FindBy(xpath = "(//a[@class =\"dropdown-item hdercls\"])[6]")
	WebElement Profile_MyProfile;
	
	@FindBy(xpath = "//a[@class =\"dropdown-item logout hdercls\"]")
	WebElement Profile_Logout;
	
	@FindBy(xpath = "//h3[text()='Password Required']")
	WebElement PasswordRequired;
	
	@FindBy(xpath="//h1[text()=' Log In To Your Account ']")
	WebElement HardLoginText;
	
	
	public SoftLoginMyProfile(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public void editProfile()

	{

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(btn_editProfile));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_editProfile);

	}
	
	public void verifyPasswordRequiredPage(String ExpectedBannerTitle)
	{
		
		String actualBannerTitle = PasswordRequired.getText();
		Assert.assertEquals(actualBannerTitle, ExpectedBannerTitle);
		System.out.println("On Hard Login page Title of Banner is " + ExpectedBannerTitle);
	}
	
	public void verifyHardLoginPage(String ExpectedHardLoginTitle)
	{
		
		String actualHardLoginTitle = HardLoginText.getText();
		Assert.assertEquals(actualHardLoginTitle, ExpectedHardLoginTitle);
		System.out.println("On Hard Login page Title of Banner is " + ExpectedHardLoginTitle);
	}
	
	public void clickMyEvents() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MyEvents);

	}
	
	public void clickCourseinProgress() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_CourseinProgress);

	}
	
	public void clickMyRecipts() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MyRecipts);

	}
	
	public void clickMyCertificates() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MyCertificates);

	}
	
	public void clickMySurveys() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MySurveys);

	}
	
	public void clickMyProfile() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MyProfile);

	}
	
	public void SoftLoginuserLogout ()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_Logout);
		
		
		
	}
}
