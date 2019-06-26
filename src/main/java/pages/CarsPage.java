package pages;

import helpers.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CarsPage {

    public CarsPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(WebDriverHelper.getChromeDriver(), WebDriverHelper.getImplicitWait()), this);
    }

    @FindBy(xpath = "//fieldset//span[@data-default-label=\"Марка\"]")
    public WebElement selectBrand;
}