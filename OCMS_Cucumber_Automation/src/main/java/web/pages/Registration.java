package web.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Registration {
	WebDriver driver;

	@FindBy(xpath = "//*[normalize-space(text())='Sign Up' and contains(@class,'d-none')]")
	WebElement Signup;
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txt_FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txt_LastName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txt_Email;

	@FindBy(xpath = "//*[@id='mobile_phone']")
	WebElement txt_Phone;

	@FindBy(xpath = "//*[@id='password']")
	WebElement txt_Pass;

	@FindBy(xpath = "//*[@id='password_confirmation']")
	WebElement txt_ConfirmPass;

	@FindBy(xpath = "//*[@id='country']")
	WebElement Choose_Country;

	@FindBy(xpath = "//*[@id='postalcode']")
	WebElement txt_PostalCode;

	@FindBy(xpath = "//*[@placeholder='Choose profession']")
	WebElement Choose_Profession;
	@FindBy(xpath = "//label[text()='Nurse']//parent::div//input")
	WebElement Nurse;

	@FindBy(xpath = "//*[@placeholder='Choose degree']")
	WebElement Choose_Degree;

	@FindBy(xpath = "//label[text()='Others (Nurse)']//parent::div//input")
	WebElement Other;

	@FindBy(xpath = "//*[@placeholder='Choose Specialist']")
	WebElement Choose_Speciality;

	@FindBy(xpath = "//label[text()='Transplantation']//parent::div//input")
	WebElement Transplant;

	@FindBy(xpath = "//*[@id='practice_setting']")
	WebElement Choose_PracticeSetting;

	@FindBy(xpath = "//*[@id='primary_practice']")
	WebElement Choose_PrimaryPracticeSetting;

	@FindBy(xpath = "//*[@id='acceptterms']")
	WebElement Check_Privacycheckbox;

	@FindBy(xpath = "//*[@onclick='submitRegister();']")
	WebElement Btn_SignUpUser;

	public Registration(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void signUp()

	{
		//Signup.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Signup);

	}

	public void registerUser(String FirstName, String LastName, String Phone, String Password, String ConfirmPassword) {

		txt_FirstName.sendKeys(FirstName);
		txt_LastName.sendKeys(LastName);
		String RandomEmailID = RandomStringUtils.randomNumeric(4);
		txt_Email.sendKeys("Automation" + RandomEmailID + "@test.com");
		System.out.println("Your Email ID is " + "Automation" + RandomEmailID + "@test.com");
		// txt_Email.sendKeys(EmailAddress);
		txt_Phone.sendKeys(Phone);
		txt_Pass.sendKeys(Password);
		txt_ConfirmPass.sendKeys(ConfirmPassword);

	}

	public void selectCountry(String Country) {
		Select Coun = new Select(Choose_Country);
		Coun.selectByVisibleText(Country);

	}

	public void addPostalCode(String Postalcode)

	{
		txt_PostalCode.sendKeys(Postalcode);

	}

	public void registerUserDropdown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Choose_Profession);
		js.executeScript("arguments[0].click();", Nurse);

		js.executeScript("arguments[0].click();", Choose_Degree);
		js.executeScript("arguments[0].click();", Other);

		js.executeScript("arguments[0].click();", Choose_Speciality);
		js.executeScript("arguments[0].click();", Transplant);

	}

	public void registerUserDropdownPp(String PracticeSetting, String primarypractice) {

		Select s = new Select(Choose_PracticeSetting);
		s.selectByVisibleText(PracticeSetting);

		Select s1 = new Select(Choose_PrimaryPracticeSetting);
		s1.selectByVisibleText(primarypractice);

	}

	public void registerUserCheckbox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Check_Privacycheckbox);

		//Check_Privacycheckbox.click();

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Btn_SignUpUser);

	}

}
