package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefCourseInprogress extends BaseClass {
	
	@Given("I login in to application {string} by using {string} {string}")
	public void i_login_in_to_application_by_using(String url, String Username, String Password) {
	    driver.get(url);
	    proceactiviesPage.Login(Username, Password);
	}
	
	@When("I click on activities tab and select the activity")
	public void i_click_on_activities_tab_and_select_the_activity() {
		selUtil.hardWait(7);
		procehomePage.ClickActivities();
		courseinprogresspage.clickonActivity();
	}
	
	@When("I click on begin activity page")
	public void i_click_on_begin_activity_page() {
		courseinprogresspage.begin();
	}
	
	@When("I click on profile icon and click on Course-in-progress")
	public void i_click_on_profile_icon_and_click_on_course_in_progress() {
	    courseinprogresspage.clickonprofile();
	    
	}
	@Then("I am able to see the courses in progress page {string}")
	public void i_am_able_to_see_the_courses_in_progress_page(String ExpectedCourseTitle) {
		courseinprogresspage.Verifycoursetitle(ExpectedCourseTitle);
	    
	}
	@Then("I am able to see the inprogress course title")
	public void i_am_able_to_see_the_inprogress_course_title() throws Exception {
		courseinprogresspage.Verifycoursedetail();
		selUtil.takeSnapShot(driver, "Course_InProgress");
		
	}
}