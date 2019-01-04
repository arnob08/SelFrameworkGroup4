package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class GiftCardsPage extends ApplicationPageBase {

    @FindBy(id = "page-title")
    private WebElement giveTheGiftOfEtsy;

    @FindBy(id = "recipient_name")
    private WebElement toBox;

    @FindBy(id = "sender_name")
    private WebElement fromBox;

    @FindBy(id = "gift-card-amount-0")
    private WebElement moneyAmount;

    @FindBy(id = "js-optional_note")
    private WebElement noteBox;

    @FindBy(id = "medium-email")
    private WebElement deliveryMethod;

    @FindBy(id = "recipient_email")
    private WebElement emailBox;

    @FindBy(id = "js-add-to-cart")
    private WebElement addToCart;

    public String giftCardMsg(){
        String msg = getText(giveTheGiftOfEtsy,"giveTheGiftOfEtsy");
        return msg;
    }

    public void buyGiftCard (String to,String from,String note, String email){

        sendKeys(toBox, "toBox", to);
        sendKeys(fromBox, "fromBox", from);

        TestLogger.log("Choosing an amount");
        WebElement element = driver.findElement(By.id("gift-card-amount-0"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        TestLogger.log("Chose $25 for the amount");

        sendKeys(noteBox,"noteBox", note);

        TestLogger.log("Choosing a delivery method");
        WebElement ele = driver.findElement(By.id("medium-email"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).click().build().perform();
        TestLogger.log("Chose email for delivery method");

        sendKeys(emailBox,"emailBox", email);
        click(addToCart,"addToCart");
    }
}
