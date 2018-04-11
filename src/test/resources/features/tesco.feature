@tesco @example
Feature: When Browsing Tesco Homepage
  As a user
  I want navigate tesco homepage
  So that I can select tesco homepage navbar menu options

  Scenario: Should be able to select GROCERIES from homepage navbar
    Given user is on the tesco homepage
    When user clicks groceries from the homepage menu option
    Then user can see expected page title