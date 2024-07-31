package pages;

import org.configuration.WebDriverProvider;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BasePage {

    private final WebDriverProvider driverProvider;

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriverProvider driverProvider) {
        super(driverProvider);
        this.driverProvider = driverProvider;
        PageFactory.initElements(getDriver(), this);
    }


    public void goToUrl(String url) {
        driverProvider.get().get(url);
    }

    public void verifyUrl(String expectedUrl) {
        final var url = getDriver().getCurrentUrl();
        org.testng.Assert.assertEquals(url, expectedUrl);
    }

    public void verifyElementUsernameIsDisplayed() {
        usernameInput.isDisplayed();
    }

    public void verifyElementPasswordIsDisplayed() {
        passwordInput.isDisplayed();
    }

    public void verifyElementLoginButtonIsDisplayed() {
        loginButton.isDisplayed();
    }

    public ShoppingPage fillForm(String username, String password) {
        typeOnInput(usernameInput, username);
        typeOnInput(passwordInput, password);
        clickElement(loginButton);
        return new ShoppingPage(driverProvider);
    }


    public void verifyErrorMessageIsDisplayed() {
        waitForVisibility(errorMessage);
        errorMessage.isDisplayed();
    }

    public void verifyErrorMessage(String expectedMessage) {
        final var message = errorMessage.getText();
        org.testng.Assert.assertEquals(message, expectedMessage);
    }


}
