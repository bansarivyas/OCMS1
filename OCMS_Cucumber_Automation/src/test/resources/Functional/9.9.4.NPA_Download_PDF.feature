#Author:shweta.sonar@extentia.com
Feature: NPA_Download PDF functionality

  @NPA_DownloadPDF @SmokeTest
  Scenario Outline: Verify that user is unable to download PDF without filling the details on popup.
    Given User is navigate to the "<url>"
    When User clicks on the activities tab and Search for the activity
    And User clicks on the learn more button
    And User clicks on the Download button
    And User clicks on the Cancel button without filling the details on popup
    And Verify user is navigated back to the activities listing page "<Exp_Heading>"
    And Again clicks on the learn more button
    And Again clicks on the Download button
    And User able to fill the detail in NPA Popup "<ExpectedDegree>" "<ExpectedMedicalSpeciality>" and click on submit button
    Then The PDF file should be downlaoded successfully

    Examples: 
      | url               | ExpectedDegree      | ExpectedMedicalSpeciality | Exp_Heading |
      | https://proce.com | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Activities  |

    #Examples: 
      #| url                   | ExpectedDegree      | ExpectedMedicalSpeciality | Exp_Heading |
      #| https://uat.proce.com | PhD/ND/EdD(Non-HCP) | Addiction Medicine        | Activities  |
