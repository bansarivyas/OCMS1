package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Updateprofile {
	
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//a[@href='https://uat.proce.com/profile']//label[@class='first_last']//span[contains(text(),'HL')]")
	WebElement profile;
	
	@FindBy(xpath = "//a[@class='dropdown-item hdercls'][normalize-space()='My Profile']")
	WebElement myprofile;
	
	@FindBy(xpath = "//a[@title='Edit']")
	WebElement edit;


	@FindBy(xpath = "//input[@id='firstname']")
	WebElement updatefirstname;
	
	@FindBy(xpath = "//a[@class='btn btn-primary rounded-pill ms-3']")
	WebElement save;
	
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement confirm;
	
	@FindBy(xpath = "//a[@href='https://uat.proce.com/profile']//label[@class='first_last']//span[contains(text(),'HL')]")
	WebElement Profile;
	
	@FindBy(xpath = "//a[@class='dropdown-item logout hdercls']")
	WebElement logout;
	
	

	
	
	public Updateprofile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
