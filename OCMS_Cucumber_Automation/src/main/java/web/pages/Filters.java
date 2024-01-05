package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters {
	
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement useremail;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//a[normalize-space()='ACTIVITIES']")
	WebElement activities;
	
	@FindBy(xpath = "//h2[@id='headingOne']/button[@type='button']")
	WebElement Speciality;


	@FindBy(xpath = "//input[@id='remove340D3CD7-E118-47FA-9AD2-ACF2D8CFE123']")
	WebElement particularSpeciality;
	
	

	@FindBy(xpath = "headingTwo")
	WebElement Topic;
	
	@FindBy(xpath = "//a[@class='clear-btn']")
	WebElement Clear;
	
	public Filters(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
	
	
	


