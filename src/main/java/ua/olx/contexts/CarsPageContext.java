package ua.olx.contexts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ua.olx.helpers.WebDriverHelper;
import ua.olx.pages.CarsPage;

import static ua.olx.constants.DefaultFieldsValues.*;

public class CarsPageContext {

    WebDriverWait wait = new WebDriverWait(WebDriverHelper.getChromeDriver(), WebDriverHelper.getExplicitWait());
    CarsPage carsPage = new CarsPage();

    /**
     * =======================================================================================================
     * ACTIONS
     * =======================================================================================================
     */

    public CarsPageContext clickButtonAcceptCoockies() {
        if(carsPage.buttonAcceptCoockies.isDisplayed()) {
            carsPage.buttonAcceptCoockies.click();
        }
        return this;
    }

    public CarsPageContext clickButtonSearch() {
        carsPage.buttonSearch.click();
        return this;
    }

    public CarsPageContext clickIconClearSelectPriceMin() {
        wait.until(ExpectedConditions.elementToBeClickable(carsPage.iconClearSelectPriceMin)).click();
        carsPage.selectPriceMin.click();
        return this;
    }

    public CarsPageContext clickIconClearSelectPriceMax() {
        wait.until(ExpectedConditions.elementToBeClickable(carsPage.iconClearSelectPriceMax)).click();
        carsPage.selectPriceMax.click();
        return this;
    }

    public CarsPageContext expandSelectBrand() {
        carsPage.selectBrand.click();
        return this;
    }

    public CarsPageContext fillInputPriceMin(String value) {
        carsPage.selectPriceMin.click();
        carsPage.inputPriceMin.sendKeys(value, Keys.ENTER);
        return this;
    }

    public CarsPageContext fillInputPriceMax(String value) {
        carsPage.selectPriceMax.click();
        carsPage.inputPriceMax.sendKeys(value, Keys.ENTER);
        return this;
    }

    public CarsPageContext fillInputMilageMin(String value) {
        carsPage.selectMilageMin.click();
        carsPage.inputMilageMin.sendKeys(value, Keys.ENTER);
        return this;
    }

    public CarsPageContext setMilageMin(String value) {
        carsPage.selectMilageMin.click();
        carsPage.getMilageMinSelectItem(value).click();
        return this;
    }

    public CarsPageContext fillInputMilageMax(String value) {
        carsPage.selectMilageMax.click();
        carsPage.inputMilageMax.sendKeys(value, Keys.ENTER);
        return this;
    }

    public CarsPageContext setMilageMax(String value) {
        carsPage.selectMilageMax.click();
        carsPage.getMilageMaxSelectItem(value).click();
        return this;
    }

    /**
     * =======================================================================================================
     * VERIFYING
     * =======================================================================================================
     */

    public CarsPageContext verifySelectBrandValueIsDefault() {
        String actual = carsPage.selectBrand.getText();
        String expected = BRAND;
        Assert.assertEquals(actual, expected, "Verifying that select BRAND has default value:");
        return this;
    }

    public CarsPageContext verifySelectDistrictValueIsDefault() {
        String actual = carsPage.selectDistrict.getText();
        String expected = DISTRICT;
        Assert.assertEquals(actual, expected, "Verifying that select DISTRICT has default value:");
        return this;
    }

    public CarsPageContext verifySelectTypeValueIsDefault() {
        String actual = carsPage.selectType.getText();
        String expected = TYPE;
        Assert.assertEquals(actual, expected, "Verifying that select TYPE has default value:");
        return this;
    }

    public CarsPageContext verifySelectFuelValueIsDefault() {
        String actual = carsPage.selectFuel.getText();
        String expected = FUEL;
        Assert.assertEquals(actual, expected, "Verifying that select FUEL has default value:");
        return this;
    }

    public CarsPageContext verifySelectPriceMinValueIsDefault() {
        boolean result = wait.until(ExpectedConditions.textToBePresentInElement(carsPage.selectPriceMin, PRICE_MIN));
        Assert.assertTrue(result, "Verifying that select PRICE_MIN has default value:");
        return this;
    }

    public CarsPageContext verifySelectPriceMaxValueIsDefault() {
        boolean result = wait.until(ExpectedConditions.textToBePresentInElement(carsPage.selectPriceMax, PRICE_MAX));
        Assert.assertTrue(result, "Verifying that select PRICE_MAX has default value:");

        return this;
    }

    public CarsPageContext verifySelectColorValueIsDefault() {
        String actual = carsPage.selectColor.getText();
        String expected = COLOR;
        Assert.assertEquals(actual, expected, "Verifying that select COLOR has default value:");
        return this;
    }

    public CarsPageContext verifySelectTransmissionValueIsDefault() {
        String actual = carsPage.selectTransmission.getText();
        String expected = TRANSMISSION;
        Assert.assertEquals(actual, expected, "Verifying that select TRANSMISSION has default value:");
        return this;
    }

