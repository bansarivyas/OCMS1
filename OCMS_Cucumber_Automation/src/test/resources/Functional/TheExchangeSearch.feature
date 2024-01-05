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
Feature: The Exchange - Search Function

  @Exchange
  Scenario Outline: Search Functionality on The Exchange page
    Given I login to Master Controller with "<username>" and "<password>"
    And Click on The Exchange page from The Exchange master
    When I Serach for a particular "<stringSearch>"
    Then Appropriate "<result>" should display in result list

    Examples: 
      | username                   | password  | stringSearch                 | result                                              |
      | Tanaya.Jadhav@extentia.com | Admin@123 | Honest and Confident Patient | Honest and Confident Patient-Provider Relationships |

  @Catagory
  Scenario Outline: Search Functionality on The Exchange page
   # Given I login to Master Controller with "<username>" and "<password>"
    And Click on The Catagory page from The Exchange master
    When I Serach for a particular catagory "<stringSearch>"
    Then Appropriate catagory "<result>" should display in result list

    Examples: 
      | username                   | password  | stringSearch | result              |
      | Tanaya.Jadhav@extentia.com | Admin@123 | Preventive   | Preventive Medicine |
