package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnonymousUser extends BaseClass {
	
	String HomePageTabXpath = "//*[normalize-space(text())='%s']";
	
	@Given("Login to the {string}")
	public void login_to_the(String URL) {
	    
//		driver.manage().deleteAllCookies();
//		driver.get("chrome://settings/clearBrowserData");
//		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get(URL);
		
	}

	@When("I click on {string} Tab")
	public void i_click_on_tab(String TabName) {
	    
		driver.findElement(By.xpath(String.format(HomePageTabXpath, TabName.toUpperCase()))).click();
		
	}

	@When("I search for the {string} and open it")
	public void i_search_for_the_and_open_it(String ActivityName) {
	    
		anonymoususer.globalSearchActivities(ActivityName);
		
	}

	@When("I click on Begin Activity")
	public void i_click_on_begin_activity() throws InterruptedException {
		Thread.sleep(7000);
		anonymoususer.clickBeginActivity();
		Thread.sleep(7000);
		
	}

	@When("I click on Continue to Post Test button")
	public void i_click_on_continue_to_post_test_button() throws InterruptedException {
		Thread.sleep(7000);
		anonymoususer.clickContinuePostTest();
		
	}

	@When("Answer the Post-Test Question {string} {string} {string} {string}")
	public void answer_the_post_test_question(String PT1, String PT2, String PT3, String PT4) throws InterruptedException {
		
		Thread.sleep(5000);
		anonymoususer.postTestAnswers(PT1,PT2,PT3,PT4);
		
	}

	@When("I Click  on Continue to Evaluation button")
	public void i_click_on_continue_to_evaluation_button() throws InterruptedException {
		
		Thread.sleep(5000);
		anonymoususer.clickContinueEvaluation();
		Thread.sleep(5000);
		anonymoususer.clickContinueEvaluationPopup();
		
	}

	@Then("I verify the user is redirected to LoginPageScreen")
	public void i_verify_the_user_is_redirected_to_login_page_screen() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[normalize-space(text())='Log In To Your Account']")).isDisplayed());
		
	}

	@Then("Enter the {string} and {string} and click on Login button")
	public void enter_the_and_and_click_on_login_button(String Username, String Password) throws InterruptedException {
		
		Thread.sleep(5000);
		anonymoususer.Login(Username, Password);
		Thread.sleep(5000);
		
	}

	@Then("Evaluation screen should be displayed with popup")
	public void evaluation_screen_should_be_displayed_with_popup() {
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[normalize-space(text())='Save & Continue to Evaluation']")).isDisplayed());
		
	}

	@Then("I click on ContinuetoEvaluation button")
	public void i_click_on_continueto_evaluation_button() throws InterruptedException {
		
		anonymoususer.evaluationPopup();
		
	}

	@Then("I answer the Evaluation Question {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void i_answer_the_evaluation_question(String Q1_1, String Q1_2, String Q1_3, String Q1_4, String Q2_1, String Q2_2, String Q2_3, String Q2_4, String Q2_5, String Q2_6, String Q3_1, String Q3_2, String Q3_3, String Q3_4, String Q4, String Q5, String Q6, String Q7) throws InterruptedException 
	{
		Thread.sleep(3000);
		anonymoususer.evaluationAnswers(Q1_1,Q1_2,Q1_3,Q1_4,Q2_1,Q2_2,Q2_3,Q2_4,Q2_5,Q2_6,Q3_1,Q3_2,Q3_3,Q3_4,Q4,Q5,Q6,Q7);
		
	}

	@Then("I click on SubmitEvaluation button")
	public void i_click_on_submit_evaluation_button() {
		
		anonymoususer.clickSubmitEval();
		
	}

	@Then("Activity got completed and land on Congratulations screen")
	public void activity_got_completed_and_land_on_congratulations_screen() {
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[normalize-space(text())='CONGRATULATIONS']")).isDisplayed());
		
	}


}
