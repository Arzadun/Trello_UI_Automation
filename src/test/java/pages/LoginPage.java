package pages;


public class LoginPage extends BasePage{

    public LoginPage(){
        super(driver);
    }

    private String inputEmail = "//input[@id='user']";
    private String usermail = "sebastiantest@mailinator.com";
    private String loginButton = "//input[@id='login']";

    public void navigateToLogin(){
        navigateTo("https://trello.com/login");
    }

    public void writeMail(){
        writeKeys( inputEmail,usermail);
    }

    public void clickOnLoginButton(){
        clickElement(loginButton);
    }


}
