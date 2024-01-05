package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefUpdateProfile extends BaseClass {

	@Given("I entered {string} using {string} {string}")
	public void i_entered_using(String url, String username, String password) throws InterruptedException {

//		driver.get(url);
//		driver.findElement(By.xpath("//span[@class='d-none d-sm-block'][normalize-space()='Log In']")).click();
//		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(5000);
	}
	
	

	@When("Click on edit icon")
	public void click_on_edit_icon() throws InterruptedException {
//start here for update profile locator
		
		Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")));
//		driver.findElement(By.xpath("(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='dropdown-item hdercls'][normalize-space()='My Profile']")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
	}

	@When("Update any details")
	public void update_any_details() {
 //here write for first name locator
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("test");
	}

	@Then("Click on save button")
	public void click_on_save_button() {
		//here for save button locator 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='btn btn-primary rounded-pill ms-3']")));
		 
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();

	}

	@Then("verify the updated changes {string}")
	public void verify_the_updated_changes(String string) {
		//driver.findElement(By.xpath("//a[@class='btn btn-primary rounded-pill ms-3']")).click();
		
		driver.findElement(By.xpath("(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")).click();
		 driver.findElement(By.xpath("//a[@class='dropdown-item logout hdercls']")).click();

	}
}
