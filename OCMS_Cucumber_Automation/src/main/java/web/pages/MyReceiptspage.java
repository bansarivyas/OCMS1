package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyReceiptspage {

	// @FindBy(how = How.XPATH, using =
	// "//div[contains(@class,'collapse')]//img[@class='profileimgcls']")
	// private WebElement Profile;

	@FindBy(xpath = "//input[@id='useremail']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']\"))")
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	//@FindBy(how = How.XPATH, using = "//div[contains(@class,'collapse')]//img[@class='profileimgcls']")
	//WebElement Profile;
	
	//@FindBy(how = How.XPATH, using = "/html//div[@id='navbarNav']//button[@type='button']//a[@href='https://uat.proce.com/profile']/img[@alt='Hiratesttest kumar']")
	//WebElement Profile;
	
	//@FindBy(how = How.XPATH, using = "//a[@href='https://uat.proce.com/profile']//img[@class='profileimgcls']")
	@FindBy(how = How.XPATH, using = "//a[@href='https://proce.com/profile']//img[@class='profileimgcls']")
	WebElement Profile;
	
	
	

	@FindBy(xpath = "//a[@class='dropdown-item hdercls'][normalize-space()='My Receipts']")
	WebElement MyReceipts;

	@FindBy(xpath = "//div[@class='row']//div[1]//div[1]//div[5]//a[1]")
	WebElement viewreceipt;
	
	
	@FindBy(xpath= "/html//h5[@id='exampleModalLabel']") 
	WebElement Success_Message;
	
	
	
	

	public MyReceiptspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickonbutton() {
		Profile.click();
	}
	
	public void clickmyreceipt()
	{
		MyReceipts.click();
	}

	public void clickonviewreceipts() {
		viewreceipt.click();
		
		
	}
	public void verifymessage(String Expectedmessage) 
	{

		String actualSuccessMessage = Success_Message.getText();
		Assert.assertEquals(actualSuccessMessage, Expectedmessage);
		System.out.println("Message displayed as " + actualSuccessMessage);
	}
}
