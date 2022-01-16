@wid
Feature: Widgets

  Scenario Outline: Hover over

    Given  the user is on the home page
    When  the user navigate to "<tab>" and "<module>"
    And the user hover over the hover me to see button and verify message "<message>"
    And the user hover over the Hover me to see text field and verify message "<message2>"

    Examples:
      | tab     | module    | message                     | message2                        |
      | Widgets | Tool Tips | You hovered over the Button | You hovered over the text field |