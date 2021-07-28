Feature: Automate Infinite Scroll

  Background:
    Given I get the landing page

  # Test Case 2:
  @ti-002 @ti-002-01
  Scenario: Infinite Scroll
    When I click on "Infinite Scroll"
    And I scroll to the bottom twice
    And I scroll back to the top
    Then I verify "Infinite Scroll" text