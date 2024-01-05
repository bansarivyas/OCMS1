#Author:Tanaya.Jadhav@extentia.com
@tag
Feature: Download PDF functionality

  @DownloadPDF @SmokeTest
  Scenario Outline: Download PDF functionality
    #Given User login into "<url>" using "<email>" "<password>"
    And user click on activities tab and Search for the activity
    When user clicks on the learn more button of an activity,user redirects to the activity page
    And user clicks on Download PDF
    Then PDF should get downloaded successfully

  #  Examples: 
  #    | url                     | email                        | password  |
  #    | https://proce.com/login | Tanaya.Jadhav+4@extentia.com | Admin@123 |
      
         Examples: 
      | url                     | email                        | password  |
      | https://proce.com/login | Tanaya.Jadhav+4@extentia.com | Admin@123 |
