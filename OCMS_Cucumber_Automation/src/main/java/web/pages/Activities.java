package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activities {
	
	@FindBy(xpath = "//input[@id='useremail']")
	WebElement useremail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath = "//a[normalize-space()='ACTIVITIES']")
	WebElement activities;
	
	@FindBy(xpath = "//input[@id='titlesearch']")
	WebElement titlesearch;
	
	@FindBy(xpath = "//div[@class='search-box actvty-srch']//i[@class='fa fa-search']")
	WebElement searchbox;
	
	@FindBy(xpath = "//a[@class='btn btn-primary rounded-pill list-btn']")
	WebElement learnmore;
	
	@FindBy(xpath = "//a[@id='btnurl']")
	WebElement beginactivity;
	
	

	public Activities(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
