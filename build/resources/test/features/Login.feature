Feature: Login functionality in Trello page
  Scenario: User with valid credentials is able to login into the page
    Given : I'm on the login page
    When : I enter my credentials
    And : Click on the login button
    Then : Login is successfully