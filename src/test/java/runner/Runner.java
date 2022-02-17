package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;



@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"
 },

        features = "src/test/resources/Features",
        glue = "steps"

        // monochrome = true,
        //tags = "@Test"
)
public class Runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.cleanBrowser();
    }
}