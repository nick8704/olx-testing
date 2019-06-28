package ua.olx.pages;

import org.openqa.selenium.WebDriver;
import ua.olx.helpers.WebDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class CarsPage {

    WebDriver driver = WebDriverHelper.getChromeDriver();

    public CarsPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, WebDriverHelper.getImplicitWait()), this);
    }

    @FindBy(xpath = "//div[@id='cookiesBar']/button")
    public WebElement buttonAcceptCoockies;

    @FindBy(id = "search-submit")
    public WebElement buttonSearch;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Марка']")
    public WebElement selectBrand;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Район']")
    public WebElement selectDistrict;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Тип кузова']")
    public WebElement selectType;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Вид топлива']")
    public WebElement selectFuel;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цена от']")
    public WebElement selectPriceMin;

    @FindBy(xpath = "//fieldset//ul[@id='param-grid-2']//input[@defaultval='от...']")
    public WebElement inputPriceMin;

    @FindBy(xpath = "(//fieldset//ul[@id='param-grid-2']//input[@defaultval='от...']/../..//span)[2]")
    public WebElement iconClearSelectPriceMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цена до']")
    public WebElement selectPriceMax;

    @FindBy(xpath = "//fieldset//ul[@id='param-grid-2']//input[@defaultval='до...']")
    public WebElement inputPriceMax;

    @FindBy(xpath = "(//fieldset//ul[@id='param-grid-2']//input[@defaultval='до...']/../..//span)[2]")
    public WebElement iconClearSelectPriceMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Цвет']")
    public WebElement selectColor;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Коробка передач']")
    public WebElement selectTransmission;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Год выпуска от']")
    public WebElement selectYearMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Год выпуска до']")
    public WebElement selectYearMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Состояние машины']")
    public WebElement selectCondition;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Доп. опции']")
    public WebElement selectOptions;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Пробег от']")
    public WebElement selectMilageMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Пробег до']")
    public WebElement selectMilageMax;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Растаможена']")
    public WebElement selectCustomsCleared;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Объем двигателя от']")
    public WebElement selectEngineMin;

    @FindBy(xpath = "//fieldset//span[@data-default-label='Объем двигателя до']")
    public WebElement selectEngineMax;

    @FindBy(xpath = "//*[contains(@class, 'small suggestinput')]/li/a")
    public List<WebElement> brandsList;

    @FindBy(xpath = "//div[contains(@class, 'wrapper clr rel')]")
    public WebElement wrapper;
}