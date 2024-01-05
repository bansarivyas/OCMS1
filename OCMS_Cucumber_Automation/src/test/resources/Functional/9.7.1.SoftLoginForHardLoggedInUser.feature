Feature: accessing soft login URL with already hard login

  @SoftloginForHardLoginUser @SmokeTest
  Scenario Outline: Hard Login user should override the SoftLogin User
    Given I login to website by using "<Uname>" and "<Pword>"
    When I hit Soft login "<Url>",I redirects to an activity
    Then I am "<Hard_LoggedIn_User>" override the Soft Login user

    Examples: 
      | Uname                        | Pword     | Url                                                                                                                  | Hard_LoggedIn_User           |
      | tanaya.jadhav+4@extentia.com | Admin@123 | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | tanaya.jadhav+4@extentia.com |
