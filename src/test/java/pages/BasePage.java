package pages;

import org.configuration.WebOperations;
import org.configuration.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class BasePage extends WebOperations {
    public BasePage(WebDriverProvider driverProvider) {
        super(driverProvider); //
    }
}
