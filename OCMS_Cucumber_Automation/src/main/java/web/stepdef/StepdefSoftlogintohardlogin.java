package web.stepdef;



import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.HomeloginPage;
import web.pages.SoftLoginForHardLoginUser;



public class StepdefSoftlogintohardlogin extends BaseClass {
	
	 String HomepageTitle = "HOME";

	@Given("user login to website by using {string} and {string}")
	public void user_login_to_website_by_using_and(String Uname, String Pword) {
		
		driver.get("https://test.clinicaloptions.com/");
	
		SoftLoginForHardLoginUser.clickOnLogin();
		SoftLoginForHardLoginUser.sendUnamePword(Uname, Pword);
		SoftLoginForHardLoginUser.VerifyHomePage(HomepageTitle);
		
	}

	@When("user hit Soft login {string},user redirects to an activity")
	public void user_hit_soft_login_user_redirects_to_an_activity(String Url) {
		
		driver.get("https://test.clinicaloptions.com/");
		selUtil.hardWait(3);
		driver.getCurrentUrl();
		
	}

	@Then("user  {string} override the Soft Login user")
	public void user_override_the_soft_login_user(String Hard_LoggedIn_User) {
		
		
		
		SoftLoginForHardLoginUser.clickonMyProfile();
		SoftLoginMyProfile.clickMyProfile();
		selUtil.hardWait(10);
		SoftLoginForHardLoginUser.verifyHardLoggedInUser(Hard_LoggedIn_User);
		
		driver.navigate().refresh();
		slisetfunc.ProCELogoutFunc();
		
	}

}
