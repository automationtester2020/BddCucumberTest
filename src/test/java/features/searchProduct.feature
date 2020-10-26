Feature: search for a product
  Scenario: verify search [roduct functionality from home page
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I enter search text "books" in the seach bar
    And I click on search button
    Then I should see corresponding results
