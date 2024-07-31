package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ShoppingPage;
import utilities.BaseTest;
import pages.LoginPage;
import utilities.Logs;

public class VerifySauceDemoShoppingPageTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driverProvider);
    }

    @Test
    public void verifySauceDemoShoppingPageTest() {
        Logs.info("Navegar a la página de saucedemo");
        loginPage.goToUrl("https://www.saucedemo.com/");
        Logs.info("Llenar el formulario de login");
        loginPage.fillForm("standard_user", "secret_sauce");
        ShoppingPage shoppingPage = new ShoppingPage(driverProvider);
        Logs.info("Verificar que el título de productos es visible");
        shoppingPage.verifyProductsTitleIsDisplayed();
        Logs.info("Verificar que el select de ordenamiento es visible");
        //shoppingPage.verifyItemSelectedIsDisplayed();
        Logs.info("Verificar que la cantidad de productos es la correcta");
        shoppingPage.verifyItemListSize(6);
    }
}
