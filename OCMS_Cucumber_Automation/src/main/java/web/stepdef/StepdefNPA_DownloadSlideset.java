package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefNPA_DownloadSlideset extends BaseClass {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("Given I navigate to the {string}")
	public void given_i_navigate_to_the(String url) {
//		selUtil.hardWait(10);
//	    driver.get(url);
	}
	
	@When("User click on activities tab and Search for the activity")
	public void user_click_on_activities_tab_and_search_for_the_activity() {
		procehomePage.ClickActivities();
		npadownloadPage.Search_actvity();	
	}
	
	@When("User clicks on learn more button")
	public void user_clicks_on_learn_more_button() {
		npadownloadPage.SlideSet_learnmore_button();
	}
	
	@When("User clicks on Download SlideSet button")
	public void user_clicks_on_download_Slideset_button() {
		npadownloadPage.Beginactivity();
	}
	
	@When("I login in to application by using {string} {string}")
	public void i_login_in_to_application_by_using(String Username, String Password) {
		proceactiviesPage.Login(Username, Password);
		//npadownloadPage.DownloadslidesetProd();
	}
	
	
	@When("User clicks on Cancel button without filling the details on popup")
	public void user_clicks_on_cancel_button_without_filling_the_details_on_popup() {
		npadownloadPage.CancelButton();		
	}
	
	@When("Verify user is navigated back to activity detail page {string}")
	public void verify_user_is_navigated_back_to_activity_detail_page(String Exp_Heading) {
		npadownloadPage.verify_activityTitle(Exp_Heading);
		npadownloadPage.SlideSet_learnmore_button();
	}
	
	@When("User clicks on Continue activity button")
	public void user_clicks_on_continue_activity_button() {
		//npadownloadPage.continuebutton();
	}
	
	@When("User able to fill details in NPA Popup {string} {string} and click on submit button")
	public void user_able_to_fill_details_in_npa_popup_and_click_on_submit_button(String ExpectedDegree, String ExpectedMedicalSpeciality) {
		selUtil.hardWait(15);
		proceactiviesPage.Enterdetails(ExpectedDegree, ExpectedMedicalSpeciality);
		proceactiviesPage.ClickonSubmit();
	}
	
	@When("User selects the answers for pretest")
	public void user_selects_the_answers_for_pretest() {
		//npadownloadPage.select_answers_pretest_Slideset();
	}
	
	@When("User clicks on continue to activity button")
	public void user_clicks_on_continue_to_activity_button() {
		proceactiviesPage.ContinueActivitybtn1();
	}
	
	@When("User clicks on continue to activity button on popup")
	public void user_clicks_on_continue_to_activity_button_on_popup() {
		proceactiviesPage.ContinueActivityPopup();
	}
	
	@When("User clicks on Download Slideset")
	public void user_clicks_on_download_slideset() {
		npadownloadPage.download_slideset();
	}
	
	@Then("The Slideset ppt file should be downloaded successfully")
	public void the_slideset_ppt_file_should_be_downloaded_successfully() throws Exception {
	    npadownloadPage.verify_slideset_downloaded();
	    selUtil.hardWait(10);
		selUtil.takeSnapShot(driver, "NPA_DownloadPPT");
	}
}