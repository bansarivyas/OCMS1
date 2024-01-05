Feature: Validate the API responce for HTML vs JSOn

  Scenario: Verify the API responce
    Given The user use the endpoint "https://omni-channel-api-cea-dev.herokuapp.com/automationTest/activitydetails"
    When The body contains the id "12066"
    Then the response should contain the value "Pre-test"
