#Author:Hira.kumar@extentia.com
Feature: Filters on Activity page

  @SmokeTest @FilterActivity
  Scenario Outline: Filters on Activity page Testing
    #Given We user enter the "<url>" using "<username>" "<password>"
    When We Click on Activities
    And I click on Speciality
    And I Select for particular Speciality Diabetes
    And I click on Topic
    And I Select for particular Topic Diabetes

    Examples: 
      | url                | username                   | password |
      | https://proce.com/ | hira.kumar+48@extentia.com | Test@123 |
