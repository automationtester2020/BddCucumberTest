Feature: Register new user and login to nop commerce

  Background: navigate to url
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then I should be navigated to home page
  Scenario: Register new user by providing data in all mandatory fields


    When I click on register link
    Then I should be navigated to register page
    When I select gender
    And I enter firstName lastName email password confirmPassword
      | firstName | lastName  | email             | password  | confirmPassword |
      | test1     | user1     |testuser1@nop.com  | testing   | testing         |

    And I click on register button
    Then registration should be successful


  Scenario: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link from navbar
    Then  I should be able to navigate to log in page
    When  I enter email 'qauser1@nop.com'
    And   I enter password 'testing'
    And   I click on log in button
    Then  I should be logged in successfully