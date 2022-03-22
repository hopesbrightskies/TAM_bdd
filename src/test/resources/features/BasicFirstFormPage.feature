Feature: Validate input fields on the page

  Scenario Outline: Single input field validation
    Given I open the <url> page
    When I write <text> into the single input field
    And Press the show message button
    Then The <text> should be displayed

    Examples:
      | url                                                          | text        |
      | https://demo.seleniumeasy.com/basic-first-form-demo.html     | Lorem Ipsum |
