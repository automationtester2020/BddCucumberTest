Feature: Update number of items in shopping cart

  Scenario: Add product HTC to cart, update the number of items and print the totals
    Given I navigate to url "https://demo.nopcommerce.com/"
    Then I click on Add To Cart button of HTC product
    Then  I click on Shopping Cart link in the top bar of the homepage
    Then I print the product name of HTC product
    Then I print the subtotal price value of product HTC
    Then I print the shipping value of product HTC
    Then I print the tax value of product HTC
    When I clear the number of items in the item box
    Then I update the number of items to '2'
    Then I click on update shopping cart button
    Then I print the updated subtotal price value of product HTC
    Then I print the updated shipping value of product HTC
    Then I print the updated tax value of product HTC

