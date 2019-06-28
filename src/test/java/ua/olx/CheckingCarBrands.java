package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

import java.util.Arrays;
import java.util.List;

public class CheckingCarBrands extends BaseTest {

    private CarsPageContext carsPageContext = new CarsPageContext();

    private List<String> validBrandsList = Arrays.asList("Citroen", "BMW", "ВАЗ");
    private List<String> invalidBrandsList = Arrays.asList("Boeing", "BMM", "Машина");

    @Test
    public void checkingCarBrandsAreExistingInTheList() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .expandSelectBrand()
            .verifyCarBrandIsExistInTheList(validBrandsList.get(0), true)
            .verifyCarBrandIsExistInTheList(validBrandsList.get(1), true)
            .verifyCarBrandIsExistInTheList(validBrandsList.get(2), true)
            .verifyCarBrandIsExistInTheList(invalidBrandsList.get(0), false)
            .verifyCarBrandIsExistInTheList(invalidBrandsList.get(1), false)
            .verifyCarBrandIsExistInTheList(invalidBrandsList.get(2), false);
    }

}