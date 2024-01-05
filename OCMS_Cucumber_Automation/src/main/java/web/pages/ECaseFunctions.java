package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ECaseFunctions {

	private WebDriver driver = null;

	@FindBy(how = How.XPATH, using = "//a[text()='Continue']")
	private WebElement ContinueBtn;

	@FindBy(how = How.XPATH, using = "(//a[text()='NEXT'])[1]")
	private WebElement NextBtn;

	String Answer = "(//*[contains(text(),'%s')]//following::*[text()=' %s']//parent::div//input)[1]";
	String SubmitAnsBtn = "(//*[contains(text(),'%s')]//following::button[text()='Submit Answers'])[1]";

	public ECaseFunctions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void preTestAnswer(String QPre1, String AnsPre1, String QPre2, String AnsPre2, String QPre3, String AnsPre3)
			throws InterruptedException {

		driver.findElement(By.xpath(String.format(Answer, QPre1, AnsPre1))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(SubmitAnsBtn, QPre1))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, QPre2, AnsPre2))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(SubmitAnsBtn, QPre2))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(Answer, QPre3, AnsPre3))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(String.format(SubmitAnsBtn, QPre3))).click();
		Thread.sleep(3000);

	}

	public void clickNextBtn() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", NextBtn);
//		NextBtn.click();
	}

	public void postTestAnswer1(String QPost1, String AnsPost1) throws InterruptedException {

		if (driver.findElements(By.xpath(String.format(Answer, QPost1, AnsPost1))).size() > 0) 
		{			
			driver.findElement(By.xpath(String.format(Answer, QPost1, AnsPost1))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(String.format(SubmitAnsBtn, QPost1))).click();
			Thread.sleep(3000);
		}

	}

}
