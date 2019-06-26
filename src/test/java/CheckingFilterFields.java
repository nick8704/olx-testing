import contexts.CarsPageContext;
import org.testng.annotations.Test;

public class CheckingFilterFields extends BaseTest {

    CarsPageContext carsPageContext = new CarsPageContext();

    @Test
    public void checkingDefaultValuesInFilterFields() {
        carsPageContext
                .loadCarsPage()
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

        logger.info("TEST PASSED");
    }

}