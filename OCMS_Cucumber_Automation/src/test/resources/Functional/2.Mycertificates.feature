#Author:Hira.kumar@extentia.com
@tag
Feature: Mycertificatesdownload

  @Mycertificate @SmokeTest
  Scenario Outline: Download mycertificate
    Given user enter the "<url>" using "<username>" "<password>"
    When User Click on myprofile
    And locate Mycertificates
    Then Verify the certificate is prasent or not

    Examples:
    | url                    | username                | password |
    | https://proce.com/login | Hira.kumar@extentia.com | Test@123 |
    #Examples: 
      #| url                         | username                | password |
      #| https://uat.proce.com/login | Hira.kumar@extentia.com | Test@123 |
