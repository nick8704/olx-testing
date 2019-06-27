package ua.olx.contexts;

import org.testng.Assert;
import ua.olx.pages.CarsPage;

import static ua.olx.constants.DefaultFieldsValues.*;

public class CarsPageContext {

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

    public CarsPageContext expandSelectBrand() {
        carsPage.selectBrand.click();
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
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectDistrictValueIsDefault() {
        String actual = carsPage.selectDistrict.getText();
        String expected = DISTRICT;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectTypeValueIsDefault() {
        String actual = carsPage.selectType.getText();
        String expected = TYPE;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectFuelValueIsDefault() {
        String actual = carsPage.selectFuel.getText();
        String expected = FUEL;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputPriceMinValueIsDefault() {
        String actual = carsPage.inputPriceMin.getText();
        String expected = PRICE_MIN;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputPriceMaxValueIsDefault() {
        String actual = carsPage.inputPriceMax.getText();
        String expected = PRICE_MAX;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectColorValueIsDefault() {
        String actual = carsPage.selectColor.getText();
        String expected = COLOR;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectTransmissionValueIsDefault() {
        String actual = carsPage.selectTransmission.getText();
        String expected = TRANSMISSION;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputYearMinValueIsDefault() {
        String actual = carsPage.inputYearMin.getText();
        String expected = YEAR_MIN;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputYearMaxValueIsDefault() {
        String actual = carsPage.inputYearMax.getText();
        String expected = YEAR_MAX;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectConditionValueIsDefault() {
        String actual = carsPage.selectCondition.getText();
        String expected = CONDITION;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectOptionsValueIsDefault() {
        String actual = carsPage.selectOptions.getText();
        String expected = OPTIONS;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputMilageMinValueIsDefault() {
        String actual = carsPage.inputMilageMin.getText();
        String expected = MILAGE_MIN;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputMilageMaxValueIsDefault() {
        String actual = carsPage.inputMilageMax.getText();
        String expected = MILAGE_MAX;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifySelectCustomsClearedValueIsDefault() {
        String actual = carsPage.selectCustomsCleared.getText();
        String expected = CUSTOMS_CLEARED;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputEngineMinValueIsDefault() {
        String actual = carsPage.inputEngineMin.getText();
        String expected = ENGINE_MIN;
        Assert.assertEquals(actual, expected);
        return this;
    }

    public CarsPageContext verifyInputEngineMaxValueIsDefault() {
        String actual = carsPage.inputEngineMax.getText();
        String expected = ENGINE_MAX;
        Assert.assertEquals(actual, expected);
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
        Assert.assertEquals(actual, expected);
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
}