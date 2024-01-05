Feature: Receipt Feature View

  @SmokeTest
  Scenario Outline: User views receipt details
    Given I entered a "<url>" using "<username>" "<password>"
    When Click on profile
    And My receipts
    Then Click on view receipt details
    And View the message "<Expectedmessage>"

    Examples:
    | url                    | username                | password | Expectedmessage |
    | https://proce.com/login | hira.kumar@extentia.com | Test@123 | Receipt Details |
    #Examples: 
      #| url                         | username                | password | Expectedmessage |
      #| https://uat.proce.com/login | hira.kumar@extentia.com | Test@123 | Receipt Details |
