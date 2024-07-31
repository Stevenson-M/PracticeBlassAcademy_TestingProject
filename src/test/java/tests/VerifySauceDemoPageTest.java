package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;
import pages.LoginPage;
import utilities.Logs;


public class VerifySauceDemoPageTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driverProvider);
    }

    @Test
    public void verifySauceDemoPageTest() {
        Logs.info("Navegar a la página de saucedemo");
        loginPage.goToUrl("https://www.saucedemo.com/");
        Logs.info("Verificar que la URL sea la correcta");
        loginPage.verifyUrl("https://www.saucedemo.com/");
        Logs.info("Verificar que el username es visible");
        loginPage.verifyElementUsernameIsDisplayed();
        Logs.info("Verificar que el password es visible");
        loginPage.verifyElementPasswordIsDisplayed();
        Logs.info("Verificar que el botón de login es visible");
        loginPage.verifyElementLoginButtonIsDisplayed();
    }
}

