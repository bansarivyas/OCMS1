#Author: shivani.rane@extentia.com
@SlidesetDownloadFeature
Feature: Testing Slideset Download

  @SlidesetDownload @SmokeTest
  Scenario Outline: Testing a slideset download activity
    #Given Login to the "<URL>" and enter "<Username>" and "<Password>" and successfully logged in
    Then I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I verify Download Slideset or Review activity button if present click on it
    Then I verify if Review activity button is clicked and click Download Slideset
    #Then I Logout from the application

    Examples: 
      | URL                     | Username                | Password    | TabName    | ActivityName                                                                                       |
      | https://proce.com/login | testra+1@mailinator.com | Shivani@123 | Activities | Moderate to Severe Atopic Dermatitis: Targeted Pathways and Strategies to Personalize Patient Care |
