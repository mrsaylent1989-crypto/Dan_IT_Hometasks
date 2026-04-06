Feature: Home Page functionality veridication

  Scenario: Verify search field wors correctly
    Given User open Home Page
    When user enter "iPhone" into search field
    And user clicks on search button
    Then title contains "iPhone" search word on Search Result Page

  Scenario: Verify main catalog menu appears after clicking on catalog button
    Given User open Home Page
    When User clicks on main catalog Button
    Then verify main catalog menu appears