package web.stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefMyreceipt extends BaseClass { 
	
	@Given("I entered a {string} using {string} {string}")
	public void i_entered_a_using(String url , String username, String password) throws InterruptedException {
		driver.get(url);
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block'][normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
	    
	}

	
	@When("Click on profile")
	public void click_on_profile() throws InterruptedException {
		myreceiptpage.clickonbutton();
	    
	}
	@When("My receipts")
	public void my_receipts() {
		
		
		myreceiptpage.clickmyreceipt();    
	}
	
	@Then("Click on view receipt details")
	public void click_on_view_receipt_details() throws InterruptedException {
		myreceiptpage.clickonviewreceipts();
		
		
		
		
	
		
		
		Thread.sleep(5);
		
	}
	
	@Then("View the message {string}")
	public void view_the_message(String Expectedmessage) throws InterruptedException {
		Thread.sleep(5);
		//myreceiptpage.verifymessage(Expectedmessage);
		//write here for the cancel code//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[@id='exampleModalLabel']/following-sibling::button")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@href='https://uat.proce.com/profile']//img[@class='profileimgcls']")).click();
		driver.findElement(By.xpath("//a[@href='https://proce.com/profile']//img[@class='profileimgcls']")).click();
		//driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://uat.proce.com/logout']")).click();
		driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://proce.com/logout']")).click();
		
		
	}
}

	

