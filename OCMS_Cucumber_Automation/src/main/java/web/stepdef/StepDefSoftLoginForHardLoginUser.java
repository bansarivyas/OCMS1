package web.stepdef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.SoftLoginForHardLoginUser;



public class StepDefSoftLoginForHardLoginUser extends BaseClass {
	
	 String HomepageTitle = "HOME";

	@Given("I login to website by using {string} and {string}")
	public void i_login_to_website_by_using_and(String Uname, String Pword) {
		
		driver.get("https://proce.com/login");
		
		SoftLoginForHardLoginUser.sendUnamePword(Uname, Pword);
		SoftLoginForHardLoginUser.VerifyHomePage(HomepageTitle);
		
	}

	@When("I hit Soft login {string},I redirects to an activity")
	public void i_hit_soft_login_i_redirects_to_an_activity(String Url) {
		
		driver.get(Url);
		selUtil.hardWait(3);
		driver.getCurrentUrl();
		
	}

	@Then("I am {string} override the Soft Login user")
	public void i_am_override_the_soft_login_user(String Hard_LoggedIn_User) {
		
		
		
		SoftLoginForHardLoginUser.clickonMyProfile();
		SoftLoginMyProfile.clickMyProfile();
		selUtil.hardWait(10);
		SoftLoginForHardLoginUser.verifyHardLoggedInUser(Hard_LoggedIn_User);
		
		driver.navigate().refresh();
		slisetfunc.ProCELogoutFunc();
		
	}

}
