package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.stepdef.BaseClass;

public class Mycertificates extends BaseClass  {
	
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']\"))")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'collapse')]//img[@class='profileimgcls']")
	WebElement Profile;

	@FindBy(xpath = "/html//div[@id='navbarNav']/div//ul[@class='dropdown-menu show']//a[@href='https://uat.proce.com/profile/my-certificates']")
	WebElement myCertificates;
	
	
	
	
	

	@FindBy(xpath = "/html//form[@id='filterform']/section/div[@class='container']/div[@class='mb-2']/div/div[@class='main-wrap']/div/div[3]/div/div[2]/div/div[1]/div/div/div[1]/div/div/p")
	WebElement myCertificateTitle;
	
	
	
	public Mycertificates(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
