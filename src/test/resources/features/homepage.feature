@tesco @example @homepage
Feature: When Browsing Tesco Homepage
  As a user
  I want navigate tesco homepage
  So that I can select tesco homepage nav bar menu options

    # Example scenario without parameterization
  @homepage-groceries
  Scenario: Should be able to select GROCERIES from homepage nav bar
    Given user is on the tesco homepage
    When user clicks groceries from the homepage menu option
    Then user can see expected page title

    # Example scenario outline with BDD data table for data parameterization
  @homepage-all-navbar @smoke
  Scenario Outline: Should be able to select MULTIPLE OPTIONS from homepage nav bar
    Given user is on the tesco homepage
    When user clicks multiple <navbarOption> option from the homepage navigation bar
    Then user should be on the <expectedPage> page
    Examples:
      |navbarOption        |expectedPage              |
      |Groceries           |Tesco Groceries           |
      |Tesco direct        |Tesco direct              |
      |Tesco Clubcard      |Tesco Clubcard            |
      |Tesco Bank          |Tesco Pay+ Mobile Payment |
