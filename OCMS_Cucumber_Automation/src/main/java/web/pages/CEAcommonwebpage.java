package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.ConstantsAPI;

public class CEAcommonwebpage {

	// Xpaths

	@FindBy(how = How.ID, using = "useremail")
	private WebElement EmailIdXpath;

	@FindBy(how = How.ID, using = "password")
	private WebElement PasswordXpath;

	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Log In']")
	private WebElement LoginBtn;

	@FindBy(how = How.XPATH, using = "//*[normalize-space(text())='Begin Activity']")
	private WebElement BeginActivityBtn;

	@FindBy(how = How.XPATH, using = "//input[@name='currentstep']")
	private WebElement CurrentStep;

	private WebDriver driver = null;

	public CEAcommonwebpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterActivityURL(String BaseURL, String activityURL) {
		driver.get(BaseURL + activityURL);
	}

	public void goToLoginPage() {
		BeginActivityBtn.click();
	}

	public void Login(String UserName, String Password) {
		if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("CCO")) {
			driver.get(ConstantsAPI.BASE_URL_CCO + "login");
		} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("Proce")) {
			driver.get(ConstantsAPI.BASE_URL_PROCE + "login");
		} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("PCE")) {
			driver.get(ConstantsAPI.BASE_URL_PCE + "login");
		}
		EmailIdXpath.sendKeys(UserName);
		PasswordXpath.sendKeys(Password);
		LoginBtn.click();
	}

	public void clickBeginActivity() {
		BeginActivityBtn.click();
	}

	public String getCurrentStep() {
		return CurrentStep.getAttribute("value");
	}

}
