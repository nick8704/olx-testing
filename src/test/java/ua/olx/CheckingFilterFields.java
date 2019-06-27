package ua.olx;

import ua.olx.contexts.CarsPageContext;
import org.testng.annotations.Test;

public class CheckingFilterFields extends BaseTest {

    CarsPageContext carsPageContext = new CarsPageContext();

    @Test
    public void checkingDefaultValuesInFilterFields() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .verifySelectBrandValueIsDefault()
            .verifySelectDistrictValueIsDefault()
            .verifySelectTypeValueIsDefault()
            .verifySelectFuelValueIsDefault()
            .verifyInputPriceMinValueIsDefault()
            .verifyInputPriceMaxValueIsDefault()
            .verifySelectColorValueIsDefault()
            .verifySelectTransmissionValueIsDefault()
            .verifyInputYearMinValueIsDefault()
            .verifyInputYearMaxValueIsDefault()
            .verifySelectConditionValueIsDefault()
            .verifySelectOptionsValueIsDefault()
            .verifyInputMilageMinValueIsDefault()
            .verifyInputMilageMaxValueIsDefault()
            .verifySelectCustomsClearedValueIsDefault()
            .verifyInputEngineMinValueIsDefault()
            .verifyInputEngineMaxValueIsDefault();
    }

}