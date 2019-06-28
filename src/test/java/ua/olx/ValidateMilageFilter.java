package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

import java.util.Arrays;
import java.util.List;

public class ValidateMilageFilter extends BaseTest {

    private CarsPageContext carsPageContext = new CarsPageContext();

    private List<String> milageMinList = Arrays.asList("50000", "70000");
    private List<String> milageMaxList = Arrays.asList("100000", "200000");

    @Test
    public void checkMannuallySetMilageFilterResult() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .fillInputMilageMin(milageMinList.get(0))
            .fillInputMilageMax(milageMaxList.get(0))
            .clickButtonSearch()
            .verifySearchResultListIsNotEmpty();
    }

    @Test
    public void checkSelectedSetMilageFilterResult() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .setMilageMin(milageMinList.get(1))
            .setMilageMax(milageMaxList.get(1))
            .clickButtonSearch()
            .verifySearchResultListIsNotEmpty();
    }

}