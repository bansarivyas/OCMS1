package web.stepdef;

import io.cucumber.java.en.Given;

public class ECaseStepDef extends BaseClass {

	@Given("I Answer the Pre-Test Questions {string} {string} {string} {string} {string} {string} and click on Next button")
	public void i_answer_the_pre_test_questions_and_click_on_next_button(String QPre1, String AnsPre1, String QPre2,
			String AnsPre2, String QPre3, String AnsPre3) throws InterruptedException {

		eCaseFunc.preTestAnswer(QPre1, AnsPre1, QPre2, AnsPre2, QPre3, AnsPre3);
		eCaseFunc.clickNextBtn();
		Thread.sleep(2000);
		eCaseFunc.clickNextBtn();
		Thread.sleep(2000);

	}

	@Given("I Answer the Post-Test Questions {string} {string} {string} {string} {string} {string} and click on Next button")
	public void i_answer_the_post_test_questions_and_click_on_next_button(String QPost1, String AnsPost1, String QPost2,
			String AnsPost2, String QPost3, String AnsPost3) throws InterruptedException {
		
		eCaseFunc.postTestAnswer1(QPost1, AnsPost1);
		eCaseFunc.clickNextBtn();
		Thread.sleep(2000);

	}

}
