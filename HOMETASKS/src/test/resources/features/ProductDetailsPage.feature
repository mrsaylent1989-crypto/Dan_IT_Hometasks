Feature: Product Details Page verification

  Scenario: Verify user can be navigated to the correct product details page
    Given User open Home Page
    When user enter "xBox" into search field
    And user clicks on search button
    And user remember 2 product name on Search Result Page
    And user clicks on 2 picture on Search Result Page
    Then user verify product title is correct on Product Details Page
