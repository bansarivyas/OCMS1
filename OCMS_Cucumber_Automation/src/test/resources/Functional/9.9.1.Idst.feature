#Author: your.email@your.domain.com
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
@IDSTFlowFeature
Feature: Testing IDST flow

  @IDSTFlow @SmokeTest @cm
  Scenario Outline: Testing IDST flow by launching tool
    Given Login to the "<URL>"
    When Enter the "<Username>" and "<Password>" and click on Login button
    And I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I click on Begin Activity
    And I click on Accept Disclaimer and Launch Tool
    And I answer all the questions "<Q1>" "<Ans1>" "<Q2>" "<Ans2>" "<Q3>" "<Ans3>" "<Q4>" "<Ans4>" "<Q5>" "<Ans5>"
    And I click on Submit button
    Then I verify recommendations screen
    Then I answer Clinical Implications answers "<C1>" "<CAns1>" "<C2>" "<CAns2>" "<C3>" "<CAns3>"
    Then I verify responses given

    #Then I logout from CCO application
    Examples: 
      | URL                               | Username                | Password    | TabName    | ActivityName                             | Q1                 | Ans1            | Q2                                | Ans2 | Q3                                           | Ans3                                                                                          | Q4                                              | Ans4      | Q5                                 | Ans5 | C1                                                           | CAns1 | C2                                                 | CAns2                             | C3                                                                                                                      | CAns3 |
      | https://clinicaloptions.com/login | testra+107@mailinator.com | Shivani@123 | Activities | Expert Guidance for the Treatment of CLL | Treatment setting? | Newly diagnosed | Does your patient have a del(17p) | Yes  | Does your patient have any of the following? | History of cardiac arrhythmias, anticoagulation therapy, or difficult-to-control hypertension | What treatment regimen are you planning to use? | Uncertain | Are you a healthcare professional? | Yes  | Did the expert recommendations change your treatment choice? | Yes   | I used this tool to get expert recommendations on: | A specific patient in my practice | If you are a practicing healthcare professional, how many patients with CLL do you provide care for in a typical month? | 1-4   |
      
       #Examples: 
      #| URL                               | Username                | Password    | TabName    | ActivityName                             | Q1                 | Ans1            | Q2                                | Ans2 | Q3                                           | Ans3                                                                                          | Q4                                              | Ans4      | Q5                                 | Ans5 | C1                                                           | CAns1 | C2                                                 | CAns2                             | C3                                                                                                                      | CAns3 |
      #| https://uat.clinicaloptions.com/login | testra+71@mailinator.com | Shivani@123 | Activities | Expert Guidance for the Treatment of CLL | Treatment setting? | Newly diagnosed | Does your patient have a del(17p) | Yes  | Does your patient have any of the following? | History of cardiac arrhythmias, anticoagulation therapy, or difficult-to-control hypertension | What treatment regimen are you planning to use? | Uncertain | Are you a healthcare professional? | Yes  | Did the expert recommendations change your treatment choice? | Yes   | I used this tool to get expert recommendations on: | A specific patient in my practice | If you are a practicing healthcare professional, how many patients with CLL do you provide care for in a typical month? | 1-4   |
