package web.stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefSoftLogin_Multimedia extends BaseClass {

	@Given("I navigate to Multimedia Activity page {string}")
	public void i_navigate_to_multimedia_activity_page(String MultiMediaSofturl) {
	driver.get(MultiMediaSofturl);		
	}

	@When("I click on the Begin Activity button")
	public void i_click_on_the_begin_activity_button() {
		proceactiviesPage.ContinueActivitybutton();
	}

	@When("I watch all video")
	public void i_watch_all_video() {
	softloginmultimedia.watchvideo();
	}
	
	@When("I click on the Continue to Post Test button")
	public void i_click_on_the_continue_to_post_test_button() {
	softloginmultimedia.ClickOnContinueToPosttestbutton();
	}

	@When("I select all the answers for posttest question")
	public void i_select_all_the_answers_for_posttest_question() {
		softloginmultimedia.PosttestAnswer();
	}

	@When("I click on the Continue to Evaluation button")
	public void i_click_on_the_continue_to_evaluation_button() {
		proceactiviesPage.clickOnContinueEvaluation();
	}

	@When("I click on Continue to Evaluation button on popup")
	public void i_click_on_continue_to_evaluation_button_on_popup() {
		proceactiviesPage.clickOnContinueEvaluationPopup();
	}

	@Then("I am able to see the password banner page {string} and enterdetails {string} {string}")
	public void i_am_able_to_see_the_password_banner_page_and_enterdetails(String ExpectedLoginTitle, String EmailAddress, String Password){
		softloginmultimedia.PasswordBanner(ExpectedLoginTitle, EmailAddress, Password);
	}

	@Then("I click on the Save & Continue to Evaluation button on evaluation popup")
	public void i_click_on_the_save_continue_to_evaluation_button_on_evaluation_popup() throws InterruptedException {
		proceactiviesPage.evaluationPopup();
	}

	@Then("I select all answer for the evaluation questions")
	public void i_select_all_answer_for_the_evaluation_questions() {
		softloginmultimedia.EvaAnswer();
	}

	@Then("I click on the Submit Evaluation button")
	public void i_click_on_the_submit_evaluation_button1() {
		softloginmultimedia.clickSubmitEvaluation1();
	}

	@Then("The activity is completed and certificate should be generated")
	public void the_activity_is_completed_and_certificate_should_be_generated() throws Exception {
		softloginmultimedia.VerifyCongratulationsScreen1();
		System.out.println("Certificate is generated successfully");
		selUtil.takeSnapShot(driver, "MultiMedia_GenerateCertificate");
		selUtil.hardWait(10);
		softloginmultimedia.logout();
	}
	
//	@Then(" I logout from the application")
//	public void i_logout_from_the_application()
//	{
//		proceactiviesPage.LogoutPCE();
//	}
	
}
