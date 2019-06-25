package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {

    public WebDriverHelper() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver75");
    }

    public WebDriver getChromeDriver() {
        return new ChromeDriver();
    }

}