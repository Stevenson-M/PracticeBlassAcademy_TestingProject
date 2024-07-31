package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import utilities.Logs;

public class BasicTests extends BaseTest {

    @Test
    public void firstTest() {
        Logs.info("Navegar a la pagina de saucedemo");
        driver.get("https://www.saucedemo.com/");

        final var url = driver.getCurrentUrl();

        Logs.info("Verificar que la URL sea la correcta");
        Assert.assertEquals(url, "https://www.saucedemo.com/");


    }

    @Test
    public void secondTest() {
        Logs.info("Navegar a la pagina de herokuapp");
        driver.get("https://the-internet.herokuapp.com/");

        Logs.info("Navegar a la pagina de github");
        driver.get("https://github.com");

        Logs.info("Navegando a la pagina anterior");
        driver.navigate().back();

        Logs.info("Verificando que la url actual es la de herokuapp");
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/");
    }



}
