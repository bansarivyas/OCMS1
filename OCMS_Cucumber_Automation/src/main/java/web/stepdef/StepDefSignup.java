package web.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.Signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefSignup extends BaseClass {
	
		@Given("User redirect to Signup Page")
		public void User_redirect_to_Signup_Page() {
			driver.get("https://test.clinicaloptions.com/");
			//driver.get("https://dev.proce.com/");
			
//			String url = "https://test.clinicaloptions.com/";
//			driver.get(url);
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    	    
		}
		@When ("User Signup into Signup page and Registration page will be visible")
		public void user_Signup_into_Signup_page_and_Registration_page_will_be_visible() {
			
			Signup.signupbtnClick();
			
			
		   
		}

		@Then ("User fill all required detail")
		public void User_fill_all_required_detail() throws InterruptedException {
			
			
			
			Signup.Signupdata("test", "Automation", "TestPassword", "TestPassword");
			

			
			
				    	}
		
		}

