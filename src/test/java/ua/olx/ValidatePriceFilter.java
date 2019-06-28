package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

public class ValidatePriceFilter extends BaseTest {

    private CarsPageContext carsPageContext = new CarsPageContext();

    int priceMin = 50000;
    int priceMax = 150000;

    @Test
    public void checkCarsPricesInSearchResultListIsValid() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .fillInputPriceMin(String.valueOf(priceMin))
            .fillInputPriceMax(String.valueOf(priceMax))
            .clickButtonSearch()
            .verifySearchResultListContainsOnlyValidPrices(priceMin, priceMax);
    }

}