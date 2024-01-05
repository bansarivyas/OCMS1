package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.ClinicalThought;
import web.pages.DownloadPDF;

public class StepDefClinicalThought extends BaseClass {
	
	@Given("user click on activities tab and Search for the CTactivity")
	public void user_click_on_activities_tab_and_search_for_the_c_tactivity() {
		DownloadPDF.ActivitiesonHomePage.click();
		
	 
	}
	@When("user clicks on the learn more button of an activity,user redirects to the activity Details page")
	public void user_clicks_on_the_learn_more_button_of_an_activity_user_redirects_to_the_activity_details_page() {
		anonymoususer.globalSearchActivities("Expert Answers to FAQs on Approaches for Improving Time to Early Effective Therapy for Resistant Gram-Negative Infections");
	}
	@When("user clicks on BeginActivity OR ReviewActivity")
	public void user_clicks_on_begin_activity_or_review_activity() throws InterruptedException {
		
		ClinicalThought.clickBeginorReviewActivity();
	    
	}
	
	@Then("{string} details should display")
	public void details_should_display(String Activity) {
		
		ClinicalThought.verifyActivityDetails(Activity);
	}


	 

	
	@Then("User is able to submit the Comment and verify the {string}")
	public void user_is_able_to_submit_the_comment_and_verify_the(String popup) {
		ClinicalThought.ClickonDiscussionBox();
		ClinicalThought.VerifyPopup(popup);
		
		driver.navigate().refresh();
//		slisetfunc.ProCELogoutFunc();

	}

}
