Feature: Add Employee

  Background:
    # Given user is navigated to HRMS application
#    Given the user navigates to the url
    When user enters a valid email and password
    And clicks on Login Button
    When user clicks on PIM option
    And user clicks on Add Employee button

@datatable  @addEmployee
    Scenario: Adding multiple employees in the dataBase
      When user starts adding the employee
      |firstname| middleName | lastName|
      |   abra   |ca          |dabra   |
      |  leo     | ne         |messi   |

@excel
  Scenario: Adding multiple employees using excel file
    When user adds multiple employee from excel using "EmployeeData" and verify it


