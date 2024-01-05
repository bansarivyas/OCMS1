#Author: Tanaya.Jadhav@extentia.com
@tag1
Feature: ClinicalThought functionality

  @ClinicalThoughtActivity @SmokeTest
  Scenario Outline: Clinical Thought Functionality
    #Given User login into "<url>" using "<email>" "<password>"
    And user click on activities tab and Search for the CTactivity
    When user clicks on the learn more button of an activity,user redirects to the activity Details page
    And user clicks on BeginActivity OR ReviewActivity
    Then "<Activity>" details should display
    And User is able to submit the Comment and verify the "<popup>"

  #  Examples: 
  #    | url                     | email                        | password  | Activity      | popup                                                                                |
   #   | https://proce.com/login | Tanaya.Jadhav+4@extentia.com | Admin@123 | Key Takeaways | Comment added successfully. Moderated comments will be approved and posted by admin. |

       Examples: 
      | url                     | email                        | password  | Activity      | popup                                                                                |
      | https://proce.com/login | Tanaya.Jadhav+4@extentia.com | Admin@123 | Key Takeaways | Comment added successfully. Moderated comments will be approved and posted by admin. |