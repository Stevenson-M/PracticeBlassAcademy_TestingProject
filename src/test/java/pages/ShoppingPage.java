package pages;

import org.configuration.WebDriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShoppingPage extends BasePage {
    private final WebDriverProvider driverProvider;
    @FindBy(xpath = "//span[text()='Products']")
    private WebElement productsTitle;

    @FindBy(css = "select[data-test='product_sort_container']")
    private WebElement itemSelected;

    @FindBy(className = "inventory_item")
    private List<WebElement> itemList;

    public ShoppingPage(WebDriverProvider driverProvider) {
        super(driverProvider);
        this.driverProvider = driverProvider;
        PageFactory.initElements(getDriver(), this);
    }

    public void verifyProductsTitleIsDisplayed() {
        productsTitle.isDisplayed();
    }

    public void verifyItemSelectedIsDisplayed() {
        itemSelected.isDisplayed();
    }

    public void verifyItemListSize(int expectedSize) {
        final var size = itemList.size();
        org.testng.Assert.assertEquals(size, expectedSize);
    }

}
