Feature: Login page of Salesforce

  @SC01 @regression
  Scenario: Error message validation with invalid credi
    #Given user navigates to salesforce application
    When user enters the username "abc" and password "123"
    And user clicks the login button
    Then user validates the error message


  @multiple
  Scenario Outline: multiple test
    #Given user navigates to salesforce application
    When user enters the username "<user name>" and password "<password>"
    And user clicks the login button
    Then user validates the error message
    Examples:
      | user name | password |
      | praveen   | 123      |
      | help      | 2332     |
      | sam       | 1232     |

  @SC02 @regression
  Scenario: Login validation with valid credi
    Given user navigates to salesforce application
    When user enters the username "aravith" and password "abc"
    And user clicks the login button
    Then verify whether the user navigates to Home page