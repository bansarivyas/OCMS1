#Author:Hira.kumar@extentia.com
@activityfeaturetesting
Feature: Audio Feature Testing

  @activitytest @SmokeTest @cm
  Scenario Outline: Activities Feature Testng
    #Given I user enter the "<url>" using "<username>" "<password>"
    And I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I navigate to Begin Activity page

    Examples: 
      | url                               | username                | password    | TabName    | ActivityName                                                                    |
      | https://clinicaloptions.com/login | testra+71@mailinator.com | Shivani@123 | Activities | Audio From Practical Strategies to Address Ongoing Gaps in Viral Hepatitis Care |
       #Examples: 
      #| url                               | username                | password    | TabName    | ActivityName                                                                    |
      #| https://uat.clinicaloptions.com/login | testra+71@mailinator.com | Shivani@123 | Activities | Audio From Practical Strategies to Address Ongoing Gaps in Viral Hepatitis Care |
