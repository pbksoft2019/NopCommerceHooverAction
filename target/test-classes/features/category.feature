Feature: Category

  Background:
    Given user is on home page

  @category
  Scenario Outline: User can navigate to correct category page,
  so that he can use all product features from categories

    When user clicks on "<category>" link from top menu
    Then user should able to navigate to "<related category page>" successfully
    Examples:
      | category          | related category page                          |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |


    @hoover
  Scenario: user should be able to perform hoover action
    When user hoover over category "Computers" link
    And click on subcategory "Notebooks" link
    Then user should be able to navigate to subcategory page "notebooks" successfully