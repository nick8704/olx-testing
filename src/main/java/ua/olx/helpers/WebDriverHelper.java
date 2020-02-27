package ua.olx.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriverHelper {

    private static final int DEFAULT_WAIT = 5;

    private static WebDriver driver;
    private static int implicitWait;
    private static int explicitWait;

    static  {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver80");
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver024");
        initializeWaitsFromPropertiesFile();
    }

    public static WebDriver getChromeDriver() {
        if (driver == null) {
            switch (getDriverNameProperty()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "gecko":
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }

    private static void initializeWaitsFromPropertiesFile() {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("WebDriver.properties");
            properties.load(inputStream);
            implicitWait = convertingStringToInt(properties.getProperty("implicitWait"));
            explicitWait = convertingStringToInt(properties.getProperty("explicitWait"));
        } catch (IOException e) {
            setDefaultWait();
        }
    }

    private static String getDriverNameProperty() {
        String webDriverName;
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("WebDriver.properties");
            properties.load(inputStream);
            webDriverName = properties.getProperty("driver");
        } catch (IOException e) {
            webDriverName = setDefaultWebDriver();
        }
        return webDriverName;
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

    private static String setDefaultWebDriver() {
        return "chrome";
    }

    public static int getImplicitWait() {
        return implicitWait;
    }

    public static int getExplicitWait() {
        return explicitWait;
    }

}