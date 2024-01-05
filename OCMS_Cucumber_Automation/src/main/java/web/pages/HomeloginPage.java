package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeloginPage {
	
	static WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@type='email']")
	private static WebElement emailID;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "(//*[text()='Log In'])[2]")
	private static WebElement login;
	
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	private static WebElement loginButton;

	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Welcome, test data']")
	private static WebElement welcomeMessage;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Welcome']")
	private static WebElement usernameVerify;
	
	

	public HomeloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public static void enterEmailID(String email)
	{
	        emailID.sendKeys(email);
	}


	public static void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public static void clickLoginButton()
	{
		loginButton.click();
	}


	public static void clickOnLogin()
	{
        try {
			
			login.click();
		}
			catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", login);

		}
	}
	

	public static void see_Welcome_Username(String ExpectedUserMessage) {
		String actualTitlefield = welcomeMessage.getText();
		Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
		System.out.println("Message found as  " + actualTitlefield);
	}
}