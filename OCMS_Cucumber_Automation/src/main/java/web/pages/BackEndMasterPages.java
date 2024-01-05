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

public class BackEndMasterPages {
	WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement Search;

	@FindBy(xpath = "//small[text()='Honest and Confident Patient-Provider Relationships']")
	WebElement TheExchangeSearchString;
	
	@FindBy(xpath = "//td[text()='Preventive Medicine']")
	WebElement catagorySearch;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement uname;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passw;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SignIn;
	
	

	public BackEndMasterPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void masterControllerLogin(String username, String password) {
		uname.sendKeys(username);
		passw.sendKeys(password);
		SignIn.click();
		

	}

	public void theSearchFunction(String stringSearch) throws InterruptedException {
		
			
		Search.sendKeys(stringSearch);	
		
	}
	
	public void verifySearchedString(String expectedString) {
		
		
		String actualString = TheExchangeSearchString.getText();
		Assert.assertEquals(actualString, expectedString);
		System.out.println("String Title is  " + actualString);
	}
    public void verifySearcheCategorydString(String expectedCategoryString) {
		
		
		String actualCategoryString = catagorySearch.getText();
		Assert.assertEquals(actualCategoryString, expectedCategoryString);
		System.out.println("String Title is  " + actualCategoryString);
	}
	
	
}
