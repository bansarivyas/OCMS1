package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefNotAccessibleSoftLogin extends BaseClass {

	@Given("I hit Soft login {string}, and redirects to an activity")
	public void i_hit_soft_login_and_redirects_to_an_activity(String Url) {

		driver.get(Url);

	}

	@When("I click on My Event tab from my Profile list")
	public void i_click_on_my_event_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMyEvents();
		selUtil.hardWait(3);
	}

	@Then("I redirects to the Hard login page,with {string} on it")
	public void i_redirects_to_the_hard_login_page_with_on_it(String password_Required_banner) {

		SoftLoginMyProfile.verifyPasswordRequiredPage(password_Required_banner);
	}

	@When("I click on Course in progress tab from my Profile list")
	public void i_click_on_course_in_progress_tab_from_my_profile_list() {

		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickCourseinProgress();
		selUtil.hardWait(3);
	}

	@When("I click on MyCertificates tab from my Profile list")
	public void i_click_on_my_certificates_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMyCertificates();
		selUtil.hardWait(3);
	}

	@When("I click on MyRecipts tab from my Profile list")
	public void i_click_on_my_recipts_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMyRecipts();
		selUtil.hardWait(3);

	}

	@When("I click on MySurveys tab from my Profile list")
	public void i_click_on_my_surveys_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMySurveys();
		selUtil.hardWait(3);

	}

	@When("I click on MyProfile tab from my Profile list")
	public void i_click_on_my_profile_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMyProfile();
		selUtil.hardWait(3);
	}
	
	@When("I click on Logout tab from my Profile list")
	public void i_click_on_logout_tab_from_my_profile_list() {
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.SoftLoginuserLogout();
		selUtil.hardWait(3);
		
	   
	}
	@Then("I redirects to the {string} page")
	public void i_redirects_to_the_page(String Hard_login) {
		selUtil.hardWait(3);
		SoftLoginMyProfile.verifyHardLoginPage(Hard_login);
	}
}
