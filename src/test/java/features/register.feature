Feature: Register new user

  Scenario: Register new user by providing data in all mandatory fields
    Given I navigate to url "https://demo.nopcommerce.com/"
    When I click on register link
    Then I should be navigated to register page
    When I select gender
    And I enter firstName lastName email password confirmPassword
    | firstName | lastName  | email             | password  | confirmPassword |
    | test1     | user1     |testuser1@nop.com  | testing   | testing         |

    And I click on register button
    Then registration should be successful
