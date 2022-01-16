@drag
Feature: Interactions

  Scenario Outline: Drag and drop

    Given  the user is on the home page
    When  the user navigate to "<tab>" and "<module>"
    And the user does drag and drop
    And the user verify the "<message>"

    Examples:
      | tab          | module    |message|
      | Interactions | Droppable |Dropped!|
