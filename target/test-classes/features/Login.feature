Feature: Validation of login scenarios

    @smoke @sheet
  Scenario: Admin Login
   # Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

    @regression
  Scenario: ESS login
    #Given user is navigated to HRMS application
    When user enters valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in

    @regression
  Scenario: Invalid login
    #Given user is navigated to HRMS application
    When user enters invlaid username and password
    And user clicks on login button
    Then user see error message on the screen