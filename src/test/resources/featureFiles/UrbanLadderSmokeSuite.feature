Feature: Smoke suite of UrbanLadder Automation

  @smoke
  Scenario Outline: navigate to Bookshelves page from the UrbanLadder homepage
    Given user should naviagate to urbanladder website
    When user enters the search value as "<value>"
    And user click on the search icon
    Then user should be navigated to bookshelves result page

    Examples: 
      | value       |
      | Bookshelves |

  @smoke
  Scenario Outline: Apply the filters on bookshelves in the bookshelves page
    Given user should naviagate to urbanladder website
    When user enters the search value as "<value>"
    And user click on the search icon
    And user selects the price range of the bookshelves
    And user selects the category type of the bookshelves
    And user click on exclude out of stock
    And user selects the sort type "<type>"
    Then user should be able to view filterd bookshelves

    Examples: 
      | value       | type               |
      | Bookshelves | Price: High to Low |

  @smoke
  Scenario: Navigate to Studychairs Page from UrbanLadder homepage
    Given user should naviagate to urbanladder website
    When user clicks on the Study menu item
    And user click on the Studychairs submenu item
    Then user should be navigated to the Studychairs page

  @smoke
  Scenario Outline: validate and retrieve all items under any one of sub-menu items of Living menu item in the UrbanLadder homepage
    Given user should naviagate to urbanladder website
    When user clicks on menu item "<menuItemName>"
    Then user should able to view all items under "<subMenuItemName>"

    Examples: 
      | menuItemName | subMenuItemName  |
      | Living       | Seating & Chairs |
      | Living       | Living Storage   |

  @smoke
  Scenario: Navigate to Giftcards page from urbanLadder homepage
    Given user should naviagate to urbanladder website
    When user clicks on Gift Cards
    Then user should be navigated to the Gift Cards page

  @smoke
  Scenario: Choose an occasion on the GiftCards page
    Given user should naviagate to urbanladder website
    When user clicks on Gift Cards
    When user selects an occasion
    Then verify the occasion is chosen or not

  @smoke
  Scenario Outline: Customize the gift card with valid amount
    Given user should naviagate to urbanladder website
    When user clicks on Gift Cards
    When user selects an occasion
    When user enter the valid amount "<money>"
    And user selects the date
    And user clicks on next button
    Then user should be able to view Nice So who is this lucky person

    Examples: 
      | money  |
      |   999  |
      |  5000  |
      | 500001 |
