package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddUser {

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Users']")
	private WebElement Users;

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'backalert')][normalize-space()='Users']")
	private WebElement SubMenuUser;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Create']")
	private WebElement create_button;

	@FindBy(how = How.XPATH, using = "//*[@id='div-basic-tab']/div/div[1]/div[1]/div[2]/div/input")
	private WebElement LastName;

	@FindBy(how = How.XPATH, using = "//*[@id='div-basic-tab']/div/div[1]/div[1]/div[4]/div/input")
	private WebElement FirstName;

	@FindBy(how = How.XPATH, using = "//*[@id='div-basic-tab']/div/div[1]/div[1]/div[5]/div/input")
	private WebElement EmailID;

	@FindBy(how = How.XPATH, using = "//a[@id='createadminbutton']")
	private WebElement Save;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='User created successfully!']")
	private WebElement Success_Message;
	

	public AddUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickUsers()
	{
		Users.click();
		SubMenuUser.click();
	}

	public void createButton()
	{
		create_button.click();
	}

	public void Enterdetails()
	{
		LastName.sendKeys("Sonar");
		FirstName.sendKeys("Shweta");
		EmailID.sendKeys("Shweta9988@test.com");
	}

	public void ClickSave()
	{
		Save.click();
	}
	
	public void Success(String ExpectedSuccessMessage)
	{
		String actualSuccessMessage = Success_Message.getText();
		Assert.assertEquals(actualSuccessMessage, ExpectedSuccessMessage);
		System.out.println("Success Message found as  " + actualSuccessMessage);
	}
}