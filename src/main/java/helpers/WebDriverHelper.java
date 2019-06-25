package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverHelper {

    private static final int DEFAULT_WAIT = 10;

    private static int implicitWait;
    private static int explicitWait;

    public WebDriverHelper() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver75");
        initializeWaitsFromPropertiesFile();
    }

    public WebDriver getChromeDriver() {
        return new ChromeDriver();
    }

    private void initializeWaitsFromPropertiesFile() {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("wait.properties");
            properties.load(inputStream);
            implicitWait = convertingStringToInt(properties.getProperty("implicitWait"));
            explicitWait = convertingStringToInt(properties.getProperty("explicitWait"));
        } catch (IOException e) {
            setDefaultWait();
        }
    }

    private static int convertingStringToInt(String value) {
        int result;
        try {
            result = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            result = DEFAULT_WAIT;
        }
        return result;
    }

    private static void setDefaultWait() {
        implicitWait = DEFAULT_WAIT;
        explicitWait= DEFAULT_WAIT;
    }

    public static int getImplicitWait() {
        return implicitWait;
    }

    public static int getExplicitWait() {
        return explicitWait;
    }

}