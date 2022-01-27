package pages;



public class BoardsPage extends BasePage {

    public BoardsPage(){
        super(driver);
    }

    private String loginValidationElement = "//h35[@class='boards-page-section-header-name']";

    private String cardsOperationElement = "//a[@class='board-tile']//div[text()[contains(.,'test')]]";

    public boolean loginValidationElementIsPresent(){
        return isDisplayed(loginValidationElement);
    }

    public void enterToCardValidationsWorkspace(){
        clickElement(cardsOperationElement);
    }

}
