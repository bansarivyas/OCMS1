Feature: Forgot Password

  @resetpassword @SmokeTest
  Scenario Outline: Reset Password
    Given I Enter the "<url>"
    When I click on the Forgot Password link
    And enter email address "<email>"
    And click on the Reset Password button
    Then I should receive an email with instructions to reset my password

    Examples: 
      | url                     | email                     |
      | https://proce.com/login | hira.kumar@mailinator.com |

    #Examples: 
      #| url                         | email                     |
      #| https://uat.proce.com/login | hira.kumar@mailinator.com |