    public CarsPageContext verifySelectYearMinValueIsDefault() {
        String actual = carsPage.selectYearMin.getText();
        String expected = YEAR_MIN;
        Assert.assertEquals(actual, expected, "Verifying that select YEAR_MIN has default value:");
        return this;
    }

    public CarsPageContext verifySelectYearMaxValueIsDefault() {
        String actual = carsPage.selectYearMax.getText();
        String expected = YEAR_MAX;
        Assert.assertEquals(actual, expected, "Verifying that select YEAR_MAX has default value:");
        return this;
    }

    public CarsPageContext verifySelectConditionValueIsDefault() {
        String actual = carsPage.selectCondition.getText();
        String expected = CONDITION;
        Assert.assertEquals(actual, expected, "Verifying that select CONDITION has default value:");
        return this;
    }

    public CarsPageContext verifySelectOptionsValueIsDefault() {
        String actual = carsPage.selectOptions.getText();
        String expected = OPTIONS;
        Assert.assertEquals(actual, expected, "Verifying that select OPTIONS has default value:");
        return this;
    }

    public CarsPageContext verifySelectMilageMinValueIsDefault() {
        String actual = carsPage.selectMilageMin.getText();
        String expected = MILAGE_MIN;
        Assert.assertEquals(actual, expected, "Verifying that select MILAGE_MIN has default value:");
        return this;
    }

    public CarsPageContext verifySelectMilageMaxValueIsDefault() {
        String actual = carsPage.selectMilageMax.getText();
        String expected = MILAGE_MAX;
        Assert.assertEquals(actual, expected, "Verifying that select MILAGE_MAX has default value:");
        return this;
    }

    public CarsPageContext verifySelectCustomsClearedValueIsDefault() {
        String actual = carsPage.selectCustomsCleared.getText();
        String expected = CUSTOMS_CLEARED;
        Assert.assertEquals(actual, expected, "Verifying that select CUSTOMS_CLEARED has default value:");
        return this;
    }

    public CarsPageContext verifySelectEngineMinValueIsDefault() {
        String actual = carsPage.selectEngineMin.getText();
        String expected = ENGINE_MIN;
        Assert.assertEquals(actual, expected, "Verifying that select ENGINE_MIN has default value:");
        return this;
    }

    public CarsPageContext verifySelectEngineMaxValueIsDefault() {
        String actual = carsPage.selectEngineMax.getText();
        String expected = ENGINE_MAX;
        Assert.assertEquals(actual, expected, "Verifying that select ENGINE_MAX has default value:");
        return this;
    }

    public CarsPageContext verifySelectPriceMinValue(String value) {
        String expectedValue = "от " + value + " грн.";
        boolean result = wait.until(ExpectedConditions.textToBePresentInElement(carsPage.selectPriceMin, expectedValue));
        Assert.assertTrue(result, "Verifying select PRICE_MIN value:");
        return this;
    }

    public CarsPageContext verifySelectPriceMaxValue(String value) {
        String expectedValue = "до " + value + " грн.";
        boolean result = wait.until(ExpectedConditions.textToBePresentInElement(carsPage.selectPriceMax, expectedValue));
        Assert.assertTrue(result, "Verifying select PRICE_MAX value:");
        return this;
    }

    public CarsPageContext verifySearchResultListIsNotEmpty() {
        boolean result = carsPage.searchResultCarsModelList.size() > 0;
        Assert.assertTrue(result, "Verifying search result list is not empty:");
        return this;
    }

    public CarsPageContext verifySearchResultListContainsOnlyValidPrices(int priceMin, int priceMax) {
        boolean result = true;
        for (int i = 0; i < carsPage.searchResultCarsPriceList.size(); i++) {
            int carPrice = getPrice(carsPage.searchResultCarsPriceList.get(i).getText());
            if(!verifyPriceIsValid(priceMin, priceMax, carPrice)) {
                result = false;
                break;
            }
        }
        Assert.assertTrue(result, "Verify that all cars in search result list has a valid price:");
        return this;
    }

    public CarsPageContext verifyCarBrandIsExistInTheList(String brand, boolean expected) {
        boolean actual = false;
        for (int i = 0; i < carsPage.brandsList.size(); i++) {
            if (getBrandName(carsPage.brandsList.get(i).getText()).equals(brand)) {
                actual = true;
                break;
            }
        }
        Assert.assertEquals(actual, expected, "Verifying that brand \"" + brand + "\" is exist in the Brands list:");
        return this;
    }

    /**
     * =======================================================================================================
     * SERVICE METHODS
     * =======================================================================================================
     */

    private String getBrandName(String brandName) {
        return brandName.split("\n")[0];
    }

    private int getPrice(String price) {
        return Integer.parseInt(price.replace(" грн.", "").replaceAll(" ", ""));
    }

    private boolean verifyPriceIsValid(int priceMin, int priceMax, int value) {
        return (value >= priceMin) && (value <= priceMax);
    }

}