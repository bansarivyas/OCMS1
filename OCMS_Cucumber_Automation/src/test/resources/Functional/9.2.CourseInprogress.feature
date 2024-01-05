#Author: shweta.sonar@extentia.com
Feature: Course Inprogress functionality

  @CourseInprogress @SmokeTest 
  Scenario Outline: User Course InProgress
    #Given I login in to application "<url>" by using "<username>" "<password>"
    When I click on activities tab and select the activity
    And I click on begin activity page
    And I click on profile icon and click on Course-in-progress
    Then I am able to see the courses in progress page "<ExpectedCourseTitle>"
    And I am able to see the inprogress course title

    Examples: 
      | url                     | username                          | password   | ExpectedCourseTitle |
      | https://proce.com/login | shweta.sonar+testQA1@extentia.com | Shweta@123 | Courses In Progress |
