package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefNPA_Pretest extends BaseClass {

	@Given("I navigate to the {string}")
	public void i_navigate_to_the(String url) {
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get(url);
		
		SessionId s=((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session ID is: "+s);
		//procehomePage.loginheader();
		System.out.println("NPA Pretest is started");
	}

	@When("I click on the Activities Menu")
	public void i_click_on_the_activities_menu() {
		procehomePage.ClickActivities();
		proceactiviesPage.PretestActivitydetailpage();
	}

	@When("I am able to see {string} activity")
	public void i_am_able_to_see_activity(String Expectedactivity) {
		proceactiviesPage.Activitypage(Expectedactivity);
	}

	@When("I click on Begin Activity button")
	public void i_click_on_begin_activity_button() {
		proceactiviesPage.ContinueActivitybutton();
	}

	@Then("I am able to see NPA Popup {string}")
	public void i_am_able_to_see_npa_popup(String ExpectedNpaPopupTitle) throws InterruptedException {
		proceactiviesPage.Npapopup(ExpectedNpaPopupTitle);
	}

	@Then("I enter all the details {string} {string}")
	public void i_enter_all_the_details(String ExpectedDegree, String ExpectedMedicalSpeciality) {
		proceactiviesPage.Enterdetails(ExpectedDegree, ExpectedMedicalSpeciality);
	}

	@Then("I click on submit button")
	public void i_click_on_submit_button() throws Exception {
		proceactiviesPage.ClickonSubmit();
	}

	@Then("I select answers for Pretest Question")
	public void i_select_answers_for_pretest_question() {
		proceactiviesPage.pretestquestion();
	}

	@Then("I click on Continue activity button")
	public void i_click_on_continue_activity_button() {
		proceactiviesPage.ContinueActivitybtn1();
	}

	@Then("I click on Continue activity button on popup")
	public void i_click_on_continue_activity_button_on_popup() {
		proceactiviesPage.ContinueActivityPopup();
		System.out.println("Pretest TestCase is passed successfully");
	}

	@Then("I click on Continue to Post test button")
	public void i_click_on_continue_to_post_test_button() {	
		proceactiviesPage.ContinuePosttestbtn();
	}

	@Then("I select answers for posttest question")
	public void i_select_answers_for_posttest_question() {
		proceactiviesPage.Selectanswersforposttest();
	}

	@Then("I click on continue to evaluation button")
	public void i_click_on_continue_to_evaluation_button() throws InterruptedException {
		Thread.sleep(5000);
		proceactiviesPage.clickOnContinueEvaluation();
	}

	@Then("Again I click on continue to evaluation button on popup")
	public void again_i_click_on_continue_to_evaluation_button_on_popup() {
		proceactiviesPage.clickOnContinueEvaluationPopup();
	}

	@Then("I am able to see login page {string}")
	public void i_am_able_to_see_login_page(String ExpectedLoginTitle) {
		proceactiviesPage.VerifyTitleOnLogin(ExpectedLoginTitle);
	}

	@Then("Enter {string} and {string} and click on Login button")
	public void enter_and_and_click_on_login_button(String Username, String Password) throws InterruptedException {
		Thread.sleep(5000);
		proceactiviesPage.Login(Username, Password);
		Thread.sleep(5000);
	}

	@Then("The evaluation screen should be displayed with popup")
	public void the_evaluation_screen_should_be_displayed_with_popup() {
		proceactiviesPage.EvaluationScreenPopup();
	}

	@Then("I click on the ContinuetoEvaluation button")
	public void i_click_on_the_continueto_evaluation_button() throws InterruptedException {
		proceactiviesPage.evaluationPopup();
	}

	@Then("I answer Evaluation Question")
	public void i_answer_evaluation_question() {
		proceactiviesPage.evaluationAnswers();
	}

	@Then("I click on the SubmitEvaluation button")
	public void i_click_on_the_submit_evaluation_button() {
		proceactiviesPage.clickSubmitEvaluation();
	}

	@Then("The activity is completed and user navigated on Congratulations screen")
	public void the_activity_is_completed_and_user_navigated_on_congratulations_screen() {
		proceactiviesPage.VerifyCongratulationsScreen();
		System.out.println("Post-test and Generate certificate test cases are passed successfully");
		
	}
	
//	@Then(" I logout from the application")
//	public void i_logout_from_the_application()
//	{
//		proceactiviesPage.LogoutPCE();
//	}
	}