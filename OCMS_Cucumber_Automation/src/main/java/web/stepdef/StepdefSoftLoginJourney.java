package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefSoftLoginJourney extends BaseClass {

	@Given("I navigate to the application {string}")
	public void i_navigate_to_the_application(String Softurl) {
		driver.get(Softurl);
	}
	
	@When("I clicks on Begin Activity button")
	public void i_clicks_on_begin_activity_button() {
		softloginjourneypage.ClickOnBeginbtn();
	}
	
	@When("I select all answers for Pretest Question")
	public void i_select_all_answers_for_pretest_question() {
		
		proceactiviesPage.pretestquestion();
	}
	
	@When("I clicks on Continue activity button")
	public void i_clicks_on_continue_activity_button() {
		softloginjourneypage.Continuebtn();
	}
	
	@When("I clicks on Continue activity button on popup")
	public void i_clicks_on_continue_activity_button_on_popup() {
		proceactiviesPage.ContinueActivityPopup();
		System.out.println("Pretest TestCase is passed successfully");
	}
	
	@When("I clicks on Continue to Post test button")
	public void i_clicks_on_continue_to_post_test_button() {
		proceactiviesPage.ContinuePosttestbtn();
	}
	
	@When("I select all answers for posttest question")
	public void i_select_all_answers_for_posttest_question() {
		proceactiviesPage.Selectanswersforposttest();
	}
	
	@When("I clicks on continue to evaluation button")
	public void i_clicks_on_continue_to_evaluation_button() throws InterruptedException {
		Thread.sleep(5000);
		proceactiviesPage.clickOnContinueEvaluation();
	}
	
	@When("Again I clicks on continue to evaluation button on popup")
	public void again_i_clicks_on_continue_to_evaluation_button_on_popup() {
		proceactiviesPage.clickOnContinueEvaluationPopup();
	}
	
	@Then("I am able to see the password banner page {string}")
	public void i_am_able_to_see_the_password_banner_page(String ExpectedLoginTitle) {
		proceactiviesPage.VerifyTitleOnLogin(ExpectedLoginTitle);
	}
	
	@Then("The evaluation popup should be displayed")
	public void the_evaluation_popup_should_be_displayed() {
		proceactiviesPage.EvaluationScreenPopup();
	}
	
	@Then("I clicks on the ContinuetoEvaluation button")
	public void i_clicks_on_the_continueto_evaluation_button() throws InterruptedException {
		proceactiviesPage.evaluationPopup();
	}
	
	@Then("I select all answer for evaluation question")
	public void i_select_all_answer_for_evaluation_question() {
		proceactiviesPage.evaluationAnswers();
	}
	
	@Then("I clicks on the SubmitEvaluation button")
	public void i_clicks_on_the_submit_evaluation_button() {
		proceactiviesPage.clickSubmitEvaluation();
	}
	
	@Then("The activity is completed and certificate should be genearate")
	public void the_activity_is_completed_and_certificate_should_be_genearate() throws Exception {
		proceactiviesPage.VerifyCongratulationsScreen();
		System.out.println("Certificate is generated successfully");
		selUtil.takeSnapShot(driver, "SoftLoginPrePostTest_GenerateCertificate");
		slisetfunc.ProCELogoutFunc();
	}
	
	
	
	
	//////SoftloginLiveEvents//////////////
	
	@Given("I Login to the {string}")
	public void i_login_to_the(String URL) {
	   driver.get(URL);
	}
	
	@When("I clicks on Live Events")
	public void i_clicks_on_live_events() {
	    softloginjourneypage.Livevents();
	}
		
	
	@When("I click on register button")
	public void i_click_on_register_button() {
	    softloginjourneypage.Registerevent();
	}
	
	@When("I click on Confirm and Register {string}")
	public void i_click_on_confirm_and_register(String PopTitle) {
	    softloginjourneypage.Confirmandregisterpopup(PopTitle);
	}
	
	@When("I click on continue button")
	public void i_click_on_continue_button() {
	    softloginjourneypage.Continueclick();
	}
	
	@When("I click on Join Now button")
	public void i_click_on_join_now_button() {
	    softloginjourneypage.JoinNow();
	}
	
	@Then("I am able to see Welcome to the BroadcastMed Live Events Platform {string}")
	public void i_am_able_to_see_welcome_to_the_broadcast_med_live_events_platform(String Expectedwelcometext) {
	   softloginjourneypage.welcometext(Expectedwelcometext); 
	}
}