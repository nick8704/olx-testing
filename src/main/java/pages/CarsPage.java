package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarsPage {

    @FindBy(xpath = "//fieldset//span[@data-default-label=\"Марка\"]")
    public WebElement selectBrand;
}