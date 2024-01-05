#Author: shweta.sonar@extentia.com
Feature: NPA functionality

  @NPA_Pretest_Posttest1 @SmokeTest
  Scenario Outline: To verify user is able to submit NPA pretest quiz and form.
    Given I navigate to the "<url>"
    When I click on the Activities Menu
    And I am able to see "<Expectedactivity>" activity
    And I click on Begin Activity button
    Then I am able to see NPA Popup "<ExpectedNpaPopupTitle>"
    And I enter all the details "<ExpectedDegree>" "<ExpectedMedicalSpeciality>"
    And I click on submit button
    #And I select answers for Pretest Question
    #And I click on Continue activity button
    #And I click on Continue activity button on popup
    And I click on Continue to Post test button
    And I select answers for posttest question
    And I click on continue to evaluation button
    And Again I click on continue to evaluation button on popup
    And I am able to see login page "<ExpectedLoginTitle>"
    And Enter "<Username>" and "<Password>" and click on Login button
    And The evaluation screen should be displayed with popup
    And I click on the ContinuetoEvaluation button
    And I answer Evaluation Question
    And I click on the SubmitEvaluation button
    And The activity is completed and user navigated on Congratulations screen

    #And I logout from the application.
    #Examples:
    #| url                                  | Expectedactivity                                                          | ExpectedNpaPopupTitle   | ExpectedDegree      | ExpectedMedicalSpeciality | PreTQ_Ans1  | PreTQ_Ans2              | PreTQ_Ans3                                        | PreTQ_Ans4 | PreTQ_Ans5                                                        | PreTQ_Ans6                                                                            | PostTQ_Ans1 | PostTQ_Ans2             | PostTQ_Ans3                                       | PostTQ_Ans4 | PostTQ_Ans5                                                                           | PostTQ_Ans6                                                       | ExpectedLoginTitle     | Username                 | Password    | EvQAns_1 | EvQAns2_1          | EvQAns2_2          | EvQAns2_3          | EvQAns2_4          | EvQAns2_5          | EvQAns_3 | EvQAns_4 | EvQAns_5                         | EvQAns_6                                               | EvQAns_7           | EvQAns_8                                                                     | EvQAns_9                          | EvQAns_10 | EvQAns_11 | EvQAns_12 |
    #| https://uat.practicingclinicians.com | Automation Sanity NPA Copy 603_Advancing Care for HR+/HER2- Breast Cancer | Welcome to the PCE site | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib | Scheduling a follow-up visit in 3 months to complete a pill count | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib  | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Scheduling a follow-up visit in 3 months to complete a pill count | Log In To Your Account | testra+72@mailinator.com | Shivani@123 | Yes      | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | Yes      | Yes      | Yes, I plan to implement changes | Apply the latest guidelines or literature in this area | 1 (Very confident) | Yes, shifted me from awareness of the topic to agreement with best practices | Acceptance by peers or colleagues |       123 |       456 |       789 |
    Examples: 
      | url                              | Expectedactivity                           | ExpectedNpaPopupTitle   | ExpectedDegree      | ExpectedMedicalSpeciality | PreTQ_Ans1  | PreTQ_Ans2              | PreTQ_Ans3                                        | PreTQ_Ans4 | PreTQ_Ans5                                                        | PreTQ_Ans6                                                                            | PostTQ_Ans1 | PostTQ_Ans2             | PostTQ_Ans3                                       | PostTQ_Ans4 | PostTQ_Ans5                                                                           | PostTQ_Ans6                                                       | ExpectedLoginTitle     | Username                  | Password    | EvQAns_1 | EvQAns2_1          | EvQAns2_2          | EvQAns2_3          | EvQAns2_4          | EvQAns2_5          | EvQAns_3 | EvQAns_4 | EvQAns_5                         | EvQAns_6                                               | EvQAns_7           | EvQAns_8                                                                     | EvQAns_9                          | EvQAns_10 | EvQAns_11 | EvQAns_12 |
      | https://practicingclinicians.com | Advancing Care for HR+/HER2- Breast Cancer | Welcome to the PCE site | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib | Scheduling a follow-up visit in 3 months to complete a pill count | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib  | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Scheduling a follow-up visit in 3 months to complete a pill count | Log In To Your Account | testra+107@mailinator.com | Shivani@123 | Yes      | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | Yes      | Yes      | Yes, I plan to implement changes | Apply the latest guidelines or literature in this area | 1 (Very confident) | Yes, shifted me from awareness of the topic to agreement with best practices | Acceptance by peers or colleagues |       123 |       456 |       789 |
