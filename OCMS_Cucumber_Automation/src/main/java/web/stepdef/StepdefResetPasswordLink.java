package web.stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.ResetPasswordLink;

public class StepdefResetPasswordLink extends BaseClass{
	

@Given("I Enter the {string}")
public void i_enter_the(String string) {
    driver.get(string);
}
@When("I click on the Forgot Password link")
public void i_click_on_the_forgot_password_link() {
    //driver.findElement(By.xpath("/html//form[@id='createlogin']//a[@href='https://uat.proce.com/forgotpassword']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
  
}
@And("enter email address {string}")
public void enter_email_address(String email) throws InterruptedException {
	//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hira.kumar@mailinator.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hira.kumar@mailinator.com ");
	
}
@And("click on the Reset Password button")
public void click_on_the_reset_password_button() {
	
	driver.findElement(By.xpath("//form[@id='forgotpasswordform']//button[@type='submit']")).click();
   
    //resetPasswordLink.verifyAlertMessage();
 
}
@Then("I should receive an email with instructions to reset my password")
public void i_should_receive_an_email_with_instructions_to_reset_my_password() {
	 //resetPasswordLink.verifyAlertMessage();
	
	driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp?to=hira.kumar");  
	/*driver.findElement(By.xpath("//html[@id='ng-app']//div[@id='inbox_pane']/div[3]//table/tbody/tr[1]/td[2]")).click();
	
	//driver.switchTo().frame("//iframe[@id='html_msg_body']");*/
	
	Assert.assertEquals(driver.findElements(By.xpath("(//*[normalize-space(text())='ProCE']//following-sibling::*[normalize-space(text())='Reset Your ProCE Password'])[1]")).size()>0,true);
	
}

@And("enter my email address {string}")
public void enter_i_email_address() {
    // Write code here that turns the phrase above into concrete actions
    
}
	
	

}
