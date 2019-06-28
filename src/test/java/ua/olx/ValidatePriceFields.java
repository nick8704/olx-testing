package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

import java.util.Arrays;
import java.util.List;

public class ValidatePriceFields extends BaseTest{

    private CarsPageContext carsPageContext = new CarsPageContext();

    private List<String> invalidValuesList = Arrays.asList("qwerty", "UTRI", "_bfnbg", "TYfhbJkvb");
    private List<String> validValuesList       = Arrays.asList("100000", "54879");

    @Test
    public void validateSelectPriceMinWithInvalidValue() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .fillInputPriceMin(invalidValuesList.get(0))
            .verifySelectPriceMinValueIsDefault()
            .fillInputPriceMin(invalidValuesList.get(1))
            .verifySelectPriceMinValueIsDefault()
            .fillInputPriceMin(invalidValuesList.get(2))
            .verifySelectPriceMinValueIsDefault()
            .fillInputPriceMin(invalidValuesList.get(3))
            .verifySelectPriceMinValueIsDefault();
    }

    @Test(dependsOnMethods = "validateSelectPriceMinWithInvalidValue")
    public void validateSelectPriceMinWithValidValue() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .fillInputPriceMin(validValuesList.get(0))
            .verifySelectPriceMinValue(validValuesList.get(0))
            .clickIconClearSelectPriceMin()
            .fillInputPriceMin(validValuesList.get(1))
            .verifySelectPriceMinValue(validValuesList.get(1))
            .clickIconClearSelectPriceMin();
    }

    @Test(dependsOnMethods = "validateSelectPriceMinWithInvalidValue")
    public void validateSelectPriceMaxWithInvalidValue() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .fillInputPriceMax(invalidValuesList.get(0))
            .verifySelectPriceMaxValueIsDefault()
            .fillInputPriceMax(invalidValuesList.get(1))
            .verifySelectPriceMaxValueIsDefault()
            .fillInputPriceMax(invalidValuesList.get(2))
            .verifySelectPriceMaxValueIsDefault()
            .fillInputPriceMax(invalidValuesList.get(3))
            .verifySelectPriceMaxValueIsDefault();
    }

}