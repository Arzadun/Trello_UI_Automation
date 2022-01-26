package pages;

public class BoardDetailsPage extends BasePage {

    public BoardDetailsPage(){
        super(driver);
    }

    private String toDoList = "(//div[@class='list js-list-content'])[1]";

    private String doingList = "(//div[@class='list js-list-content'])[2]";

    private String doneList = "(//div[@class='list js-list-content'])[3]";

    private String addCardButton = "//a[@class='open-card-composer js-open-card-composer']";



}
