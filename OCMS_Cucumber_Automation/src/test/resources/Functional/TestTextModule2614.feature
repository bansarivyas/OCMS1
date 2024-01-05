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
@TestJsonData
Feature: Title of your feature
  I want to use this template for my feature file

  @JsonDataTest
  Scenario Outline: Testing the TextModule type of Activities
    Given I fetch the API details
    Then I login to the URL with "<username>" and "<password>"
    Then I Begin Activity and perform end to end scenario
    Then I answer the Content questions incorrectly
    Then I get the CME Post-Test page
    Then I give the Evaluation
    Then I get the Congratulations page

    Examples: 
      | username              | password    |
      | testra@mailinator.com | Shivani@123 |
