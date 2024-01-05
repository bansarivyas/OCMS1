package web.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ClinicalThought {

	private WebDriver driver = null;

	@FindBy(xpath = "//*[normalize-space(text())='Begin Activity' or normalize-space(text())='Review Activity']")
	WebElement BeginOrReview;

	@FindBy(xpath = "//textarea[@placeholder=\"Enter Comment Here\"]")
	WebElement discussionBox;

	@FindBy(xpath = "(//button[text()=\"Submit\"])[1]")
	WebElement submitbtn;

	@FindBy(xpath = "//h2[text()=\"Comment added successfully. Moderated comments will be approved and posted by admin.\"]")
	WebElement popupText;
	
	@FindBy(xpath = "//button[text()='OK']")
    WebElement OkButton;
	
	@FindBy(xpath ="//h5[text()=\"Key Takeaways\"]")
	WebElement KeyTakeaway;
	
	public ClinicalThought(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBeginorReviewActivity() throws InterruptedException {
		// BeginOrReview.click();

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", BeginOrReview);

	}

	public void ClickonDiscussionBox() {

		discussionBox.sendKeys("Comments XYZ Testing");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitbtn);

	}
	
	public void verifyActivityDetails(String expectedActivitydetail) {
		
		String actualActivitydetail = KeyTakeaway.getText();
		Assert.assertEquals(actualActivitydetail, expectedActivitydetail);
		System.out.println("Event Details Title is  " + actualActivitydetail);
	}

	public void VerifyPopup(String expectedpopupText) {

		String actualpopupText = popupText.getText();
		Assert.assertEquals(actualpopupText, expectedpopupText);
		System.out.println("Event Details Title is  " + actualpopupText);
		
		popupText.click();
	}

}
