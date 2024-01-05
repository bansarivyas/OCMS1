package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefNPA_DownloadPDF extends BaseClass {

	@Given("User is navigate to the {string}")
	public void user_is_navigate_to_the(String url) {
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get(url);
	}

	@When("User clicks on the activities tab and Search for the activity")
	public void user_clicks_on_the_activities_tab_and_search_for_the_activity() {
		procehomePage.ClickActivities();
		npadownloadPage.Search_actvity_new();
	}

	@When("User clicks on the learn more button")
	public void user_clicks_on_the_learn_more_button() {
		npadownloadPage.PDF_learnmore_button();
	}

	@When("User clicks on the Download button")
	public void user_clicks_on_the_Download_button() {
		npadownloadPage.ClickonDownloadPDF();
	}

	@When("User clicks on the Cancel button without filling the details on popup")
	public void user_clicks_on_the_cancel_button_without_filling_the_details_on_popup() {
		npadownloadPage.CancelButton();
	}

	@When("Verify user is navigated back to the activities listing page {string}")
	public void verify_user_is_navigated_back_to_the_activities_listing_page(String Exp_Heading) {
		npadownloadPage.verify_Heading_on_Activity_listing_Page(Exp_Heading);
	}

	@When("Again clicks on the learn more button")
	public void Again_clicks_on_the_learn_more_button() {
		npadownloadPage.PDF_learnmore_button();
	}

	@When("Again clicks on the Download button")
	public void Again_clicks_on_the_download_button() {
		npadownloadPage.ClickonDownloadPDF();
	}

	@When("User able to fill the detail in NPA Popup {string} {string} and click on submit button")
	public void user_able_to_fill_the_detail_in_npa_popup_and_click_on_submit_button(String ExpectedDegree, String ExpectedMedicalSpeciality) {
		selUtil.hardWait(15);
		proceactiviesPage.Enterdetails(ExpectedDegree, ExpectedMedicalSpeciality);
		proceactiviesPage.ClickonSubmit();
	}

	@Then("The PDF file should be downlaoded successfully")
	public void the_pdf_file_should_be_downlaoded_successfully() throws Exception {
		npadownloadPage.verify_PDF_downloaded();
		selUtil.hardWait(10);
		selUtil.takeSnapShot(driver, "NPA_DownloadPDF");
	}

}
