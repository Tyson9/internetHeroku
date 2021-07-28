Feature: Automate Key Presses

  Background:
    Given I get the landing page

  # Test Case 3:
  @ti-003 @ti-003-01
  Scenario Outline: Key Presses
    When I click on "Key Presses"
    And I send "<key>" & verify "<text>" displayed in uppercase

    Examples:
      | key | text           |
      | J   | You entered: J |
      | a   | You entered: A |
      | v   | You entered: V |
      | a   | You entered: A |
