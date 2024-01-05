package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefMyEvent extends BaseClass {

	//UAT
	/*@Given("I am on Login Page")
	public void i_am_Login_page() {

		System.out.println("-------------------------------");
		driver.get("https://proce.com/login");
		// driver.get("https://clinicaloptions.com/login");

	}

	@Given("I give {string}{string} and click on login")
	public void i_give_and_click_on_login(String email, String password) {

		System.out.println("-------------------------------");
		MyEvent.sendEmailPassword(email, password);

	}

	@When("I Click on My Events,and serach for particular evants")
	public void i_click_on_my_events_and_serach_for_particular_evants() throws InterruptedException {

		System.out.println("-------------------------------");

		MyEvent.clickonMyEvents();
		anonymoususer.globalSearchActivities("2023 Update: Practical Case Studies in Outpatient COVID-19 Management");

		Thread.sleep(200);

		
	}

	@When("I Click on Learn more ,and I navigate to {string} page")
	public void i_click_on_learn_more_and_i_navigate_to_page(String Event_details) {

		System.out.println("-------------------------------");

		MyEvent.eventDetailsPageTitle(Event_details);

	}

	@When("I Click on Learn more of Activity session and i navigate to {string} page")
	public void i_click_on_learn_more_of_activity_session_and_i_navigate_to_page(String Activity_Session_Event) {

		System.out.println("-------------------------------");
		MyEvent.eventPage();
		System.out.println("User Clicks on Activity session learn more");

		MyEvent.eventsPageTitle(Activity_Session_Event);
		System.out.println("User is on Main Event page");
		System.out.println("-------------------------------");

	}

	@When("I Click on Register for in person Event or register of Virtual Event")
	public void i_click_on_register_for_in_person_event_or_register_of_virtual_event() {
		System.out.println("-------------------------------");
		System.out.println("Successful Event Registration is Done");
		MyEvent.registerVirtualEventClick();
		System.out.println("-------------------------------");

	}

	@When("On registration form i click on Confirm and Register")
	public void on_registration_form_i_click_on_confirm_and_register() {
		System.out.println("-------------------------------");
		System.out.println("Registration Confirmation is Done");
		selUtil.hardWait(3);
		MyEvent.confirmRegistrationPopup();
		selUtil.hardWait(3);
		System.out.println("-------------------------------");

	}

	@When("I Click on Continue button on Thank you page")
	public void i_click_on_continue_button_on_thank_you_page() {
		System.out.println("-------------------------------");
		MyEvent.confirmButtonOnThankyoupage();
		System.out.println("Confirmation Continue button is clicked");
		System.out.println("-------------------------------");

	}

	@When("I click on My profile and My events")
	public void i_click_on_my_profile_and_my_events() throws InterruptedException {
		System.out.println("-------------------------------");
		MyEvent.editProfile();
		System.out.println("User clicked on My Profile->My Events");
		System.out.println("user should be in my profile block");
		MyEvent.editMyEvents();
		System.out.println("-------------------------------");

	}

	@Then("{string} should be present in My Event page")
	public void should_be_present_in_my_event_page(String Event_name) throws InterruptedException {
		System.out.println("-------------------------------");
		MyEvent.eventTitle(Event_name);
		System.out.println("Event name is present in My event");
		System.out.println("-------------------------------");

	}

	@Then("I click on Cancel Registration,so registration should get cancelled")
	public void i_click_on_cancle_registration_so_registration_should_get_cancelled() throws InterruptedException {
		System.out.println("-------------------------------");
		selUtil.hardWait(3);
		MyEvent.cancel_Registration();
		selUtil.hardWait(3);
		System.out.println("Registration cancelled Successfully");
		System.out.println("-------------------------------");

		driver.navigate().refresh();
//		slisetfunc.ProCELogoutFunc();

	}*/
	
	//Prod
	
	@Given("I am on Login Page")
	public void i_am_Login_page() {

		System.out.println("-------------------------------");
		//driver.get("https://proce.com/login");
		driver.get("https://clinicaloptions.com/login");

	}

	@Given("I give {string}{string} and click on login")
	public void i_give_and_click_on_login(String email, String password) {

		System.out.println("-------------------------------");
		MyEvent.sendEmailPassword(email, password);

	}

	@When("I Click on My Events,and serach for particular evants")
	public void i_click_on_my_events_and_serach_for_particular_evants() throws InterruptedException {

		System.out.println("-------------------------------");

		MyEvent.clickonMyEvents();
		Thread.sleep(1000);
		anonymoususer.globalSearchActivities("9th Annual Psychopharmacology Update 2023");

		Thread.sleep(3000);
		WebElement Learnmore =	driver.findElement(By.xpath("//a[@onclick=\"viewmoreclick(32,'https://clinicaloptions.com/events/9th-annual-psychopharmacology-update-2023/9th-annual-psychopharmacology-update-2023/10175-10316',3,'9th-annual-psychopharmacology-update-2023',null)\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Learnmore);
		//Learnmore.click();

		
	}

	

	@When("I Click on Register for in person Event or register of Virtual Event")
	public void i_click_on_register_for_in_person_event_or_register_of_virtual_event() {
		System.out.println("-------------------------------");
		
		MyEvent.registerVirtualEventClick();
		System.out.println("Successful Event Registration is Done");
		
	}

	@When("On registration form i click on Confirm and Register")
	public void on_registration_form_i_click_on_confirm_and_register() {
		System.out.println("-------------------------------");
		System.out.println("Registration Confirmation is Done");
		selUtil.hardWait(3);
		MyEvent.confirmRegistrationPopup();
		selUtil.hardWait(3);
		

	}

	@When("I Click on Continue button on Thank you page")
	public void i_click_on_continue_button_on_thank_you_page() {
		System.out.println("-------------------------------");
		MyEvent.confirmButtonOnThankyoupage();
		System.out.println("Confirmation Continue button is clicked");
		

	}

	@When("I click on My profile and My events")
	public void i_click_on_my_profile_and_my_events() throws InterruptedException {
		System.out.println("-------------------------------");
		driver.navigate().refresh();
		//MyEvent.editProfile();
		//MyEvent.editMyEvents();
		
		
		SoftLoginMyProfile.editProfile();
		selUtil.hardWait(3);
		SoftLoginMyProfile.clickMyEvents();
		selUtil.hardWait(3);

	}

	@Then("{string} should be present in My Event page")
	public void should_be_present_in_my_event_page(String Event_name) throws InterruptedException {
		System.out.println("-------------------------------");
		MyEvent.eventTitle(Event_name);
		System.out.println("Event name is present in My event");
		

	}

	@Then("I click on Cancel Registration,so registration should get cancelled")
	public void i_click_on_cancle_registration_so_registration_should_get_cancelled() throws InterruptedException {
		System.out.println("-------------------------------");
		selUtil.hardWait(3);
		WebElement RegistrationCancel = driver.findElement(By.xpath("//a[text()='Cancel Registration']"));
		RegistrationCancel.click();
		
		//MyEvent.cancel_Registration();
		
		selUtil.hardWait(3);
		MyEvent.Cancel_Registration_ok.click();
		

		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='About Us']//following::button[@id='dropdownMenuButton1'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[normalize-space(text())='About Us']//following::*[normalize-space(text())='Logout'])[1]")).click();
   //	slisetfunc.ProCELogoutFunc();
	}

}
