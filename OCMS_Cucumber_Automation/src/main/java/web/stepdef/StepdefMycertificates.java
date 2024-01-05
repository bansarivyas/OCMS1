package web.stepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefMycertificates extends BaseClass {
	
	
	@Given("user enter the {string} using {string} {string}")
	public void i_entered_a_using(String url , String username, String password) throws InterruptedException {
		driver.get(url);
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block'][normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@When("User Click on myprofile")
	public void user_click_on_myprofile() {
		//driver.findElement(By.xpath("/html//div[@id='navbarNav']//button[@type='button']//a[@href='https://uat.proce.com/profile']/img[@alt='Hiratest kumar']")).click();
		//driver.findElement(By.xpath("/html//div[@id='navbarNav']//button[@type='button']//a[@href='https://uat.proce.com/profile']/img[@alt='Hiratesttest kumar']")).click();
		//driver.findElement(By.xpath("//a[@href='https://uat.proce.com/profile']//img[@class='profileimgcls']")).click();
		driver.findElement(By.xpath("//a[@href='https://proce.com/profile']//img[@class='profileimgcls']")).click();
	    
		
		
	}

	@And("locate Mycertificates")
	public void locate_mycertificates() {
		//driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://uat.proce.com/profile/my-certificates']")).click();
		driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://proce.com/profile/my-certificates']")).click();
	    
	}

	@Then("Verify the certificate is prasent or not")
	public void verify_the_certificate_is_prasent_or_not() {
		 WebElement  Mycertificates = driver.findElement(By.xpath("/html//form[@id='filterform']/section/div[@class='container']/div[@class='mb-2']/div/div[@class='main-wrap']/div/div[3]/div/div[2]/div/div[1]/div/div/div[1]/div/div/p"));
			    	//        Assert.assertTrue(Mycertificates, )
		Assert.assertEquals(Mycertificates.isDisplayed(),true); 
	//driver.findElement(By.xpath("//a[@href='https://uat.proce.com/profile']//img[@class='profileimgcls']")).click();
	driver.findElement(By.xpath("//a[@href='https://proce.com/profile']//img[@class='profileimgcls']")).click();
    //driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://uat.proce.com/logout']")).click();
    driver.findElement(By.xpath("/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://proce.com/logout']")).click();
		
	       
	        
	      // WebElement  Mycertificates = driver.findElement(By.xpath(//*[@id=\\\"filterform\\\"]/section/div/div/div/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div/div[1]/div/div/p/a\"));
	    	//        Assert.assertTrue(Mycertificates, )
	        
	        
	      //*[@id="filterform"]/section/div/div/div/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div/div[1]/div/div/p/a
	
	}




}
