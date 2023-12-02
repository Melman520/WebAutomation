#language:en
Feature: User Registration and Account Management

  Scenario: User creates an account and deletes it successfully

    Given the "user" open browser
    When the user navigates to the url automationexercise.com
    Then the home page should be visible successfully