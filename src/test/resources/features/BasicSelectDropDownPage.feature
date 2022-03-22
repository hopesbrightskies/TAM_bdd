Feature: Validate selected day in dropdown

  Scenario Outline: Select day
    Given I open the <url> page
    When I select <value> from dropdown menu
    And The <value> is selected
    Then The <text> is displayed

    Examples:
      | url                                                           | value    | text                      |
      | https://demo.seleniumeasy.com/basic-select-dropdown-demo.html | Saturday | Day selected :- Saturday  |