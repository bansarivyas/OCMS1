package web.stepdef;

import java.io.File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import web.pages.SlidesetFunction;

public class SlidesetDownloadStepDef extends BaseClass {

	@Given("Login to the {string} and enter {string} and {string} and successfully logged in")
	public void login_to_the_and_enter_and_and_successfully_logged_in(String URL, String Username, String Password)
			throws Exception {

		driver.get(URL);
		Thread.sleep(5000);
		anonymoususer.Login(Username, Password);
		Thread.sleep(5000);

		selUtil.takeSnapShot(driver, "Login");
	}

	@Then("I verify Download Slideset or Review activity button if present click on it")
	public void i_verify_download_slideset_or_review_activity_button_if_present_click_on_it()
			throws Exception {

		slisetfunc.clickDownloadSlisesetBtn();
		Thread.sleep(5000);

		selUtil.takeSnapShot(driver, "ClickDownloadSlideset");
	}

	@Then("I verify if Review activity button is clicked and click Download Slideset")
	public void i_verify_if_review_activity_button_is_clicked_and_click_download_slideset() {

		String home = System.getProperty("user.home");
		String file_name = "CCO_AtopicDerm2022_Downloadable_1.pptx";
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out.println("Function Name ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {

			System.out.println(file_with_location + " is present");

		} else {

			System.out.println(file_with_location + " is not present");

		}

	}

	@Then("I Logout from the application")
	public void i_logout_from_the_application() throws Exception {

		slisetfunc.ProCELogoutFunc();
		
		selUtil.takeSnapShot(driver, "Logout");

	}

}
