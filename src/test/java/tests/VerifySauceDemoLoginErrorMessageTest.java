package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BaseTest;
import pages.LoginPage;
import utilities.Logs;

public class VerifySauceDemoLoginErrorMessageTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driverProvider);
    }

    @Test
    public void verifySauceDemoLoginErrorMessageTest() {
        Logs.info("Navegar a la página de saucedemo");
        loginPage.goToUrl("https://www.saucedemo.com/");
        Logs.info("Llenar el formulario de login");
        loginPage.fillForm("locked_out_user", "secret_sauce");
        Logs.info("Verificar que aparece el mensaje de error");
        loginPage.verifyErrorMessageIsDisplayed();
        Logs.info("Verificar que el mensaje de error es el correcto");
        loginPage.verifyErrorMessage("Epic sadface: Sorry, this user has been locked out.");
    }
}
