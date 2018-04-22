@navbar @example @homepage @smoke
Feature: Homepage NavBar Options
  In order to test my framework implementation
  As a user
  I want to navigate to the tesco homepage

    # Example scenario without parameterization
  @navbar-groceries
  Scenario: Should be able to select GROCERIES from homepage nav bar
    Given user is on the tesco homepage
    When user clicks groceries from the homepage menu option
    Then user can see expected page title

    # Example scenario outline with BDD data table for data parameterization
  @navbar-all
  Scenario Outline: Should be able to select MULTIPLE OPTIONS from homepage nav bar
    Given user is on the tesco homepage
    When user clicks multiple <navbarOption> option from the homepage navigation bar
    Then user should be on the <expectedPage> page
    Examples:
      | navbarOption   | expectedPage              |
      | Groceries      | Tesco Groceries           |
      | Tesco direct   | Tesco direct              |
      | Tesco Clubcard | Tesco Clubcard            |
      | Tesco Bank     | Tesco Pay+ Mobile Payment |
