@groceries @pending
Feature: When Browsing Tesco Groceries Page
  As a user
  I want navigate tesco groceries page
  So that I can select all menu options available

  # Example scenario using enums for data parameterization
  Scenario: Should be able to select all GROCERIES menu items
    Given user is on the tesco groceries page
    Then should be able to select all menu options
