package web.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EventOCMC extends BaseClass {

	@Given("I hit {string} and enter {string} and {string} to login")
	public void i_hit_and_enter_and_to_login(String URL, String UserName, String Password) throws InterruptedException {

		eventfunc.Login(URL, UserName, Password);
	}

	@When("I click on {string} and {string}")
	public void i_click_on_and(String TabName, String SubTab) {

		eventfunc.goToTab(TabName, SubTab);
	}

}
