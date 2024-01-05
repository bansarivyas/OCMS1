Feature: feature to test profile update functionality

  @SmokeTest @UpdateProfile
  Scenario Outline: check profile update is successfull with valid credentials
    #Given I entered "<url>" using "<username>" "<password>"
    When Click on edit icon
    And Update any details
    Then Click on save button
    And verify the updated changes "<FirstName>"

    Examples: 
      | url                    | username                    | password | FirstName |
      | https://uat.proce.com/ | hira.kumar+123@extentia.com | Test@123 | Hira123   |
