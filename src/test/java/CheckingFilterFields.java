import contexts.CarsPageContext;
import org.testng.annotations.Test;

public class CheckingFilterFields extends BaseTest {

    CarsPageContext carsPageContext = new CarsPageContext();

    @Test
    public void checkingDefaultValuesInFilterFields() {
        carsPageContext.verifySelectBrandValueIsDefault();
        logger.info("TEST PASSED");
//        System.out.println(new WebDriverHelper().getImplicitWait());
    }

}