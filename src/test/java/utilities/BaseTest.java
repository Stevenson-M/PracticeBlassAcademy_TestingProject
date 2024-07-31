package utilities;

import org.configuration.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverProvider driverProvider;

    @BeforeMethod
    public void setUp() {
        Logs.debug("Inicializar el driver");
        driver = new ChromeDriver();

        Logs.debug("Maximizar la ventana");
        driver.manage().window().maximize();

        Logs.debug("Borrar cookies");
        driver.manage().deleteAllCookies();

        Logs.debug("Setear el tiempo de espera implicito");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Logs.debug("Setear el driver en el provider");
        driverProvider = new WebDriverProvider(); // Asigna el WebDriverProvider al campo
        driverProvider.set(driver);
    }

    @AfterMethod
    public void tearDown() {
        Logs.debug("Matando el driver");
        WebDriver driver = WebDriverProvider.threadLocal.get();
        if (driver != null) {
            driver.quit();
            WebDriverProvider.threadLocal.remove();
        }
    }

}

