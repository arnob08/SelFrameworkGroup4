package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class ProductPage extends BrowserDriver {

    @FindBy(css = "button.btn:nth-child(7)")
    private WebElement cartButton;

    public void selectOption() {

        //Specifies to Selenium to focus on new tab that was opened
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
            }
        }
        WebElement anything = driver.findElement(By.id("inventory-variation-select-0"));
        Select select = new Select(anything);
        select.selectByValue("930479998");
    }

    public void selectQuantity() {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("inventory-variation-select-0")));

        WebElement ele = driver.findElement(By.id("inventory-variation-select-quantity"));
        Select selectTwo = new Select(ele);
        selectTwo.selectByValue("2");
     }

    public void clickCartButton() {

        WebDriverWait waitTwo = new WebDriverWait(driver, 30);
        WebElement elementTwo = waitTwo.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("inventory-variation-select-quantity")));

        cartButton.click();
    }
}







