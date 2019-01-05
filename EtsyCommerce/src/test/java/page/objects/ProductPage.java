package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class ProductPage extends BrowserDriver {

    @FindBy(id = "inventory-variation-select-0")
    private WebElement selectOption;

    @FindBy(id = "inventory-variation-select-quantity")
    private WebElement quantity;

    @FindBy(xpath = "//div[text()='Add to cart']")
    private WebElement cartButton;

    public void select(){
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
            }
        }
        Select select = new Select(selectOption);
        select.selectByValue("930479998");
        Select selectTwo = new Select(quantity);
        selectTwo.selectByValue("2");
        cartButton.click();




    }
}







