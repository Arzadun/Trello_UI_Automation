package pages;


import static pages.BasePage.navigateTo;

public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    public void navigateToLogin(){
        navigateTo("https://trello.com/login");
    }

}
