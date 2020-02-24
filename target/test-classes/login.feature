Feature: Search
  As a SalesForce User
  I want to be able to login
  So that I can access my account

  Scenario: Verify the login credential is working correctly with invalid User ID and Password
    Given the user is on Accountspage
    When I enter User ID as “aashna_patel@hotmail\.com””
    And I enter Password as “123”
    And click Submit
    Then user should not be logged in successfully