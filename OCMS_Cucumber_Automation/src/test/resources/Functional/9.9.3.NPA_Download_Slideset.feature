#Author:shweta.sonar@extentia.com
Feature: Download Slideset functionality

  @NPA_DownloadSlideSet @SmokeTest
  Scenario Outline: Verify that user is unable to download Slideset without filling the details on popup.
    Given I navigate to the "<url>"
    When User click on activities tab and Search for the activity
    And User clicks on learn more button
    And User clicks on Download SlideSet button
    And User clicks on Cancel button without filling the details on popup
    And Verify user is navigated back to activity detail page "<Exp_Heading>"
    And User clicks on Download SlideSet button
    And User able to fill details in NPA Popup "<ExpectedDegree>" "<ExpectedMedicalSpeciality>" and click on submit button
    #And User selects the answers for pretest
    #And User clicks on continue to activity button
    #And User clicks on continue to activity button on popup
    #And User clicks on Download Slideset
    Then The Slideset ppt file should be downloaded successfully

    Examples: 
      | url                         | ExpectedDegree      | ExpectedMedicalSpeciality | Exp_Heading | username                 | password    |
      | https://clinicaloptions.com | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Activities  | testra+107@mailinator.com | Shivani@123 |

    #Examples: 
      #| url                             | ExpectedDegree      | ExpectedMedicalSpeciality | Exp_Heading | username                 | password    |
      #| https://uat.clinicaloptions.com | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Activities  | testra+72@mailinator.com | Shivani@123 |
