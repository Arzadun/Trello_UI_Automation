package steps;

import io.cucumber.java.en.*;

public class CardOperationsSteps {

    //Background Steps

    @Given("^: I'm on the Trello boards page$")
    public void im_on_the_Trello_boards_page() {
        System.out.println("holis");
        throw new io.cucumber.java.PendingException();
    }

    @When("^: I enter to my workspace$")
    public void i_enter_to_my_workspace() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




//Scenario: User is able to create new cards on lists
    @And("^: I click on Add card in a specific list$")
    public void i_click_on_add_card_in_a_specific_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("^: I enter the title of the card$")
    public void i_enter_the_title_of_the_card() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("^: Click on the Add card button$")
    public void click_on_the_add_card_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("^: The card is created$")
    public void the_card_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Scenario: User is able to update existing cards on lists

    @And("^: I open the first card in a specific list$")
    public void i_open_the_first_card_in_a_specific_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("^: I update the description of the card$")
    public void i_update_the_description_of_the_card() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("^: Click on save button$")
    public void click_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("^: The card is updated$")
    public void the_card_is_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Scenario: User is able to archive cards on lists

    @And("^: I click on the first card in a specific list$")
    public void i_click_on_the_first_card_in_a_specific_list() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("^: I click on archive button$")
    public void i_click_on_archive_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("^: The card is archived$")
    public void the_card_is_archived() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Scenario Outline: User is able to create cards on all lists in board

    @And("^: I click on Add card in a <list> $")
    public void i_click_on_add_card_in_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("^: I set the title of the card$")
    public void i_set_the_title_of_the_card() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And(": I create the card by clicking on the Add card button")
    public void i_create_the_card_by_clicking_on_the_add_card_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then(": The card is created successfully")
    public void the_card_is_created_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
