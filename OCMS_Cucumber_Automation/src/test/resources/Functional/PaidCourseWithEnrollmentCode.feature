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
#@tag
#Feature: Paid Course With Enrollment Code
#
  #@EnrollementCode
   #Scenario Outline: To verify Paid Course With Enrollment Code
    #Given I hit "<URL>" and enter "<Username>" and "<Password>" to login in Proce Website
    #And  Click on Subscribtin and Click on “Learn More; button on the an activity
    #When On the Activity Details page I click on ‘Enroll for Activity' 
    #And I Select Enrollment code radio button
    #And I Enter "<Valid_Code>" in Textbox and click on Ok button
    #Then Activity should get started I Should land on the "<Content>" page.
 #
    #Examples: 
     