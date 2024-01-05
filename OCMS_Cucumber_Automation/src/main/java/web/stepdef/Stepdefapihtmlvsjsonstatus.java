package web.stepdef;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.*;

public class Stepdefapihtmlvsjsonstatus {
	

@Given("The user use the endpoint {string}")
public void the_user_use_the_endpoint(String string) {
    
}
@When("The body contains the id {string}")
public void the_body_contains_the_id(String string) {
    
}
@Then("the response should contain the value {string}")
public void the_response_should_contain_the_value(String string) {
    
}

		public static void apiTest(String id,String expectedText) {
			String response=given().log().all().header("Content-Type","application/json")
					.header("APPID","f0c0d5febde258d145d1e1604126233e")
					.header("APPSIGNATURE","f0c0d5febde258d145d1e1604126233ef0c0d5febde258d145d1e1604126233e")
					.body("{\r\n"
							+ "   \"parameters\" : {  \r\n"
							+ "   \"activity_id\" : \""+id+"\"\r\n"
							+ "   },\r\n"
							+ "   \"apiInfo\":\r\n"
							+ "   {\"devicetype\":\"mobile\"}\r\n"
							+ "}\r\n"
							+ "")
	        .when().post("https://omni-channel-api-cea-dev.herokuapp.com/automationTest/activitydetails")
	        .then().log().all().assertThat().statusCode(200).extract().response().asString();
			Assert.assertTrue(response.contains(expectedText));
			
		}
		

		}
	