package web.stepdef;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.APICaller;
import util.ExcelDBReader;
import util.Selenium;
import util.Util;
import web.pages.Activities;
import web.pages.AddUser;
import web.pages.AnonymousFunction;
import web.pages.BackEndMasterPages;
import web.pages.CEAcommonwebpage;
//import web.pages.CourseMenuPage;
import web.pages.ClinicalThought;
import web.pages.CourseInProgress;
import web.pages.DownloadPDF;
import web.pages.ECaseFunctions;
import web.pages.EventFunctions;
import web.pages.IDSTFunctions;
import web.pages.HomeloginPage;
import web.pages.MyEvent;
import web.pages.MyReceiptspage;
import web.pages.Mycertificates;
import web.pages.NPA_Download;
import web.pages.ProCEActivitiesPage;
import web.pages.ProCEHomePage;
import web.pages.Registration;
import web.pages.Signup;
import web.pages.ResetPasswordLink;
import web.pages.SlidesetFunction;
import web.pages.SoftLoginForHardLoginUser;
import web.pages.SoftLoginMultiMedia;
import web.pages.SoftLoginMyProfile;
import web.pages.SoftLoginPaidActivity;
import web.pages.SoftloginJourney;
import web.pages.WebinarFunctions;

public class BaseClass {

	public static WebDriver driver;
	public static Selenium selUtil;
	public static Util util;
	public static HomeloginPage homeloginPage;
	public static AddUser adduserpage;
	public static AnonymousFunction anonymoususer;
	public static Registration Registration;
	public static Signup Signup;
	public static MyEvent MyEvent;
	public static DownloadPDF DownloadPDF;
	public static SlidesetFunction slisetfunc;
	public static SoftLoginMyProfile SoftLoginMyProfile;
	public static SoftLoginForHardLoginUser SoftLoginForHardLoginUser;
	public static ProCEActivitiesPage proceactiviesPage;
	public static ProCEHomePage procehomePage;
	public static MyReceiptspage myreceiptpage;
	public static Mycertificates myCertificates;
	public static ResetPasswordLink resetPasswordLink;
	public static NPA_Download npadownloadPage;
	public static SoftloginJourney softloginjourneypage;
	public static Activities activitypage;
	public static IDSTFunctions idstfunc;
	public static WebinarFunctions webifunc;
	public static SoftLoginPaidActivity SoftLoginPaidActivity;
	public static SoftLoginMultiMedia softloginmultimedia;
	public static CourseInProgress courseinprogresspage;
	public static ClinicalThought ClinicalThought;
	public static ECaseFunctions eCaseFunc;
	public static BackEndMasterPages BackEndMasterPages;
	public static EventFunctions eventfunc;
//	public static CourseMenuPage coursemenupage;
	public static APICaller apicall;
	public static CEAcommonwebpage commons;
	public static ExcelDBReader exceldb;

	public void initiateBrowser() {
		String browser = Util.getExecutionProperty("browser");

		switch (browser) {
		case "chrome":

//			System.setProperty ("webdriver.chrome.driver","C:\\Users\\Shivani.Rane\\Downloads\\chromedriver_\\chromedriver.exe" );
//			driver = new ChromeDriver(); 
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--incognito");
//			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//			capabilities.setCapability(ChromeOptions.CAPABILITY, options);

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
		//	options.setHeadless(true);

			// options.addArguments("incognito");

			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);

			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

			driver = new ChromeDriver(options);
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void setPageObjects() {
		selUtil = new Selenium(driver);
		util = new Util();
		homeloginPage = new HomeloginPage(driver);
		adduserpage = new AddUser(driver);
		anonymoususer = new AnonymousFunction(driver);
		Registration = new Registration(driver);
		Signup = new Signup(driver);
		MyEvent = new MyEvent(driver);
		DownloadPDF = new DownloadPDF(driver);
		slisetfunc = new SlidesetFunction(driver);
		SoftLoginMyProfile = new SoftLoginMyProfile(driver);
		SoftLoginForHardLoginUser = new SoftLoginForHardLoginUser(driver);
		proceactiviesPage = new ProCEActivitiesPage(driver);
		procehomePage = new ProCEHomePage(driver);
		myreceiptpage = new MyReceiptspage(driver);
		myCertificates = new Mycertificates(driver);
		resetPasswordLink = new ResetPasswordLink(driver);
		npadownloadPage = new NPA_Download(driver);
		softloginjourneypage = new SoftloginJourney(driver);
		activitypage = new Activities(driver);
		idstfunc = new IDSTFunctions(driver);
		webifunc = new WebinarFunctions(driver);
		SoftLoginPaidActivity = new SoftLoginPaidActivity(driver);
		softloginmultimedia = new SoftLoginMultiMedia(driver);
		courseinprogresspage = new CourseInProgress(driver);
		ClinicalThought = new ClinicalThought(driver);
		eCaseFunc = new ECaseFunctions(driver);
		BackEndMasterPages = new BackEndMasterPages(driver);
		eventfunc = new EventFunctions(driver);
//		coursemenupage = new CourseMenuPage(driver);
		apicall = new APICaller();
		commons = new CEAcommonwebpage(driver);
		exceldb = new ExcelDBReader();
	}

	public void tearDown() {
		driver.quit();
	}
}