package ua.olx;

import ua.olx.contexts.CarsPageContext;
import org.testng.annotations.Test;

public class CheckingFilterFields extends BaseTest {

    private CarsPageContext carsPageContext = new CarsPageContext();

    @Test
    public void checkingDefaultValuesInFilterFields() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .verifySelectBrandValueIsDefault()
            .verifySelectDistrictValueIsDefault()
            .verifySelectTypeValueIsDefault()
            .verifySelectFuelValueIsDefault()
            .verifySelectPriceMinValueIsDefault()
            .verifySelectPriceMaxValueIsDefault()
            .verifySelectColorValueIsDefault()
            .verifySelectTransmissionValueIsDefault()
            .verifySelectYearMinValueIsDefault()
            .verifySelectYearMaxValueIsDefault()
            .verifySelectConditionValueIsDefault()
            .verifySelectOptionsValueIsDefault()
            .verifySelectMilageMinValueIsDefault()
            .verifySelectMilageMaxValueIsDefault()
            .verifySelectCustomsClearedValueIsDefault()
            .verifySelectEngineMinValueIsDefault()
            .verifySelectEngineMaxValueIsDefault();
    }

}