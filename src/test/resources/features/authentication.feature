Feature: I as a user want to authenticate in the demo application sauceLabs to check my credentials

  @CP001
  Scenario Outline: Login to the demo sauceLabs application success
    Given I load test data
      | user   | pass   | expected   |
      | <user> | <pass> | <expected> |
    When I try to login myself using my data authentication
    Then I should see the title screen expected

    Examples:
      | user          | pass         | expected  |
      | standard_user | secret_sauce | PRODUCTS |


  @CP002
  Scenario Outline: Login to the demo sauceLabs application with login failed
    Given I load test data
      | user   | pass   | expected   |
      | <user> | <pass> | <expected> |
    When I try to login myself using my data authentication
    Then I should see the alert with message expected

    Examples:
      | user            | pass         | expected                                                                  |
      | locked_out_user | secret_sauce | Sorry, this user has been locked out.                              |
      | admin           | secret_sauce | Username and password do not match any user in this service. |
