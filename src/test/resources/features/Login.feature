
Feature: Online-Banking Login Feature

  Background:
    Given the user is on the login page

  Scenario: Authorized users should be able to login to the application
    When the user enters "username" "password"
    Then "Zero - Personal Banking - Loans - Credit Cards" page should be displayed

  Scenario Outline: Users with wrong username or wrong password should not be able to login
    When the user enters "<username>" "<password>"
    Then the user should be able to get "Login and/or password are wrong." message

    Examples:
      | username | password |
      | username | abc      |
      | abc      | password |
      | abc      | abc      |
      |          | password |
      | username |          |
      |          |          |

