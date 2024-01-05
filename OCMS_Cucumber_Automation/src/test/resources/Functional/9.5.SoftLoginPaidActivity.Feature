#Author: Tanaya.Jadhav@extentia.com
Feature: Paid Activity flow for Soft login user

  @paidSoftLogin @SmokeTest
  Scenario Outline: SoftLogin User Should not access the paid activity
    Given I hit Soft login "<Url>", and redirects to The activity
    And i Click on Activity tab , and filter the paid activities
    When I select any paid activity and click on Enroll Now
    And I redirects to the "<password_Required_banner>"
    Then I Enter "<Username>" and "<Password>"
    And i Redirected to "<Payemt_Deatils_page>"

   # Examples: 
   #   | Url                                                                                                                      | password_Required_banner | Username                     | Password  | Payemt_Deatils_page |
    #  | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        | tanaya.jadhav+3@extentia.com | Admin@123 | Checkout            |

        Examples: 
      | Url                                                                                                                      | password_Required_banner | Username                     | Password  | Payemt_Deatils_page |
      | https://proce.com/CE-CME/oncology/brca-testing-and-parpi-in-ebc/100002614?token=052932BB-9F18-4974-BAFB-C5F915CF3496 | Password Required        | tanaya.jadhav+3@extentia.com | Admin@123 | Checkout            |
      