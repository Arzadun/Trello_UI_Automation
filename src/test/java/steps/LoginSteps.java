package steps;

import io.cucumber.java.en.*;
import pages.AtlassianPage;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();
    AtlassianPage atlassian = new AtlassianPage();
    @Given(": I'm on the login page")
    public void i_m_on_the_login_page() {
        login.navigateToLogin();
    }
    @When(": I enter my mail")
    public void i_enter_my_mail() {
        login.writeMail();
    }
    @And(": Click on the login button")
    public void click_on_the_login_button() {

    login.clickOnLoginButton();

    }

    @When(": I enter my password on Atlassian page")
    public void i_enter_my_password_on_atlassian_page() {
        atlassian.writePassword();

    }

    @And(": Click on the login submit button")
    public void click_on_the_login_submit_button() {

        atlassian.clickOnLoginButton();

    }

    @Then(": Login is successfully")
    public void login_is_successfully() {

        try
        {
            Thread.sleep(20000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


}
