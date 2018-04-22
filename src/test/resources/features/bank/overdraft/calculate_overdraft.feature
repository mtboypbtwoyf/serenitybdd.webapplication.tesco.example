@tescobank @pending
Feature: Calculate Overdraft
  In order to apply an overdraft
  As a Lender
  I want users to be able to understand overdraft charges

  @overdraft
  Scenario Outline: Should be to calculate overdraft charges
    Given an <user type> user is interested in arranging an overdraft
    When the user calculates overdraft charges
    Then the overdraft charges should be displayed
    Examples:
      | user type |
      | new       |
      | existing  |

  @overdraft
  Scenario: Should be to calculate overdraft charges for different terms
    Given a new user is interested in 14 days overdraft
    When the user calculates overdraft charges
    Then the overdraft charges should be displayed
