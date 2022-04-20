Feature: Orange Hrm Automation

  @tag1
  Scenario: Test Login Credentials
    Given Open the firefox & start application
    When I enter valid username & password
    Then user should able to login successfully

  @Apply
  Scenario: Click on Applytab
    When No leave type

  @Myleave
  Scenario: Click on My Leave tab
    When search leave list
      | 2022-01-01 | 2022-04-12 |
    And If records found save the records

  @AddMyEntitlements
  Scenario: Click on Entitlements tab
    When Add My Entitlements

  @EmployeeEntitlements
  Scenario: Click on Entitlements tab
    When Check Employee Entitlements

  @MyEntitlements
  Scenario: Click on Entitlements tab
    When Check My Entitlements

  @leavelist
  Scenario: Click on leavelist tab
    When Enter leave list details
      | 2022-01-01 | 2022-04-12 | Admin | A | O |
    And If records found save the records

  @Assignleavelist
  Scenario: Click on leave list tab
    When Enter assign leave form and click assign
      | John Smith | 9 | 2022-01-01 | 2022-04-12 | Family Function |
    And If records found save the records
