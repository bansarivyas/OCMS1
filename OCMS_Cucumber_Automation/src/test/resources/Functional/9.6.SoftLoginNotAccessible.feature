#Author: Tanaya.Jadhav@extentia.com
@SoftLoginWhatshouldnotaccess
Feature: What should not be accessible Soft Login user

  @SoftloginMyEvent @SmokeTest
  Scenario Outline: To Verify User should not be able to access the My Event page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on My Event tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brc a-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginCourseInProgress @SmokeTest
  Scenario Outline: To Verify User should not be able to access the Course in progress page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on Course in progress tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginMyRecipts @SmokeTest
  Scenario Outline: To Verify User should not be able to access the MyRecipts page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on MyRecipts tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginMyCertificates @SmokeTest
  Scenario Outline: To Verify User should not be able to access the MyCertificates page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on MyCertificates tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginMySurveys @SmokeTest
  Scenario Outline: To Verify User should not be able to access the MySurveys page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on MySurveys tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginMyProfile @SmokeTest
  Scenario Outline: To Verify User should not be able to access the MyProfile page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on MyProfile tab from my Profile list
    Then I redirects to the Hard login page,with "<password_Required_banner>" on it

    Examples: 
      | Url                                                                                                                      | password_Required_banner |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        |

  @SoftloginLogout @SmokeTest
  Scenario Outline: To Verify User should not be able to access the logout page
    Given I hit Soft login "<Url>", and redirects to an activity
    When I click on Logout tab from my Profile list
    Then I redirects to the "<Hard_login>" page

    Examples: 
      | Url                                                                                                                      | Hard_login             |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Log In To Your Account |
