import helpers.LoggerHelper;
import helpers.WebDriverHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.logging.Logger;

import static constants.Url.URL;

public class BaseTest {

    private WebDriver driver;
    protected Logger logger;

    @BeforeSuite
    public void setWebDriver() {
        logger = new LoggerHelper().getLogger();
        driver = new WebDriverHelper().getChromeDriver();
        driver.manage().window().setSize(new Dimension(500, 500));
    }

    @BeforeTest
    public void openCarsPage() {
        driver.get(URL);
    }

}