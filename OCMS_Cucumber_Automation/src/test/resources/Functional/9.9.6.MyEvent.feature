#Author: Tanaya.Jadhav@extentia.com
@tag
Feature: My Event Feature Testing
  I want to use this template for my feature file

  @MyEvent
  Scenario Outline: My Event Feature Testng
    #Given I am on Login Page
    #And I give "<email>""<password>" and click on login
    # When I Click on My Events,and serach for particular evants
    And I Click on Learn more ,and I navigate to "<Event_details>" page
    And I Click on Learn more of Activity session and i navigate to "<Activity_Session_Event>" page
    And I Click on Register for in person Event or register of Virtual Event
    And On registration form i click on Confirm and Register
    And I Click on Continue button on Thank you page
    And I click on My profile and My events
    Then "<Event_name>" should be present in My Event page
    And I click on Cancel Registration,so registration should get cancelled

    Examples: 
      | email                        | password  | Event_details                                                         | Activity_Session_Event                                                                           | Event_name                                                                                       |
      | Tanaya.Jadhav+3@extentia.com | Admin@123 | 2023 Update: Practical Case Studies in Outpatient COVID-19 Management | Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management | Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management |

  @MyEvent @Prod @SmokeTest
  Scenario Outline: My Event Feature Testng
    Given I am on Login Page
    And I give "<email>""<password>" and click on login
    When I Click on My Events,and serach for particular evants
    #And I Click on Learn more ,and I navigate to Event details page
    #And I Click on Learn more of Activity session and i navigate to "<Activity_Session_Event>" page
    And I Click on Register for in person Event or register of Virtual Event
    And On registration form i click on Confirm and Register
    And I Click on Continue button on Thank you page
    And I click on My profile and My events
   # Then "<Event_name>" should be present in My Event page
    And I click on Cancel Registration,so registration should get cancelled

    Examples: 
      | email                        | password  | Event_details                                                                                        | Activity_Session_Event                                                                           | Event_name                                                                                           |
      | Tanaya.Jadhav+3@extentia.com | Admin@123 | The X Factor: Following the Science to Confront MDR, DTR, and XDR Gram-Negative Infections - Webinar | Automation_Sanity_Copy_281_2023 Update: Practical Case Studies in Outpatient COVID-19 Management | The X Factor: Following the Science to Confront MDR, DTR, and XDR Gram-Negative Infections - Webinar |
