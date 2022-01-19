package pages;



public class BoardsPage extends BasePage {

    public BoardsPage(){
        super(driver);
    }

    private String loginValidationElement = "//h3[@class='boards-page-section-header-name']";

    public boolean loginValidationElementIsPresent(){
        return isDisplayed(loginValidationElement);
    }

}
