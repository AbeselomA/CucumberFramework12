Feature: Adding the employee in HRMS application

  Background: When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option

    @regression @best
  Scenario: Adding one employee from feature file
    #Given user is navigated to HRMS application
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee added successfully

  @123
  Scenario: Adding one employee using cucumber feature file

    And user enters "Zuhoor" "Mujeeb" and "Silvia"
    And user clicks on save button
    Then employee added successfully

    @test
  Scenario Outline:  Adding multiple employees
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    And user provides "<firstName>" "<middleName>" "<lastName>"
    And user clicks on save button
    Then employee added successfully
    Examples:
    |firstName|middleName|lastName|
    |Asel     |MS        |Tolga   |
    |Yazgul   |MS        |Kishan  |
    |Tarik    |MS        |Mujeeb  |
    |Nassir   |MS        |Volkan  |

      @datatable
  Scenario: Add employee using data table
    When user provides multiple employee data and verify they are added
    |firstName|middleName|lastName|
    |Asel     |MS        |Tolga   |
    |Yazgul   |MS        |Kishan  |
    |Tarik    |MS        |Mujeeb  |

     @excel
  Scenario: Adding multiple employees from excel file
       When user adds multiple employees from excel file using "EmployeeData" sheet and verify the user added







