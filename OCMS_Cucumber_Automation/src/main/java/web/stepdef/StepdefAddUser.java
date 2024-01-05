package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepdefAddUser extends BaseClass {
	
	@Given("I login in to {string} using {string} {string}")
	public void _login_in_to_using(String url, String username, String password) {
//		driver.get(url);
//		loginPage.enterEmailID(username);
//		loginPage.enterPassword(password);
//		loginPage.clickOnSignIn();
		System.out.println("Second test case started");
	}
		
	@Then("I Click on Users")
	public void i_click_on_users()
	{
		adduserpage.ClickUsers();
	}
	
	
	@Then("I Click on create")
	public void i_click_on_create()
	{
		adduserpage.createButton();
	}
	
	@Then("I enter Lastname , Firstname, Email ID")
	public void i_enter_lastname_firstname_email_id() 
	{
	  adduserpage.Enterdetails();
	   
	}
	
	@Then("I Click on Save button")
	public void i_click_on_save_button() {
		adduserpage.ClickSave();
	}

	@Then("verify success message {string}")
	public void verify_success_message(String SuccessMessage) {
		adduserpage.Success(SuccessMessage);
	}
}
