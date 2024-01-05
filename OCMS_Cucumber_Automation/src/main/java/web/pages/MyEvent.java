package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import web.stepdef.BaseClass;


public class MyEvent  {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='useremail']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement btn_login;

	@FindBy(xpath = "//a[text()='LIVE EVENTS']")
	WebElement MyEventonHomePage;

	@FindBy(xpath = "//input[@placeholder='Search Topic']")
	WebElement SearchTopic;

	@FindBy(xpath = "(//i[@class='fa fa-search'])[1]")
	WebElement Search_click;

	@FindBy(xpath = "(//a[@href='https://uat.proce.com/events/2023-update-practical-case-studies-in-outpatient-covid-19-management/10187'])[6]")
	WebElement AutomationEventName;

	@FindBy(xpath = "//h1[text()='2023 Update: Practical Case Studies in Outpatient COVID-19 Management']")
	WebElement EventDetailTitle;
	
	@FindBy(xpath="//a[text()='Learn More']")
	WebElement ProdLearnMore;

	
	@FindBy(xpath = "//a[@onclick =\"viewmoreclick(32,'https://uat.proce.com/events/2023-update-practical-case-studies-in-outpatient-covid-19-management/Copy_281_2023-update-practical-case-studies-in-outpatient-covid-19-management/10187-10494',3,'Copy_281_2023-update-practical-case-studies-in-outpatient-covid-19-management',null)\"]")
	WebElement AllEventLearnMore;

	@FindBy(xpath = "//h1[text()='Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management']")
	WebElement EventName;

	@FindBy(xpath = "//a[text()='Register for Virtual Event ']")
	WebElement btn_RegisterVirtualEvent;

	@FindBy(xpath = "//button[text()='Confirm and Register']")
	WebElement btn_ConfirmRegistration;

	@FindBy(xpath = "//a[@class ='submtng-btn rgstrn-btn float-end']")
	WebElement btn_Continue;

	@FindBy(xpath = "(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")
	WebElement btn_editProfile;

	@FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
	WebElement Profile_MyEvents;

	@FindBy(xpath ="//p[text()='Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management']")
	WebElement EventTitle;

	@FindBy(xpath = "(//*[text()='Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management']//following::a[text()='Cancel Registration'])[1]")
	WebElement Cancel_Registration;

	@FindBy(xpath = "//button[@class='confirm']")
	public WebElement Cancel_Registration_ok;

	public MyEvent(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void sendEmailPassword(String email, String password) {
		Email.sendKeys(email);
		pass.sendKeys(password);
		btn_login.click();

	}

	public void clickonMyEvents() {
		MyEventonHomePage.click();
	//	SearchTopic.click();
	//	SearchTopic.sendKeys("2023 Update: Practical Case Studies in Outpatient COVID-19 Management");
	//	SearchTopic.sendKeys(Keys.ENTER);
	//	anonymoususer.globalSearchActivities(ActivityName);

	}

	public void clickonEvent()

	{
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(AutomationEventName));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AutomationEventName);

	}

	public void eventDetailsPageTitle(String expectedEventDeatilTitle) {

		
		
		String actualdeatilslEventTitle = EventDetailTitle.getText();
		Assert.assertEquals(actualdeatilslEventTitle, expectedEventDeatilTitle);
		System.out.println("Event Details Title is  " + actualdeatilslEventTitle);

	}

	public void eventPage() {
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(AllEventLearnMore));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", AllEventLearnMore);

	}

	public void eventsPageTitle(String expectedEventName) {

		String actualEventTitle = EventName.getText();
		Assert.assertEquals(actualEventTitle, expectedEventName);
		System.out.println("Event Details Title is  " + actualEventTitle);
	}

	public void registerVirtualEventClick() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0," + btn_ConfirmRegistration.getLocation() + ")");
		js.executeScript("arguments[0].click();", btn_RegisterVirtualEvent);
		
		//btn_RegisterVirtualEvent.click();

	}

	public void confirmRegistrationPopup() {

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(btn_ConfirmRegistration));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0," + btn_ConfirmRegistration.getLocation() + ")");
		js.executeScript("arguments[0].click();", btn_ConfirmRegistration);

		// btn_ConfirmRegistration.click();

	}

	public void confirmButtonOnThankyoupage()

	{

		btn_Continue.click();
	}

	public void editProfile() throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(btn_editProfile));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_editProfile);
		Thread.sleep(1000);
	}

	public void editMyEvents() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Profile_MyEvents);
		Thread.sleep(1000);
	}

	public void eventTitle(String expectedEventTitle) throws InterruptedException {

		String actualEventTitle = EventTitle.getText();
		Assert.assertEquals(actualEventTitle, expectedEventTitle);
		System.out.println("Event Details Title is  " + actualEventTitle);
		Thread.sleep(1000);

	}

	public void cancel_Registration() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Cancel_Registration));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Cancel_Registration);
      // Cancel_Registration.click();
		Thread.sleep(1000);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(Cancel_Registration_ok));
		
		js.executeScript("arguments[0].click();", Cancel_Registration_ok);
		
		Thread.sleep(1000);
		
		
	}
}
