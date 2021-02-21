Feature: Basket
  @wip
  Scenario: User should be able to add and delete items
    Given The user on the login page and should be able to login
    Then  The user go to basket and able to see "There is no result" message
    Then The user navigate to main menu and click on the "Atıştırmalık" button
    And The add two items and go to basket
