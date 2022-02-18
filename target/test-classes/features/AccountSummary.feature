
Feature: Account Summary page

  Background:
    Given the user is on the login page
    And the user enters "username" "password"
    When the user is on the "Account Summary" page


  Scenario: Verify Account Summary Page title
    Then the user should be able to see "Zero - Account Summary"

  Scenario: Verify account types
    Then Account summary page should have to following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Verify column names
    Then Credit Accounts table should have to following columns
      | Account     |
      | Credit Card |
      | Balance     |

