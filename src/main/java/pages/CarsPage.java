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

    @FindBy(xpath = "//div[@id='cookiesBar']/button")
    public WebElement buttonAcceptCoockies;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Марка']")
    public WebElement selectBrand;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Район']")
    public WebElement selectDistrict;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Тип кузова']")
    public WebElement selectType;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Вид топлива']")
    public WebElement selectFuel;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цена от']")
    public WebElement inputPriceMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цена до']")
    public WebElement inputPriceMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цвет']")
    public WebElement selectColor;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Коробка передач']")
    public WebElement selectTransmission;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Год выпуска от']")
    public WebElement inputYearMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Год выпуска до']")
    public WebElement inputYearMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Состояние машины']")
    public WebElement selectCondition;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Доп. опции']")
    public WebElement selectOptions;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Пробег от']")
    public WebElement inputMilageMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Пробег до']")
    public WebElement inputMilageMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Растаможена']")
    public WebElement selectCustomsCleared;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Объем двигателя от']")
    public WebElement inputEngineMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Объем двигателя до']")
    public WebElement inputEngineMax;
}