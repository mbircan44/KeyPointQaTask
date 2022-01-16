@log
Feature: Login as different

  @valid
  Scenario Outline: login function with valid credential for different user
    Given  the user is on the login page
    When the user log in using "<username>" and "<password>"
    Then the user should see "<text>"
    Examples:
      | username                | password     | text     |
      | standard_user           | secret_sauce | PRODUCTS |
      | problem_user            | secret_sauce | PRODUCTS |
      | performance_glitch_user | secret_sauce | PRODUCTS |


  @invalid
  Scenario Outline: login function with invalid credential for different user
    Given  the user is on the login page
    When the user log in using following credentials "<username>" and "<password>"
    Then  the following "<message>" should be displayed
    Examples:
      | username        | password     | message                                                                   |
      | user1_username  | 12345        | Epic sadface: Username and password do not match any user in this service |
      | Ali             | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | Can             | 1111         | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce | Epic sadface: Username is required                                        |
      | problem_user    |              | Epic sadface: Password is required                                        |





