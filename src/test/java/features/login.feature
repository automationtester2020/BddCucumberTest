Feature: Login to nop commerce application
  In order to login
  As a valid user
  I have to provide user name and password

  Scenario: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link from navbar
    Then  I should be able to navigate to log in page
    When  I enter email 'qauser1@nop.com'
    And   I enter password 'testing'
    And   I click on log in button
    Then  I should be logged in successfully