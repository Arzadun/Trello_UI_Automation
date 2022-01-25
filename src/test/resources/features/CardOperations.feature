Feature: As a user we will be able to perform CRUD operations on cards in board
  Scenario: User is able to create new cards on lists
    Given : I login into Trello page
    When : I enter to my workspace
    And : I click on Add card in a specific list
    And : I enter the title of the card
    And : Click on the Add card button
    Then : The card is created

  Scenario: User is able to update existing cards on lists
    Given : I login into Trello page
    When : I enter to my workspace
    And : I open the first card in a specific list
    And : I update the description of the card
    And : Click on save button
    Then : The card is updated

  Scenario: User is able to archive cards on lists
    Given : I login into Trello page
    When : I enter to my workspace
    And : I click on the first card in a specific list
    And : I click on archive button
    Then : The card is archived

  Scenario Outline : User is able to create cards on all lists in board
    Given : I login into Trello page
    When : I enter to my workspace
    And : I click on Add card in a <List>
    And : I enter the title of the card
    And : Click on the Add card button
    Then : The card is created
    Examples:
      | List   |
      | To Do  |
      | Doing  |
      | Done   |
