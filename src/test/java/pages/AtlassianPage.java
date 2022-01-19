package pages;

import org.openqa.selenium.JavascriptExecutor;

public class AtlassianPage extends BasePage {
            public AtlassianPage(){
                super(driver);
            }
            private String loginSubmit = "//button[@id='login-submit']";
            private String inputPassword = "//input[@id='password']";
            private String userPassword = "easytoremember1";

public void writePassword (){
    //Added a little wait due sendKeys method is not working for this element
    try
    {
        Thread.sleep(600);
    }
    catch (InterruptedException e)
    {
        e.printStackTrace();
    }
   writeKeys(inputPassword, userPassword);


}

    public void clickOnLoginButton(){
        clickElement(loginSubmit);
    }

}
