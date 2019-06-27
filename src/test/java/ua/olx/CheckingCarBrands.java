package ua.olx;

import org.testng.annotations.Test;
import ua.olx.contexts.CarsPageContext;

import java.util.Arrays;
import java.util.List;

public class CheckingCarBrands extends BaseTest {

    CarsPageContext carsPageContext = new CarsPageContext();

    List<String> validBrands = Arrays.asList("Citroen", "BMW", "ВАЗ");
    List<String> invalidBrands = Arrays.asList("Boeing", "BMM", "Машина");

    @Test
    public void checkingCarBrandsAreExistingInTheList() {
        carsPageContext
            .clickButtonAcceptCoockies()
            .expandSelectBrand()
            .verifyCarBrandIsExistInTheList(validBrands.get(0), true)
            .verifyCarBrandIsExistInTheList(validBrands.get(1), true)
            .verifyCarBrandIsExistInTheList(validBrands.get(2), true)
            .verifyCarBrandIsExistInTheList(invalidBrands.get(0), false)
            .verifyCarBrandIsExistInTheList(invalidBrands.get(1), false)
            .verifyCarBrandIsExistInTheList(invalidBrands.get(2), false);
    }

}