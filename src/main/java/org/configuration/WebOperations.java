package org.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class WebOperations {
    private final WebDriverProvider driverProvider;
    private final WebDriverWait wait;

    public WebOperations(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
        this.wait = new WebDriverWait(driverProvider.get(), Duration.ofSeconds(20L));
    }

    protected WebDriver getDriver() {
        return driverProvider.get();
    }

    public void clickElement(WebElement element) {
        waitForVisibility(element);
        waitForClickable(element);
        element.click();
    }

    public void typeOnInput(WebElement element, String text) {
        element.sendKeys(text);
    }

    protected void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}



