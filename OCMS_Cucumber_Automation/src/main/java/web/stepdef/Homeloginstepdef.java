package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.HomeloginPage;


public class Homeloginstepdef extends BaseClass {

	@Given("user login to website by using {string} and {string}")
	public void user_login_to_website_by_using_and(String Uname, String Pword) {
		driver.get("https://test.clinicaloptions.com/");
		HomeloginPage.clickOnLogin();
		HomeloginPage.enterEmailID("testdata22@gmail.com");
		HomeloginPage.enterPassword("Test@123");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		HomeloginPage.clickLoginButton();
	}

	@Then("user able to see welcome title {string}")
	public void user_able_to_see_welcome_title(String Title) {
		//HomeloginPage.see_Welcome_Username("Welcome, test data");
		driver.quit();
	}
}
