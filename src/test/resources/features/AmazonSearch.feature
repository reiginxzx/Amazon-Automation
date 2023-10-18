Feature: Test Amazon Search Functionality

    As a Customer when I search for a product,  I want to see of the second item on the third page is avaiable for purchase and can be added to the cart

    @outline
    Scenario Outline: As Customer when I search for a product,  I want to see if the second option on the third page is avaible for purchase
    Given The user navigate to www.amazom.com
    When Searches for "<producto>"
    And Navigates to the third page
    And Select the second item
    Then The user is able to add it to the cart

        Examples:
            | producto |
            | switch   |


