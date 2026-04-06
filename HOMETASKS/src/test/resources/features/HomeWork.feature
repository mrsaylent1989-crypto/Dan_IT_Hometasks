Feature: Home work tests

  Scenario: User use Reminder Page
    Given User open Home Page
    When user clicks on login button
    And user clicks on reminder link
    Then user see reminder form

  Scenario: User create a favorites items
    Given User open Home Page
    When user clicks on favorite button
    And user clicks on create new favorites items
    Then user navigate on his favorite items

  Scenario: User go to feedback page
    Given User open Home Page
    When user clicks on feedback button
    And user clicks on first shop feedback
    Then user navigate to feedback shop page
