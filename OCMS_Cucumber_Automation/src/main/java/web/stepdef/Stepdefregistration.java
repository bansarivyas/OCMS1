package web.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefregistration extends BaseClass {

	@Given("I enter the {string}")
	public void i_enter_the(String url) throws InterruptedException {
		driver.get(url);
		

	}

	@Given("click on sign up button")
	public void click_on_sign_up_button() throws InterruptedException {

		Registration.signUp();
		Thread.sleep(3000);
	}

	@When("I Enter {string} {string} {string} {string} {string}")
	public void i_enter(String FirstName, String LastName, String Phone, String Password,
			String ConfirmPassword) {
		
		Registration.registerUser(FirstName, LastName, Phone, Password, ConfirmPassword);

	}

	@When("Select {string} from Country dropdown")
	public void select_india_from_country_dropdown(String Country) {
		Registration.selectCountry(Country);
	}

	@When("I enter {string}")
	public void i_enter(String Postalcod) {
		Registration.addPostalCode(Postalcod);
	}

	@When("clcik on profession,degree,speciality")
	public void clcik_on_profession_degree_speciality() {

		Registration.registerUserDropdown();
	}

	@When("Select {string} {string} from respective dropdown")
	public void select_from_respective_dropdown(String PracticeSetting, String primarypractice) {
		Registration.registerUserDropdownPp(PracticeSetting, primarypractice);

	}

	@When("Check the checkbox of By clicking this box, you are agreeing to our Privacy Policy and Terms & Conditions.and click on signup button")
	public void check_the_checkbox_of_by_clicking_this_box_you_are_agreeing_to_our_privacy_policy_and_terms_conditions_and_click_on_signup_button() {
		
		Registration.registerUserCheckbox();
		driver.navigate().refresh();
//		slisetfunc.ProCELogoutFunc();
	}

	@Then("I am able to see {string}")
	public void i_am_able_to_see(String string) {
		

	}
}

//package web.stepdef;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class Stepdefregistration extends BaseClass {
//	
//	private static final Object Check_Privacycheckbox = null;
//	private static final Object Btn_SignUpUser = null;
//	//WebDriver driver= new ChromeDriver();
//	//WebDriver driver = null;
//		
//		
//		
//		@Given("User redirect to Signup Page")
//		public void User_redirect_to_Signup_Page() {
//			driver.get("https://test.clinicaloptions.com/");
////			String url = "https://test.clinicaloptions.com/";
////			driver.get(url);
////			driver.manage().window().maximize();
////			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		    	    
//		}
//		@When ("User Signup into Signup page and Registration page will be visible")
//		public void user_Signup_into_Signup_page_and_Registration_page_will_be_visible() {
//			//driver.findElement(By.xpath("(//*[text()='Sign Up'])[2]")).click();
//			Registration.signUp();
//			
//			
//		   
//		}
//
//		@Then ("User fill all required detail")
//		public void User_fill_all_required_detail() throws InterruptedException {
//			
////			try {
////		    driver.findElement(By.id("firstname")).sendKeys("test");
////			driver.findElement(By.id("lastname")).sendKeys("test");
////			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("krunl.rana+6@extentia.com");
////			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Krunal@2023");
////			driver.findElement(By.xpath("//*[@id='password_confirmation']")).sendKeys("Krunal@2023");
////			driver.findElement(By.xpath("//*[@id='country']")).sendKeys("test");
////			
////			driver.findElement(By.xpath("(//*[@type='search'])[1]")).sendKeys("Genetic Counselor");
////			driver.findElement(By.xpath("(//*[@type='search'])[2]")).sendKeys("Addiction Medicine");
////			
////			
////			driver.findElement(By.xpath("//*[@id='acceptterms']")).click();
////		    driver.findElement(By.xpath("//*[@type='submit']")).click();
////			  } catch (Exception e) {
////			     JavascriptExecutor executor = (JavascriptExecutor) driver;
////			     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@type='submit']")));
////			     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='acceptterms']")));
////			  }
////					
//			
//			Registration.registerUser("test", "test", "Phone", "Password", "ConfirmPassword");
//			
//
//			
//			
//				    	}
//		
//		}

