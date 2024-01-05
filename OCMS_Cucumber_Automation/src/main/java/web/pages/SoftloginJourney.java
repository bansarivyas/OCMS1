package web.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import web.stepdef.BaseClass;

public class SoftloginJourney extends BaseClass{
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='LIVE EVENTS']")
	private WebElement liveevents;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Register for Virtual Event']")
	private WebElement registereventbtn;
	
//	@FindBy(how = How.XPATH, using = "//h4[normalize-space()='Confirm Registration Information']")
//	private WebElement popuptitle1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='submit-event-register']")
	private WebElement confirmandregisterbtn;
	
	@FindBy(how = How.XPATH, using = "//a[@class='submtng-btn rgstrn-btn float-end']")
	private WebElement continuebtn;
	
	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='Join Now'])[1]")
	private WebElement Joinnowbtn;
	
	@FindBy(how = How.XPATH, using = "//div[normalize-space()='Welcome to the BroadcastMed Live Events Platform']")
	private WebElement Welcometext;
	
	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='Continue Activity' or normalize-space(text())='View Activity']")
	private WebElement Beginbtn;
	
	@FindBy(how = How.XPATH, using = "(//a[@id='nxtbtn'])[2]")
	private WebElement Continuebutton;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public SoftloginJourney(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnBeginbtn() {
		// Calling Javscript function for scroll
		js.executeScript("window.scrollBy(0,400)");
		selUtil.hardWait(10);
		Beginbtn.click();
	}
	
	
	public void Continuebtn() {
		selUtil.hardWait(10);
		Continuebutton.click();	
	}
	
	public void Livevents()
	{
		liveevents.click();
	}
	
	public void Registerevent()
	{
		js.executeScript("window.scrollBy(0,610)");
		selUtil.hardWait(10);
//		registereventbtn.click();
		driver.navigate().refresh();
		js.executeScript("arguments[0].click();",registereventbtn);
	}
	
	public void Confirmandregisterpopup(String PopTitle)
	{
//		String actualpopupTitle = popuptitle1.getText();
//		Assert.assertEquals(actualpopupTitle, PopTitle);
//		System.out.println("PopTitle found as  " + actualpopupTitle);
		selUtil.hardWait(10);
		confirmandregisterbtn.click();
	}
	
	public void Continueclick()
	{
		continuebtn.click();
	}
	
	public void JoinNow()
	{
		js.executeScript("window.scrollBy(0,500)");
		selUtil.hardWait(10);
		Joinnowbtn.click();
	}
	
	public void welcometext(String Expectedwelcometext)
	{
		//selUtil.hardWait(15);
		//ArrayList<String> newTab= new ArrayList<String> (driver.getWindowHandles());
		//driver.switchTo().window(newTab.get(1));
		selUtil.hardWait(10);
		String actualwelcometext = Welcometext.getText();
		Assert.assertEquals(actualwelcometext, Expectedwelcometext);
		System.out.println("Welcometext found as  " + actualwelcometext);
	}


}
