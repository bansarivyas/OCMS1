#Author: shweta.sonar@extentia.com
Feature: Using soft login user is able to submit the evaluation form and genearate certificate.

  @SoftloginActivity @SanityTesting
  Scenario Outline: To verify activity using softlogin and generate the certificate
    Given I navigate to the application "<Softurl>"
    When I clicks on Begin Activity button
    And I select all answers for Pretest Question
    And I clicks on Continue activity button
    And I clicks on Continue activity button on popup

    #And I clicks on Continue to Post test button
    #And I select all answers for posttest question
    #And I clicks on continue to evaluation button
    #And Again I clicks on continue to evaluation button on popup
    #Then I am able to see the password banner page "<ExpectedLoginTitle>" and enterdetails "<Email Address>" "<Password>"
    #And The evaluation popup should be displayed
    #And I clicks on the ContinuetoEvaluation button
    #And I select all answer for evaluation question
    #And I clicks on the SubmitEvaluation button
    #And The activity is completed and certificate should be generated
    Examples: 
      | Softurl                                                                                                                                                                      | Expectedactivity                                                          | PreTQ_Ans1  | PreTQ_Ans2              | PreTQ_Ans3                                        | PreTQ_Ans4 | PreTQ_Ans5                                                        | PreTQ_Ans6                                                                            | PostTQ_Ans1 | PostTQ_Ans2             | PostTQ_Ans3                                       | PostTQ_Ans4 | PostTQ_Ans5                                                                           | PostTQ_Ans6                                                       | ExpectedLoginTitle     | Email Address       | Password  | EvQAns_1 | EvQAns2_1          | EvQAns2_2          | EvQAns2_3          | EvQAns2_4          | EvQAns2_5          | EvQAns_3 | EvQAns_4 | EvQAns_5                         | EvQAns_6                                               | EvQAns_7           | EvQAns_8                                                                     | EvQAns_9                          | EvQAns_10 | EvQAns_11 | EvQAns_12 |
      | https://uat.practicingclinicians.com/CE-CME/oncology/automation-sanity-npa-copy-603-advancing-care-for-hrher2-breast-cancer/24205?token=79958E12-7A7D-49E1-8D9A-2B268A67AEBF | Automation Sanity NPA Copy 603_Advancing Care for HR+/HER2- Breast Cancer | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib | Scheduling a follow-up visit in 3 months to complete a pill count | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Abemaciclib | After 2 dose reductions | Providing supportive therapies for adverse events | Ribociclib  | Continue supportive care, hold abemaciclib, and resume at the same dose once resolved | Scheduling a follow-up visit in 3 months to complete a pill count | Log In To Your Account | 52weintraub@aol.com | Pass@1234 | Yes      | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | Yes      | Yes      | Yes, I plan to implement changes | Apply the latest guidelines or literature in this area | 1 (Very confident) | Yes, shifted me from awareness of the topic to agreement with best practices | Acceptance by peers or colleagues |       123 |       456 |       789 |

  @SoftloginLiveEvents @SmokeTest
  Scenario Outline: To verify Live Events using softlogin.
    #Given I Login to the "<URL>"
    #When I clicks on Live Events
    And I navigate to the application "<Softurl>"
    And I click on register button
    And I click on Confirm and Register "<PopTitle>"
    And I click on continue button
    And I click on Join Now button
    Then I am able to see Welcome to the BroadcastMed Live Events Platform "<Expectedwelcometext>"

    Examples: 
      | Softurl                                                                                                                                                                                                                                                                                                                              | PopTitle                         | Expectedwelcometext                              |
      | https://proce.com/events/expert-discussion-on-the-evolving-treatment-landscape-in-ovarian-cancer-pharmacist-considerations-for-optimizing-care/Copy_983_expert-discussion-on-the-evolving-treatment-landscape-in-ovarian-cancer-pharmacist-considerations-for-optimizing-care/10222-10621?token=51618136-5765-4825-B732-030E088F9B12 | Confirm Registration Information | Welcome to the BroadcastMed Live Events Platform |
