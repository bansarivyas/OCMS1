package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IDSTFunctions {
	
	private WebDriver driver = null;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Accept Disclaimer and Launch Tool']")
	private WebElement LaunchTool;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Submit Patient Case']")
	private WebElement SubmitPatientCaseBtn;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Recommendations'])[1]")
	private WebElement Recommendation;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='Thank you for your response.'])[1]")
	private WebElement Responses;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='About Us']//following::button[@id='dropdownMenuButton1'])[1]")
	private WebElement UserProfile;
	
	@FindBy(how = How.XPATH, using = "(//*[normalize-space(text())='About Us']//following::*[normalize-space(text())='Logout'])[1]")
	private WebElement CCOlogout;
	
	String Answer = "(//*[contains(text(),'%s')]//following::*[normalize-space(text())='%s']//parent::div//preceding-sibling::div//input)[1]";
	
	public IDSTFunctions (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchTool ()
	{
		if(driver.findElements(By.xpath("//a[text()='Accept Disclaimer and Launch Tool']")).size()>0)
		{
//			driver.navigate().refresh();
			LaunchTool.click();
		}
		
	}
	
	public void answerQuestions (String Q1, String Ans1, String Q2, String Ans2, String Q3, String Ans3, String Q4, String Ans4, String Q5, String Ans5) throws InterruptedException
	{
	
		driver.findElement(By.xpath(String.format(Answer, Q1, Ans1))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, Q2, Ans2))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, Q3, Ans3))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, Q4, Ans4))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, Q5, Ans5))).click();
		
	}
	
	public void submitPatientCase ()
	{
		SubmitPatientCaseBtn.click();
	}
	
	public void verifyRecommendation ()
	{
		Assert.assertEquals(true, Recommendation.isDisplayed());
	}
	
	public void answerClinicalImplications (String C1, String CAns1, String C2, String CAns2, String C3, String CAns3) throws InterruptedException
	{
	
		driver.findElement(By.xpath(String.format(Answer, C1, CAns1))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, C2, CAns2))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, C3, CAns3))).click();
		Thread.sleep(3000);
	}
	
	public void verifyResponses ()
	{
		Assert.assertEquals(true, Responses.isDisplayed());
	}
	
	public void CCOLogout () throws InterruptedException
	{
		UserProfile.click();
		Thread.sleep(1000);
		CCOlogout.click();
	}

}
