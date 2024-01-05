package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import web.stepdef.BaseClass;

public class CourseInProgress extends BaseClass {

	@FindBy(xpath = "(//*[normalize-space(text())='Subscriptions']//following::button[@id='dropdownMenuButton1'])[1]")
	WebElement profile;

	@FindBy(xpath = "(//a[@class='dropdown-item hdercls'])[2]")
	WebElement courseinprogress;

	@FindBy(xpath = "//h3[normalize-space()='Courses In Progress']")
	WebElement Courseheader;

	@FindBy(xpath = "//*[@id='appendform']/div[2]/div/a/div/img")
	WebElement firstactivity;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='Continue Activity' or normalize-space(text())='View Activity']")
	private WebElement begin;
	
	@FindBy(how = How.XPATH, using = "//input[@id='titlesearch']")
	private WebElement Search_activity1;
	
	@FindBy(how = How.XPATH, using = "(//img[@alt='BTKis for CLL and MCL'])[1]")
	private WebElement Activityclick1;

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CourseInProgress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonActivity() {
		Search_activity1.sendKeys("Targeted Treatment of B-Cell Malignancies: Practical Strategies for BTK Inhibitors");
		selUtil.hardWait(3);
		Search_activity1.sendKeys(Keys.ENTER);
		selUtil.hardWait(5);
		Activityclick1.click();
	}

	public void begin() {
		// Click on Continue/Begin Activity button
		selUtil.hardWait(10);
		begin.click();
	}

	public void clickonprofile() {
		selUtil.hardWait(5);
		js.executeScript("arguments[0].click();", profile);
		selUtil.hardWait(5);
		js.executeScript("arguments[0].click();", courseinprogress);
	}

	public void Verifycoursetitle(String ExpectedCourseTitle) {
		String ActualcourseTitle = Courseheader.getText();
		Assert.assertEquals(ActualcourseTitle, ExpectedCourseTitle);
		System.out.println("Header found as " + ExpectedCourseTitle);
	}

	public void Verifycoursedetail() {
		String ActualActivityName= driver.findElement(By.xpath("(//div[@class='row table-list-box'])[1]")).getText();
		Assert.assertEquals(true,
				driver.findElement(By.xpath("(//div[@class='row table-list-box'])[1]")).isDisplayed());
		System.out.println("Course Details are displayed "+ ActualActivityName);
	}

}