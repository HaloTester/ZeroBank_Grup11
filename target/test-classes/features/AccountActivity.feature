Feature: Account Activity Page

  Background:
    Given the user is on the login page
    And the user enters "username" "password"
    When the user is on the "Account Activity" page

  Scenario: Verify Account Activity Page title
    Then the user should be able to see "Zero - Account Activity"

  Scenario: Verify drop down default option
    Then the user should be able to see "Savings" as a default	option

  @wip
  Scenario: Verify drop down options
    Then the user should be able to see following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |
  @wip
  Scenario: Verify column names
    Then Transactions table should have to following columns
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |