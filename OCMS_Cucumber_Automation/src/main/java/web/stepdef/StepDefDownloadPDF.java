package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefDownloadPDF extends BaseClass {

	@Given("User login into {string} using {string} {string}")
	public void user_login_into_using(String url, String email, String password) {

		driver.get(url);
		DownloadPDF.sendEmailPassword(email, password);

	}

	@Given("user click on activities tab and Search for the activity")
	public void user_click_on_activities_tab_and_search_for_the_activity() throws InterruptedException {
		DownloadPDF.clickonActivities();
	}

	@When("user clicks on the learn more button of an activity,user redirects to the activity page")
	public void user_clicks_on_the_learn_more_button_of_an_activity_user_redirects_to_the_activity_page() {

		DownloadPDF.clickOnSearchedActivity();
	}

	@When("user clicks on Download PDF")
	public void user_clicks_on_download_pdf() {
		DownloadPDF.downloadPDFFile();
	}

	@Then("PDF should get downloaded successfully")
	public void pdf_should_get_downloaded_successfully() {
		DownloadPDF.verifyDownloadedPDFFile();
		
		
		driver.navigate().refresh();
//		slisetfunc.ProCELogoutFunc();

	}

}
