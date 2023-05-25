Feature: Solsta Testing zero

  Scenario: validating the Solsta
    Given user with valid credentials they login to setup
    When user validate the application for execution
    Then user logout the application