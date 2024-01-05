//package web.runners;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(features = { "classpath:BackOffice/Signup.feature" },glue = {
//		"web/stepdef" }, plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"pretty" })
//
//public class testRunner extends AbstractTestNGCucumberTests{
//	
//}

package web.runners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import web.stepdef.BaseClass;

////@CucumberOptions(features = {"src/test/resources/Functional"}, 
//@CucumberOptions(features = { "src/test/resources/Functional/Signup.feature" }, glue = {
//		"web/stepdef" }, tags = "@JsonDataTest", dryRun = false, plugin = {
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" }, monochrome = true)
//
//public class Signup extends AbstractTestNGCucumberTests {
//	BaseClass baseClassObj = new BaseClass();
//
//	@BeforeSuite
//	public void init() {
//		baseClassObj.initiateBrowser();
//		baseClassObj.setPageObjects();
//	}
//
//	@AfterSuite
//	public void tearDown() {
//		baseClassObj.tearDown();
//	}
//}


@CucumberOptions(
        tags = "",
        features = "src/test/resources/Functional/Signup.feature",
        glue = "web/stepdef",
        plugin = {}
)

public class Signup extends AbstractTestNGCucumberTests {
BaseClass baseClassObj = new BaseClass();

	@BeforeSuite
	public void init() {
		baseClassObj.initiateBrowser();
		baseClassObj.setPageObjects();
	}

	@AfterSuite
	public void tearDown() {
		baseClassObj.tearDown();
	}
}