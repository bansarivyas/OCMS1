package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SoftLoginPaidActivity {
	
	WebDriver driver;
	
	@FindBy(xpath ="//button[@class=\"accordion-button collapsed\"]")
	WebElement FilterCost;
	
	@FindBy(xpath ="//input[@value=\"paid\"]")
	WebElement PaidCheckbox;
	
	@FindBy(xpath="//a[text()=\"Enroll Now \"]")
	WebElement EnrollNow;
	
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement btn_login;
	
	@FindBy(xpath ="//h4[text()=\"Checkout\"]")
	WebElement paymentDetail;
	
	public SoftLoginPaidActivity(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void clickOnCostFilter()
	{
		
		FilterCost.click();
		PaidCheckbox.click();
	}
	
	public void ClickOnEnrollNow()
	{
		
		EnrollNow.click();
	}

	
	public void EnterCredentials(String Username ,String Password)
	{
	
		//Email.sendKeys(Username);
		pass.sendKeys(Password);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn_login);
		//btn_login.click();
	}
	
	public void VerifyPaymentDetailPage(String expctedPaymentDetailTitle)
	{
		String actualPaymentDetailTitle = paymentDetail.getText();
		Assert.assertEquals(actualPaymentDetailTitle, expctedPaymentDetailTitle);
		System.out.println("Payment Chcekout Page Title is  " + actualPaymentDetailTitle);
		
	}
}
