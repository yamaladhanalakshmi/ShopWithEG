Feature: verify create account functionality

  Scenario: verify create account with valid credentials
    Given user launchesshopWithEG application
    When user clicks on login link
    When user clicks on createaccount link
    And user enters valid details in create account page
    And user clicks on createaccount button
    Then user will be created account
