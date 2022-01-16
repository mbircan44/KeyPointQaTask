@alert
Feature: User can be handle alert

  Scenario Outline: Login as a driver
    Given  the user is on the home page
    When  the user navigate to "<tab>" and "<module>"
    And the user sees alert and click and handle
    And the user click and waits and handle
    And the user clicks and handles and verify "<message1>"
    Then the users enters "<note>" and verifies "<message>"


    Examples:
      | tab                     | module | message1        | note    | message             |
      | Alerts, Frame & Windows | Alerts | You selected Ok | welcome | You entered welcome |

