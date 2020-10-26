Feature: Login to nop commerce application
  In order to login
  As a valid user
  I have to provide user name and password

  Scenario Outline: Verify login with valid credentials
    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link from navbar
    Then  I should be able to navigate to log in page
    When  I enter email "<email>"
    And   I enter password "<password>"
    And   I click on log in button
    Then  I should be logged in successfully

    Examples:
    | email           | password  |
    | qauser1@nop.com | testing   |
    | qauser2@nop.com | testing   |