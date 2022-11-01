Feature: Application Login

  Scenario: Teacher default login
    Given User is on test server
    When Teacher provides correct credentials
    Then Teacher home page appears



