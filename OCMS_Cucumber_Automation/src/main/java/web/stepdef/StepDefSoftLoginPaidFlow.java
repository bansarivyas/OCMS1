package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefSoftLoginPaidFlow extends BaseClass {

	@Given("I hit Soft login {string}, and redirects to The activity")
	public void i_hit_soft_login_and_redirects_to_the_activity(String Url) {
		driver.get(Url);

	}

	@Given("i Click on Activity tab , and filter the paid activities")
	public void i_click_on_activity_tab_and_filter_the_paid_activities() {

		DownloadPDF.ActivitiesonHomePage.click();

	}

	@When("I select any paid activity and click on Enroll Now")
	public void i_select_any_paid_activity_and_click_on_enroll_now() {
		anonymoususer.globalSearchActivities(
				"The Evolving Value of a Laboratory - Stewardship Partnership: Cases in Susceptibility Testing, Rapid Diagnostics and More!");
		SoftLoginPaidActivity.ClickOnEnrollNow();

	}

	@Then("I redirects to the {string}")
	public void i_redirects_to_the(String string) {

		SoftLoginMyProfile.verifyPasswordRequiredPage(string);
	}

	@Then("I Enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		
		SoftLoginPaidActivity.EnterCredentials(string, string2);

	}

	@Then("i Redirected to {string}")
	public void i_redirected_to(String Payemt_Deatils_page) {
		
		SoftLoginPaidActivity.VerifyPaymentDetailPage(Payemt_Deatils_page);
		
		driver.navigate().refresh();
		slisetfunc.ProCELogoutFunc();

	}

}
