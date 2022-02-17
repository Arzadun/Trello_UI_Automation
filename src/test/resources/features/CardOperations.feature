Feature: As a user we will be able to perform CRUD operations on cards in board

  Background:
    Given : I'm on the Trello boards page
    When : I enter to my workspace

  Scenario: User is able to create new cards on lists
    When : I click on Add card in a specific list
    And : I enter the title of the card
    And : Click on the Add card button
    Then : The card is created

  Scenario: User is able to update existing cards on lists
    When : I open the first card in a specific list
    And : I update the description of the card
    And : Click on save button
    Then : The card is updated

  Scenario: User is able to archive cards on lists
    When : I click on the first card in a specific list
    And : I click on archive button
    Then : The card is archived

