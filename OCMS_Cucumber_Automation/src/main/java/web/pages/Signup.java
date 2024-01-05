package web.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Signup {
	WebDriver driver;

	@FindBy(xpath = "(//*[normalize-space(text())='Sign Up' and contains(@class,'d-sm-block')])[1]")
	WebElement Signupbtn;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement FirstNametxt;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement LastNametxt;
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement EmailAddresstxt;
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement Selectcountry;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordtxt;
	
	@FindBy(xpath = "//input[@id='password_confirmation']")
	WebElement password_confirmation;
	
	@FindBy(xpath = "//input[@placeholder='Choose profession']")
	WebElement Choose_profession;
	
	@FindBy(xpath = "//input[@placeholder='Choose Specialty Training']")
	WebElement Choose_Specialty_Training;
	
	@FindBy(xpath = "//label[contains(., \"Genetic Counselor\")]")
	WebElement SelectGeneticCounselor;
	
	@FindBy(xpath = "//label[contains(., \"Addiction Medicine\")]")
	WebElement SelectAddictionMedicine;
	
	@FindBy(xpath = "//*[@id='acceptterms']")
	WebElement Check_Privacycheckbox;

	@FindBy(xpath = "//*[@onclick='submitRegister();']")
	WebElement Btn_SignUpUser;
	
	public  Signup(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void signupbtnClick()

	{
		try {
			
			Signupbtn.click();
		}
			catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", Signupbtn);

		}

	}	
	
	
	public void Signupdata(String FirstName, String LastName, String Password, String ConfirmPassword) {

		FirstNametxt.sendKeys(FirstName);
		LastNametxt.sendKeys(LastName);
		String RandomEmailID = RandomStringUtils.randomNumeric(4);
		EmailAddresstxt.sendKeys("Automation" + RandomEmailID + "@test.com");
		System.out.println("Your Email ID is " + "Automation" + RandomEmailID + "@test.com");
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("United States of America");
		passwordtxt.sendKeys(Password);
		password_confirmation.sendKeys(ConfirmPassword);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", Choose_profession);
		js1.executeScript("arguments[0].click();", SelectGeneticCounselor);
		js1.executeScript("arguments[0].click();", Choose_Specialty_Training);
		js1.executeScript("arguments[0].click();", SelectAddictionMedicine);
		js1.executeScript("arguments[0].click();", Check_Privacycheckbox);
		js1.executeScript("arguments[0].click();", Btn_SignUpUser);

		
//		Choose_profession.click();
//		SelectGeneticCounselor.click();
//		Choose_Specialty_Training.click();
//		SelectAddictionMedicine.click();
//		Choose_profession.sendKeys(profession);
//		Choose_Specialty_Training.sendKeys(Specialty_Training);
		

	}

}
