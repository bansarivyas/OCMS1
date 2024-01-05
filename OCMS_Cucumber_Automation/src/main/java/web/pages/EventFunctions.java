package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EventFunctions {

	private WebDriver driver = null;

	@FindBy(how = How.XPATH, using = "//input[@id='exampleInputEmail1']")
	private WebElement UName;

	@FindBy(how = How.XPATH, using = "//input[@id='password-1']")
	private WebElement Pass;

	@FindBy(how = How.XPATH, using = "//button[text()='Sign in']")
	private WebElement SignInBtn;

	@FindBy(how = How.XPATH, using = "(//div[@title='The Exchange']//a)[1]")
	private WebElement Users;

	@FindBy(how = How.XPATH, using = "(//div[@title='The Exchange']//following::div//a[text()='The Exchange'])[1]")
	private WebElement Roles;

	String TabString = "(//div[@title='%s']//a)[1]";
	String SubTabString = "(//div[@title='%s']//following::div//a[text()='%s'])[1]";

	public EventFunctions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login(String URL, String UserName, String Password) throws InterruptedException {
		driver.get(URL);
		UName.sendKeys(UserName);
		Pass.sendKeys(Password);
		SignInBtn.click();
		Thread.sleep(4000);

	}

	public void goToTab(String TabName, String SubTab) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (TabName.equals("Short URL")) {
			String str = TabName.toLowerCase().replaceAll("\\s", "");
			System.out.println(str);
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(String.format(TabString, str))));
		} else {
			js.executeScript("arguments[0].click();", driver.findElement(By.xpath(String.format(TabString, TabName))));
		}

		if (!SubTab.isEmpty()) {

			js.executeScript("arguments[0].click();",
					driver.findElement(By.xpath(String.format(SubTabString, TabName, SubTab))));

		}

//		driver.findElement(By.xpath(String.format(TabString, TabName))).click();
//		driver.findElement(By.xpath(String.format(SubTabString, TabName, SubTab))).click();

//		Users.click();
//		Roles.click();

	}

}
