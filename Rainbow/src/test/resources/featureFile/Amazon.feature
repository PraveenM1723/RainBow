Feature: validation of Amazon Apllication

  @amazon
  Scenario: user validates the serach functionality of an application
    Given user navigates to amazon application
    When user enter the search keyword "iphone"
    And user clicks the search icon
    Then user validates the result
    And user validate the title of the page

  @AM01
  Scenario: search result validation
    Given user selects the category in the homepage

  @AM02
  Scenario: mouse actions
    Given user navigates to baby whish list page

  @draganddrop
  Scenario: drap and drop
    Given user handles drap and drop

  @AmazonSearch
  Scenario: user verify title of page
      Given user searches product
      Then user validates the title of search result page
      Then user clicks on the result

  @Amazonerror
  Scenario: Sign in into Amazon to get Error
    Given user provides credi
    Then validate the error

  @Constructor
  Scenario: Constructor Example
    Given Sample