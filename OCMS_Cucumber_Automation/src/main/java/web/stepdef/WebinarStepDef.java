package web.stepdef;

import io.cucumber.java.en.Then;

public class WebinarStepDef extends BaseClass {
	
	@Then("I click on Continue button")
	public void i_click_on_continue_button() throws InterruptedException {
		
		webifunc.clickContinueBtn();
		
	}
	
	@Then("I verify that I get redirected to the External site {string}")
	public void i_verify_that_i_get_redirected_to_the_external_site(String ValidateURL) throws InterruptedException {
		
		webifunc.verifyExtUrl(ValidateURL);
		Thread.sleep(3000);
		
	}
	
	@Then("I come back to ProCE site")
	public void i_come_back_to_pro_ce_site() throws InterruptedException {
		
		webifunc.navigateToProCE();
		
	}

}
