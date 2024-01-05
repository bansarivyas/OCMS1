package web.stepdef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IDSTStepDef extends BaseClass {
	
	
	@When("I click on Accept Disclaimer and Launch Tool")
	public void i_click_on_accept_disclaimer_and_launch_tool() {
		
		idstfunc.launchTool();
		
	}
	
	@When("I answer all the questions {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void i_answer_all_the_questions(String Q1, String Ans1, String Q2, String Ans2, String Q3, String Ans3, String Q4, String Ans4, String Q5, String Ans5) throws InterruptedException {
		
		idstfunc.answerQuestions(Q1,Ans1,Q2,Ans2,Q3,Ans3,Q4,Ans4,Q5,Ans5);
		
	}
	
	@When("I click on Submit button")
	public void i_click_on_submit_button() {
		
		idstfunc.submitPatientCase();
		
	}
	
	@Then("I verify recommendations screen")
	public void i_verify_recommendations_screen() {
		
		idstfunc.verifyRecommendation();
		
	}
	@Then("I answer Clinical Implications answers {string} {string} {string} {string} {string} {string}")
	public void i_answer_clinical_implications_answers(String C1, String CAns1, String C2, String CAns2, String C3, String CAns3) throws InterruptedException {
		
		idstfunc.answerClinicalImplications(C1, CAns1, C2, CAns2, C3, CAns3);
		
	}
	
	@Then("I verify responses given")
	public void i_verify_responses_given() {
		
		idstfunc.verifyResponses();
		
	}
	
	@Then("I logout from CCO application")
	public void i_logout_from_cco_application() throws InterruptedException {
		
		idstfunc.CCOLogout();
		
	}

}
