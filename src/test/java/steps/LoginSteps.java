package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {

    LoginPage login = new LoginPage();

    @Given(": I'm on the login page")
    public void i_m_on_the_login_page() {
        login.navigateToLogin();
    }
    @When(": I enter my credentials")
    public void i_enter_my_credentials() {
        login.writeMail();
    }
    @And(": Click on the login button")
    public void click_on_the_login_button() {

    login.clickOnLoginButton();

    }
    @Then(": Login is successfully")
    public void login_is_successfully() {
        System.out.println("Step 4");
    }


}
