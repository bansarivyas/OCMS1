package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SlidesetFunction {
	
	private WebDriver driver = null;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Download SlideSet']")
	private WebElement DownloadSlisesetBtn;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")
	private WebElement UserProfile;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Subscriptions']//following::*[normalize-space(text())='Logout'])[1]")
	private WebElement ProCELogout;
	
	public SlidesetFunction (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickDownloadSlisesetBtn ()
	{
		DownloadSlisesetBtn.click();
		
	}
	
	public void ProCELogoutFunc ()
	{
		UserProfile.click();
		
		ProCELogout.click();
	}

}
