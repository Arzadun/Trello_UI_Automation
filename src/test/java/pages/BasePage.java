package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage  {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sebas\\Documents\\drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);

    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    private WebElement find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void cleanBrowser(){
        driver.quit();
    }

    public void writeKeys(String locator, String criteria){
        find(locator).clear();
        clickElement(locator);
        find(locator).sendKeys(criteria);
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public boolean isDisplayed(String locator){
        return find(locator).isDisplayed();
    }

    public String textFromElement(String locator){
        return find(locator).getText();
    }

    public List<WebElement> bringAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    public String getFirstElementOnList(List<String> elements){
        return elements.get(0);
    }



}