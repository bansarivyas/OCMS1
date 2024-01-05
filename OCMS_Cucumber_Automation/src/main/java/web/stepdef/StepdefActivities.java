package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepdefActivities extends BaseClass {
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='About Us']//following::button[@id='dropdownMenuButton1'])[1]")
	private WebElement UserProfile;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='About Us']//following::*[normalize-space(text())='Logout'])[1]")
	private WebElement CCOlogout;
	
	@Given("I user enter the {string} using {string} {string}")
	public void i_user_enter_the_using(String string, String string2, String string3) throws InterruptedException {
		
		driver.get(string);
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block'][normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string3);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	    
	}

	@When("I Click on Activities")
	public void i_click_on_activities() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
		//driver.findElement(By.id("86"))	.click();
		//*[@id="navbarNav"]/ul/li[2]/a
		//a[text()='ACTIVITIES']
	}

	@When("I Search for Particular Activity {string}")
	public void i_search_for_particular_activity(String searchText) {
		driver.findElement(By.xpath("//input[@id='titlesearch']")).sendKeys(searchText);
		driver.findElement(By.xpath("//div[@class='search-box actvty-srch']//i[@class='fa fa-search']")).click();
		
		
	    
	}

	@And("I Click on Learn more")
	public void i_click_on_learn_more() {
		//driver.findElement(By.linkText("Learn More")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");
		//driver.findElement(By.xpath("//a[@class='btn btn-primary rounded-pill list-btn']")).click();
		
		WebElement element = driver.findElement(By.linkText("Learn More"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		//WebElement element = driver.findElement(By.linkText("Learn More"));
				//JavascriptExecutor executor = (JavascriptExecutor)driver;
				//executor.executeScript("arguments[0].click();", element);
		
		//a[@class='btn btn-primary rounded-pill list-btn']
		
		
	  
	}

	@And("I navigate to Begin Activity page")
	public void i_navigate_to_begin_activity_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='btnurl']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[normalize-space(text())='About Us']//following::button[@id='dropdownMenuButton1'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='About Us']//following::*[normalize-space(text())='Logout'])[1]")).click();
//		UserProfile.click();
//		Thread.sleep(1000);
//		CCOlogout.click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@href='https://uat.clinicaloptions.com/profile']//label[@class='first_last']//span[contains(text(),'HK')]")).click();
		//driver.findElement(By.xpath("//a[@class='dropdown-item logout hdercls']")).click();
		
		
		//Boolean actual=driver.findElement(By.cssSelector("#playerIframe")).isDisplayed();
		//System.out.println("The value O wamt tp see"+actual);
		//Assert.assertTrue(actual);
		
		
		
		
	    
	}




}
