package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

import static ua.olx.constants.TransmissionType.*;

public class ValidateTransmissionCheckbox extends BaseTest {

    private CarsPageContext carsPageContext = new CarsPageContext();

    @Test
    public void validateTransmissionCheckboxWorkingCorrect() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .clickSelectTransmission()
            .verifySelectTransmissionCheckboxAllIsChecked(true)
            .verifySelectTransmissionCheckboxIsChecked(MECHANICAL, false)
            .verifySelectTransmissionCheckboxIsChecked(AUTOMATIC, false)
            .verifySelectTransmissionCheckboxIsChecked(VARIABLE, false)
            .verifySelectTransmissionCheckboxIsChecked(ADAPTIVE, false)
            .verifySelectTransmissionCheckboxIsChecked(TIPTRONIC, false)
            .checkCheckboxInSelectTransmission(ADAPTIVE)
            .clickSelectTransmission()
            .verifySelectTransmissionCheckboxAllIsChecked(false)
            .verifySelectTransmissionCheckboxIsChecked(MECHANICAL, false)
            .verifySelectTransmissionCheckboxIsChecked(AUTOMATIC, false)
            .verifySelectTransmissionCheckboxIsChecked(VARIABLE, false)
            .verifySelectTransmissionCheckboxIsChecked(ADAPTIVE, true)
            .verifySelectTransmissionCheckboxIsChecked(TIPTRONIC, false);
    }

}