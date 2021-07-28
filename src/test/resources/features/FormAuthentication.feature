Feature: Automate Form Authentication

  Background:
    Given I get the landing page

  # Test Case 1:
  # Scenario 1 & 2
  @ti-001 @ti-001-01
  Scenario Outline: Form Authentication - Invalid username - Negative Testing
    When I click on "Form Authentication"
    And I enter "<username>" and "<password>"
    And I click on login button
    Then I verify "<errorMessage>"

    Examples:
      | username | password             | errorMessage               |
      | TomSmith | SuperSecretPassword! | Your username is invalid!  |
      | tomsmith | supersecretpassword! | Your password is invalid!  |

  # Test Case 1:
  # Scenario 3
  @ti-001 @ti-001-02
  Scenario: Form Authentication - Positive Testing
    When I click on "Form Authentication"
    And I enter "tomsmith" and "SuperSecretPassword!"
    And I click on login button
    Then I verify successful login message "You logged into a secure area!"
    And I click on logout button
    Then I verify successful logout message "You logged out of the secure area!"