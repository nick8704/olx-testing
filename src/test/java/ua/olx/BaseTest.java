package ua.olx;

import ua.olx.helpers.LoggerHelper;
import ua.olx.helpers.WebDriverHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.logging.Logger;

import static ua.olx.constants.Url.URL;

public class BaseTest {

    private WebDriver driver;
    protected Logger logger;

    @BeforeSuite
    public void setWebDriver() {
        logger = LoggerHelper.getLogger();
        driver = WebDriverHelper.getChromeDriver();
        driver.manage().window().setSize(new Dimension(500, 500));
    }

    @BeforeTest
    public void openCarsPage() {
        driver.get(URL);
    }

}