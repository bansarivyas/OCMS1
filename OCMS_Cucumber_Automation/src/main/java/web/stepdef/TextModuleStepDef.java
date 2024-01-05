package web.stepdef;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.json.JSONObject;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import util.ConstantsAPI;

public class TextModuleStepDef extends BaseClass {

	String activity_id;
	static HashedMap<String, String> map = new HashedMap<String, String>();

	@Given("I fetch the API details")
	public void i_fetch_the_api_details() throws IOException, FilloException {
		Recordset activities = exceldb.getDataFromExcel();
		while (activities.next()) {
			activity_id = activities.getField("activity_id");
			System.out.println(activity_id);
			String json = apicall.getActivityDetails(activity_id);
			map.put(activity_id, json);
		}
	}

	@Then("I login to the URL with {string} and {string}")
	public void i_login_to_the_url_with_and(String username, String password) {
		commons.Login(username, password);
	}

	@Then("I open the activity and click Begin Activity")
	public void i_open_the_activity_and_click_begin_activity() {
		if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("CCO")) {
			commons.enterActivityURL(ConstantsAPI.BASE_URL_CCO, ConstantsAPI.ACTIVITY_URL);
		} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("PCE")) {
			commons.enterActivityURL(ConstantsAPI.BASE_URL_PCE, ConstantsAPI.ACTIVITY_URL);
		} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("PROCE")) {
			commons.enterActivityURL(ConstantsAPI.BASE_URL_PROCE, ConstantsAPI.ACTIVITY_URL);
		}
		commons.clickBeginActivity();
	}

	@Then("I Begin Activity and perform end to end scenario")
	public void I_Begin_Activity_and_perform_end_to_end_scenario() {
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.err.println("###########################");
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			System.err.println("###########################");
			try {
				if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("CCO")) {
					commons.enterActivityURL(ConstantsAPI.BASE_URL_CCO, m.getValue().split("#####")[1]);
				} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("PCE")) {
					commons.enterActivityURL(ConstantsAPI.BASE_URL_PCE, m.getValue().split("#####")[1]);
				} else if (ConstantsAPI.PARTNER_NAME.equalsIgnoreCase("PROCE")) {
					commons.enterActivityURL(ConstantsAPI.BASE_URL_PROCE, m.getValue().split("#####")[1]);
				}
				commons.clickBeginActivity();
				if (commons.getCurrentStep().equals("content")) {
					InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
					InContent.testIncorrectAnswersForContent(commons.getCurrentStep(),
							new JSONObject(m.getValue().split("#####")[0]));
					if (commons.getCurrentStep().equals("pretest")) {
						InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
						InContent.testIncorrectAnswers(commons.getCurrentStep(),
								new JSONObject(m.getValue().split("#####")[0]));
					}
				}
				if (commons.getCurrentStep().equals("pretest")) {
					InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
					InContent.testIncorrectAnswers(commons.getCurrentStep(),
							new JSONObject(m.getValue().split("#####")[0]));
					if (commons.getCurrentStep().equals("content")) {
						InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
						InContent.testIncorrectAnswersForContent(commons.getCurrentStep(),
								new JSONObject(m.getValue().split("#####")[0]));
					}
				}
				Thread.sleep(5000);
				if (commons.getCurrentStep().equals("posttest")) {
					InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
					InContent.testCorrectAnswers(commons.getCurrentStep(),
							new JSONObject(m.getValue().split("#####")[0]));
				}
			} catch (Exception e) {
			}
		}

	}

	@Then("I answer the Pre-Test questions incorrectly")
	public void i_answer_the_pre_test_questions_incorrectly() {
		// Wrong answers on page1(using random)
		for (Map.Entry<String, String> m : map.entrySet())
			if (commons.getCurrentStep().equals("pretest")) {
				InContent.testIncorrectAnswers(commons.getCurrentStep(),
						new JSONObject(m.getValue().split("#####")[0]));
			}
	}

	@Then("I answer the Content questions incorrectly")
	public void i_answer_the_content_questions_incorrectly() {
		// Wrong answers on page1(using random)
		for (Map.Entry<String, String> m : map.entrySet())
			if (commons.getCurrentStep().equals("content")) {
				InContent.testIncorrectAnswersForContent(commons.getCurrentStep(),
						new JSONObject(m.getValue().split("#####")[0]));
			}
	}

	@Then("I answer the Poll")
	public void i_answer_the_poll() {
		// Wrong answers on page1(using random)
		for (Map.Entry<String, String> m : map.entrySet())
			InContent.testIncorrectAnswersForPoll(new JSONObject(m.getValue().split("#####")[0]));
	}

	@Then("I get the CME Post-Test page")
	public void i_get_the_cme_post_test_page() {
		// Correct answers on individual post-test page
		for (Map.Entry<String, String> m : map.entrySet())
			if (commons.getCurrentStep().equals("posttest"))
				InContent.testCorrectAnswers(commons.getCurrentStep(), new JSONObject(m.getValue().split("#####")[0]));
	}

	@Then("I give the Evaluation")
	public void i_give_the_evaluation() {
//		if(commons.getCurrentStep().equals("evaluation")) {
		InContent.testEvaluation();
//		}
	}

	@Then("I get the Congratulations page")
	public void i_get_the_congratulations_page() {

	}

}