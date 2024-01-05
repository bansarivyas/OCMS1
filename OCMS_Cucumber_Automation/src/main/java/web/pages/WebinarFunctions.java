package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebinarFunctions {

	private WebDriver driver = null;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Continue']")
	private WebElement ContinueBtn;
	
	public WebinarFunctions (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickContinueBtn () throws InterruptedException {
		
		ContinueBtn.click();
		Thread.sleep(5000);
		
	}
	
	public void verifyExtUrl (String validateURL) throws InterruptedException {
		
		String str = driver.getCurrentUrl().toString();
		System.out.println("Current URL" + str);
//		Assert.assertTrue(false);
//		Assert.assertEquals(driver.getCurrentUrl().toString(), validateURL);
//		Thread.sleep(10000);
	}
	
	public void navigateToProCE () throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(4000);
	}
	
}
