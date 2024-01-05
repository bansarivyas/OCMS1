package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class Selenium {
	private WebDriver driver = null;

	//WebDriver initialization
	public Selenium(WebDriver driver) {
		System.out.println("I am selenium Constructor");
		this.driver = driver;
		waitForPageLoad(driver);
		
	}

	//Code for wait until elementExists
	public boolean isElementExists(int secondsToWait, WebElement we) {
		boolean isExist = false;
		try {
			waitUntilElementIsPresentOnPage(secondsToWait, we);
			isExist = we.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isExist;
	}


	public boolean isElementExists(WebElement we) {
		return isElementExists(30, we);
	}

	public Actions getAction() {
		Actions actions = new Actions(getDriver());
		return actions;
	}

	/**
	 * This method waits until web element is refreshed from page until given
	 * seconds are expired or before. This method tries to avoid stale element
	 * exception by monitoring element refresh incident.
	 * <p>
	 * <b>It is advisable to use this method only in case if test execution is
	 * failing due to stale element exception</b>.
	 * 
	 * <p>
	 * This method uses fluentwait.
	 *
	 * @param seconds
	 * @param image
	 *
	 * @return void
	 */
	public void getNonStaleElement(int seconds, WebElement image) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.and(ExpectedConditions.visibilityOf(image),
				ExpectedConditions.elementToBeClickable(image))));
	}

	/**
	 * This method waits until web element is invisible from page until given
	 * seconds are expired or before.
	 * <p>
	 * This method uses fluentwait.
	 *
	 * @param seconds
	 * @param webelement
	 *
	 * @return void
	 */
	public void waitUntilElementToBeInvisible(int seconds, WebElement webelement) {
		Wait<WebDriver> wait = getFluentWait(seconds);
		wait.until(ExpectedConditions.invisibilityOf(webelement));

	}

	/**
	 * This method suspends the execution considering as time-wait for given
	 * seconds. Hence this method uses thread.sleep and use of this is method is not
	 * advised.
	 *
	 * @param seconds
	 * @return void
	 * @exception InterruptedException
	 */
	public void hardWait(int seconds) {
		try {
			Thread.sleep((seconds * 1000));
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	/**
	 * This method waits until web element is visible on-page and waits until same
	 * element is clickable until given seconds are expired or before.
	 * <p>
	 * This method uses fluentwait.
	 * 
	 * @param seconds
	 * @param webelement
	 * @return void
	 */
	public void waitUntilElementIsPresentOnPage(int seconds, WebElement webelement) {
		Wait<WebDriver> wait = getFluentWait(seconds);
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(webelement),
				ExpectedConditions.elementToBeClickable(webelement)));
	}

	/**
	 * This method returns 'FluentWait' instance.
	 * <p>
	 * This method is to be called when conditional or conditional evaluation based
	 * driver wait is required. Wait will happen for given seconds and polling after
	 * 500 milliseonds and ignoring 'NoSuchElementException' exception.
	 *
	 * @param seconds
	 *
	 * @return wait
	 */
	public Wait<WebDriver> getFluentWait(int seconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
		return wait;
	}

	/**
	 * This method returns the WebDriver instance 'driver' as per set up done by
	 * <p>
	 * This method is to be used only after atleast once
	 * {@link Selenium.setupDriver} is called. Method returns null, if any issues in
	 * setup method or if browser binary doesnt exist etc.
	 *
	 * @return WebDriver
	 */
	public WebDriver getDriver() {
		if (driver == null)
			System.out.println("Driver not initialized, please check setup method! Returning null driver...");
		return driver;
	}

	public WebElement getElementFromXpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}

	// This function will take screenshot
	public void takeSnapShot(WebDriver webdriver, String methodname1) throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		String fileName = "\\test-output\\Execution_Reports\\Screenshots\\" + methodname1 + "\\"
				+ new SimpleDateFormat("dd-MM-yyyy HH-mm").format(new Date()) + ".jpg";
		String screenShot = System.getProperties().get("user.dir") + fileName;

		// Save the screenshot.
		FileUtils.copyFile(SrcFile, new File(screenShot));
	}

	static void waitForPageLoad(WebDriver wdriver) {

		new Predicate<WebDriver>() {

			@Override
			public boolean apply(WebDriver input) {
				return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
			}

		};
		System.out.println("Page is in ready state");
	}
}