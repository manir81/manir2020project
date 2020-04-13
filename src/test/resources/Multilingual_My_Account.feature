Feature: Check Account in Multilingual Cart online shop
  I want to use this template for Check Order feature

  Scenario: Successfull check Account in Multilingual
    Given I want to open a chrome Browser
    And I want navigate URL Multiligual cart
    When I want to Sign In with valid credintial
    And I want to Navigate to My Account Page
    Then I Want to see all available options below
    |My Oders|
    |Profile|
    |My Return Requests|
    |Change Password|
    |My Favorite Products|

   