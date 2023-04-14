package Utils;

import Steps.pageInitializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class commonMethods extends pageInitializers {
  public static WebDriver driver;
    public static void openBrowserAndLaunchApplication() {
        configReader.readProperties();
        String browserType = configReader.getPropertyValue("browserType");
        switch (browserType) {
            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                break;

            case "IE":
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = new EdgeDriver();
                break;

        }
        driver.manage().window().maximize();
        driver.get(configReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(constants.WAIT_TIME));
        initializePageObjects();

    }
    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
    public static void doClick(WebElement element) {
//        code
//        for explicit wait
//        for the element to be clickable
        element.click();
    }

    public static void closeBrowser() {
        driver.close();
    }

}
