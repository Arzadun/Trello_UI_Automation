package steps;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks extends BasePage {

    public Hooks(){
        super(driver);
    }
    @After
    public void takeScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            byte[] src=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.log(scenario.getName()+ "is failed");
            scenario.attach(src,   "image/png" + src, scenario.getName() );
        }
    }
}
