#Author: shivani.rane@extentia.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@AnonymousUserFlow
Feature: Anonymous User Flow

  @AnonymousActivity @SmokeTest
  Scenario Outline: Anonymous User Flow for an Activity marked Anonymous
    Given Login to the "<URL>"
    When I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I click on Begin Activity
    And I click on Continue to Post Test button
    And Answer the Post-Test Question "<PT1>" "<PT2>" "<PT3>" "<PT4>"
    And I Click  on Continue to Evaluation button
    Then I verify the user is redirected to LoginPageScreen
    And Enter the "<Username>" and "<Password>" and click on Login button
    Then Evaluation screen should be displayed with popup
    And I click on ContinuetoEvaluation button
    And I answer the Evaluation Question "<Q1_1>" "<Q1_2>" "<Q1_3>" "<Q1_4>" "<Q2_1>" "<Q2_2>" "<Q2_3>" "<Q2_4>" "<Q2_5>" "<Q2_6>" "<Q3_1>" "<Q3_2>" "<Q3_3>" "<Q3_4>" "<Q4>" "<Q5>" "<Q6>" "<Q7>"
    And I click on SubmitEvaluation button
    Then Activity got completed and land on Congratulations screen
    Then I Logout from the application

    #Examples:
    #| URL                         | Username                 | Password    | TabName    | ActivityName                                   | PT1                                                                                                                            | PT2                                                                                                          | PT3                                                              | Q1_1               | Q1_2               | Q1_3               | Q1_4               | Q2_1               | Q2_2               | Q2_3               | Q2_4               | Q2_5               | Q2_6               | Q3_1               | Q3_2               | Q3_3               | Q3_4               | Q4                                     | Q5                                 | Q6                     | Q7  |
    #| https://uat.proce.com/login | testra+71@mailinator.com | Shivani@123 | Activities | Confronting Inequities in Immuno-Oncology Care | Implementing social determinants of health screening to target populations who may benefit from more frequent phone follow-ups | Educate providers on the lower rates of non-White patients agreeing to trial participation vs White patients | Worsened between White populations vs most non-White populations | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | I do not directly provide patient care | Applied latest guidelines/evidence | Formulary restrictions | 250 |
    Examples: 
      | URL                     | Username                  | Password    | TabName    | ActivityName                                            | PT1                                                                                                                               | PT2                                                                                                             | PT3                                                                 | PT4  | Q1_1               | Q1_2               | Q1_3               | Q1_4               | Q2_1               | Q2_2               | Q2_3               | Q2_4               | Q2_5               | Q2_6               | Q3_1               | Q3_2               | Q3_3               | Q3_4               | Q4                                        | Q5                                    | Q6                        | Q7  |
      | https://proce.com/login | testra+107@mailinator.com | Shivani@123 | Activities | Copy_870_Confronting Inequities in Immuno-Oncology Care | C. Implementing social determinants of health screening to target populations who may benefit from more frequent phone follow-ups | D. Educate providers on the lower rates of non-White patients agreeing to trial participation vs White patients | D. Worsened between White populations vs most non-White populations | F. 5 | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | 1 (Strongly Agree) | E. I do not directly provide patient care | D. Applied latest guidelines/evidence | A. Formulary restrictions | 250 |
