Feature: DemoQA login with Excel data

  Scenario Outline: Login using Excel row data
    Given the user opens the DemoQA login page
    When the user logs in with row <rowNumber> from sheet "LoginData"
    Then the login result should match the Excel data

    Examples:
      | rowNumber |
      | 1         |
      | 2         |
      | 3         |
