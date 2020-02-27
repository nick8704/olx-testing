package ua.olx;

import ua.olx.helpers.WebDriverHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static ua.olx.constants.Url.URL;

public class BaseTest {

    private WebDriver driver = WebDriverHelper.getWebDriver();

    @BeforeMethod
    public void openCarsPage() {
        driver.manage().timeouts().implicitlyWait(WebDriverHelper.getImplicitWait(), TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(500, 500));
        driver.get(URL);
    }

}