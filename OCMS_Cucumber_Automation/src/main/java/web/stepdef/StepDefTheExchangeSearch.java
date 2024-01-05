package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefTheExchangeSearch extends BaseClass {
	
	@Given("I login to Master Controller with {string} and {string}")
	public void i_login_to_master_controller_with_and(String username, String password) {
		driver.get("https://admin-uat.mycea.com/login");
		BackEndMasterPages.masterControllerLogin(username, password);
		//eventfunc.Login(username, password, null);
	   
	}
	@Given("Click on The Exchange page from The Exchange master")
	public void click_on_the_exchange_page_from_the_exchange_master() throws InterruptedException {
		//BackEndMasterPages.theExchangeClick();
		eventfunc.goToTab("The Exchange","The Exchange");
	   
	}
	@When("I Serach for a particular {string}")
	public void i_serach_for_a_particular(String stringSearch) throws InterruptedException {
		BackEndMasterPages.theSearchFunction(stringSearch);
	}
	
	@Then("Appropriate {string} should display in result list")
	public void appropriate_result_should_display_in_result_list(String result) {
		BackEndMasterPages.verifySearchedString(result);
	}

	@Given("Click on The Catagory page from The Exchange master")
	public void click_on_the_catagory_page_from_the_exchange_master() {
		eventfunc.goToTab("The Exchange","Categories");
	}
	@When("I Serach for a particular catagory {string}")
	public void i_serach_for_a_particular_catagory(String stringSearch) throws InterruptedException {
		BackEndMasterPages.theSearchFunction(stringSearch);
	   
	}
	@Then("Appropriate catagory {string} should display in result list")
	public void appropriate_catagory_should_display_in_result_list(String result) {
		BackEndMasterPages.verifySearcheCategorydString(result);
	}


}
