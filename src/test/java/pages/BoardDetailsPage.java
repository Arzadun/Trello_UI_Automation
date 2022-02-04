package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BoardDetailsPage extends BasePage {

    public BoardDetailsPage(){
        super(driver);
    }

    private String toDoList = "(//div[@class='list js-list-content'])[1]";

    private String doingList = "(//div[@class='list js-list-content'])[2]";

    private String doneList = "(//div[@class='list js-list-content'])[3]";

    private String addCardButton = "//a[@class='open-card-composer js-open-card-composer']";

    private String addTitle = "//textarea[@class='list-card-composer-textarea js-card-title']";

    private String submitCardButton = "//input[@class='nch-button nch-button--primary confirm mod-compact js-add-card']";

    private String createdCard = "(//span[@class='list-card-title js-card-name'])[1]";

    private String cardsOnList = "list-card-details js-card-details";

    public void addCardToList(){
        clickElement(toDoList+addCardButton);
    }

    public void addCardTitle(String text){
        writeKeys(addTitle, text);
    }

    public void submitCard(){
        clickElement(submitCardButton);
    }

    public String getCreatedCardTitle(){
        return textFromElement(createdCard);
    }

    public String getFirstCardOfList(List <String> list){
        return getFirstElementOnList(list);
    }
// TODO : Provide list name and the fetch the elements from list
    public List<String> clickFirstCardOnList(){
        List<WebElement> list = bringAllElements(cardsOnList);
        List<String> stringsFromList = new ArrayList<String>();
        for (WebElement e :list){
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
        }


        
    }




