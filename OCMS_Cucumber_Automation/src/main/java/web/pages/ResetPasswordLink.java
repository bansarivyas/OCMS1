package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import web.stepdef.BaseClass;

public class ResetPasswordLink extends BaseClass {
		
	@FindBy(xpath = "/html//form[@id='createlogin']//a[@href='https://uat.proce.com/forgotpassword']")
	WebElement ForgotPassword;
	
	@FindBy(xpath = "/html//input[@id='email']")
	WebElement enteremailaddress;
	
	
	//verify succes mesasage
	@FindBy(xpath = "/html//input[@id='email']")
	WebElement successMessage;
	
	
	
	@FindBy(xpath = "//form[@id='forgotpasswordform']//button[@type='submit']")
	WebElement resetpasswordbutton;
	
	@FindBy(xpath = "//form[@id='forgotpasswordform']//button[@type='submit']")
	WebElement receiveanemailwithinstructions;
	
	
	@FindBy(xpath = "//form[@id='forgotpasswordform']/div[@class='alert alert-success']")
	WebElement successMsg;
	
	
	
	

public ResetPasswordLink(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void verifyAlertMessage() {
	successMsg.getText();
}

public static Object isDisplayed() {
	// TODO Auto-generated method stub
	return null;
}











}

