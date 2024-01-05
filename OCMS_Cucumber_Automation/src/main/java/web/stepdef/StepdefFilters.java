package web.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefFilters extends BaseClass {

	@Given("We user enter the {string} using {string} {string}")
	public void we_user_enter_the_using(String string, String string2, String string3) throws InterruptedException {

		driver.get(string);
		driver.findElement(By.xpath("//span[@class='d-none d-sm-block'][normalize-space()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string3);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);

	}

	@When("We Click on Activities")
	public void i_click_on_activities() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='ACTIVITIES']")).click();

	}

	@When("I click on Speciality")
	public void i_click_on_speciality() throws InterruptedException {
		driver.findElement(By.xpath("//h2[@id='headingOne']/button[@type='button']")).click();
		Thread.sleep(5000);

	}

	@When("I Select for particular Speciality Diabetes")
	public void i_select_for_particular_speciality_diabetes() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='remove340D3CD7-E118-47FA-9AD2-ACF2D8CFE123']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//h2[@id='headingOne']/button[@type='button']")).click();

	}

	@And("I click on Topic")
	public void i_click_on_topic() throws InterruptedException {
		// driver.findElement(By.xpath("//button[normalize-space()='Topic']")).click();

		Thread.sleep(6000);
		// System.out.println(driver.findElement(By.id("headingTwo")).getText());
		driver.findElement(By.xpath("//h2[@id='headingTwo']/button[@type='button']")).click();
		// driver.findElement(By.xpath("//h2[@id='headingTwo']/button[@type='button']")).click();
		// driver.findElement(By.xpath("//h2[@id='headingTwo']/child::button")).click();

		// WebDriverWait wait3 = new WebDriverWait(driver, 10);
		// wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[normalize-space()='Topic']")));

	}

	@When("I Select for particular Topic Diabetes")
	public void i_select_for_particular_topic_diabetes() throws InterruptedException {
		selUtil.hardWait(10);
		// driver.findElement(By.xpath("//input[@id='remove5735D261-1EF9-47D0-9849-D55B247DD2D8']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,470)");
		driver.findElement(By.xpath("(//input[@id='remove5735D261-1EF9-47D0-9849-D55B247DD2D8'])[1]")).click();

		// WebElement element = driver.findElement(By.linkText("Learn More"));
		// JavascriptExecutor executor = (JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", element);
		// hira.kumar+48@extentia.com
		// driver.findElement(By.xpath("//a[@id='btnurl']")).click();

		// p[@class='outof']

		// driver.findElement(By.xpath("//a[@href='https://uat.proce.com/profile']//label[@class='first_last']//span[contains(text(),'HH')]")).click();
		// driver.findElement(By.xpath("//a[@class='dropdown-item logout
		// hdercls']")).click();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@class='clear-btn']")).click();
//		Thread.sleep(3000);

	}

}
