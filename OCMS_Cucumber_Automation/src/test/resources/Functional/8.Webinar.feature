#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@WebinarFeature
Feature: Testing Webinar feature

  @WebinarExtURL
  Scenario Outline: Testing Webinar feature for External URL
    #Given Login to the "<URL>" and enter "<Username>" and "<Password>" and successfully logged in
    Then I click on "<TabName>" Tab
    And I search for the "<ActivityName>" and open it
    And I click on Begin Activity
    Then I click on Continue button
    Then I verify that I get redirected to the External site "<ValidateURL>"
    Then I come back to ProCE site

    #Then I Logout from the application
    Examples: 
      | URL                         | Username                | Password    | TabName    | ActivityName | ValidateURL         |
      | https://uat.proce.com/login | testra+7@mailinator.com | Shivani@123 | Activities | webinar      | https://www.nfl.com |
