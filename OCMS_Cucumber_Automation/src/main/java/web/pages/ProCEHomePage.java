package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import web.stepdef.BaseClass;

public class ProCEHomePage extends BaseClass {
	
	//Storing all locators
	@FindBy(how = How.XPATH, using = "//*[@id='navbarNav']/ul/li[2]/a")
	private WebElement Activities;
	
	@FindBy(how = How.XPATH, using = "(//a[normalize-space()='ACTIVITIES'])[1]")
	private WebElement Activities_Prod;
	
	//HomePage initialization
	public ProCEHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Creating a functions
	public void ClickActivities()
	{
		//driver.navigate().refresh();
		Activities_Prod.click();	
	}
	
	public void loginheader()
	{
		driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary mt-0 rounded-pill hdercls']")).click();
		String username="shweta.sonar+testing4@extentia.com";
		String password="Pass@1234";
		proceactiviesPage.Login(username,password);
		driver.findElement(By.xpath("(//label[@class='first_last'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-item logout hdercls'])[1]")).click();
	}
	
}