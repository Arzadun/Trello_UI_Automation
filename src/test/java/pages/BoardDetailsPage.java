package pages;

import org.openqa.selenium.WebElement;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class BoardDetailsPage extends BasePage {

    public BoardDetailsPage() {
        super(driver);
    }
    private String firstElementOnList = "";

    private String toDoList = "(//div[@class='list js-list-content'])[1]";

    private String doingList = "(//div[@class='list js-list-content'])[2]";

    private String doneList = "(//div[@class='list js-list-content'])[3]";

    private String addCardButton = "//a[@class='open-card-composer js-open-card-composer']";

    private String addTitle = "//textarea[@class='list-card-composer-textarea js-card-title']";

    private String submitCardButton = "//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']";

    private String createdCard = "(//span[@class='list-card-title js-card-name'])[1]";

    private String cardsOnList = "//span[@class='list-card-title js-card-name']";

    private String saveButtonEditMode = "//input[@class='nch-button nch-button--primary wide js-save-edits']";

    public void addCardToList() {
        clickElement(toDoList + addCardButton);
    }

    public void addCardTitle(String text) {
        writeKeys(addTitle, text);
    }

    public void submitCard() {
        clickElement(submitCardButton);
    }

    public String getCreatedCardTitle() {
        return textFromElement(createdCard);
    }

    public String getFirstCardOfList(List<String> list) {
        return getFirstElementOnList(list);
    }

    // TODO : Provide list name and then fetch the elements from list
    public String getFirstCardOnList(String listName) {
        firstElementOnList = "//h2[text()[contains(.,'"+listName+"')]]/parent::div/following-sibling::div//a//span";
        return firstElementOnList;
    }
       /* List<WebElement> list = bringAllElements(cardsOnList);
        List<String> stringsFromList = new ArrayList<String>();
        for (WebElement e : list) {
            stringsFromList.add(e.getText());
        }


        for (int i = 0; i < stringsFromList.size(); i++) {
            stringsFromList.get(i);
            String abc = stringsFromList.get(i);
            if ( listName == stringsFromList.get(i)){

                firstElementOnList = "//h2[text()[contains(.,'To Do')]]/parent::div/following-sibling::div//a//span";

                return firstElementOnList;
            }
        }
        return  "List not found";
        }*/

    public void clickFirstCardOnList(){
        clickElement(firstElementOnList);
    }

    public void saveChanges(){
        clickElement(saveButtonEditMode);
    }

    public void updateCardTitle(String text){
        writeKeys(firstElementOnList, text);
    }
    public String getFirstCardOnListText() {
        return textFromElement(firstElementOnList);
    }

    }





