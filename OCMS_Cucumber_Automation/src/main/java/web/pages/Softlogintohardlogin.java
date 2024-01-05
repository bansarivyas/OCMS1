package web.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Softlogintohardlogin {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@type='email']")
	
	WebElement Email;

	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;

	@FindBy(xpath = "//button[text()='Log In']")
	WebElement btn_login;
	
	@FindBy(xpath = "//a[text() ='HOME']")
	WebElement Homepage;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")
     WebElement UserProfile;
	
	@FindBy(xpath ="//p[text()='testra1@mailinator.com']")
	WebElement HardUserID;
	
	String str = "//p[text()='%s']";
	
	public Softlogintohardlogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public static void sendUnamePword(String Uname, String Pword) {
		
		
		System.out.println("User Logged in with the Email" +Uname);
	
		

	}
	
	public void VerifyHomePage(String ExpectedHomepagetab) {
		
		
		String Homepagetab = Homepage.getText();
		Assert.assertEquals(Homepagetab, ExpectedHomepagetab);
		System.out.println("I am on Home page and the title is " + Homepagetab);
	}
	

		public void clickonMyProfile()
		{
			
			UserProfile.click();
		}
	
    public void verifyHardLoggedInUser(String ExpectedHardUserID)
    {
   
    	
    	String ActualUserIDHardUser = driver.findElement(By.xpath(String.format(str, ExpectedHardUserID))).getText();
		Assert.assertEquals(ActualUserIDHardUser, ExpectedHardUserID);
		System.out.println("I am Logged in with user " + ExpectedHardUserID);
    	
    }

}

