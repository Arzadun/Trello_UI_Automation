Feature: Login functionality in Trello page
  Scenario: User with valid credentials is able to login into the page
    Given : I'm on the login page
    When : I enter my mail
    And : Click on the login button
    And : I enter my password on Atlassian page
    And : Click on the login submit button
    Then : Login is successfully