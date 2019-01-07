package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends ApplicationPageBase {

    @FindBy(id = "inventory-variation-select-0")
    private WebElement selectOption;

    @FindBy(id = "inventory-variation-select-quantity")
    private WebElement quantity;

    @FindBy(xpath = "//div[text()='Add to cart']")
    private WebElement cartButton;

    @FindBy(partialLinkText = "Keep shopping")
    private WebElement verifyCartPage;

    public void select(){
        switchWindowHandle();
        select(selectOption, "Select an option","930479998", "Solid royal, OSFA");
        waitToClick(quantity);
        select(quantity, "Quantity","2", "2");
        waitToClick(cartButton);
        moveToElement(cartButton,"Add to cart");
    }

    public WebElement getVerifyCartPage(){
        return verifyCartPage;
    }
}







