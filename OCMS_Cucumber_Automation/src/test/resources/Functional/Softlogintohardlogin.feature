Feature: accessing soft login URL with already hard login

  @SoftloginForHardLoginUser @SmokeTest
  Scenario Outline: Hard Login user should override the SoftLogin User
    Given user login to website by using "<Uname>" and "<Pword>"
    When user hit Soft login "<Url>",user redirects to an activity
    Then user  "<string>" override the Soft Login user

    Examples: 
      | Uname                        | Pword     | Url                                                                                                                  | Hard_LoggedIn_User           |
      | tanaya.jadhav+4@extentia.com | Admin@123 | https://test.clinicaloptions.com/CE-CME/administration-and-training/multimedia-activity/18290-26235?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | tanaya.jadhav+4@extentia.com |
