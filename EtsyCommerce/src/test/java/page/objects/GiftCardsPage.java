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

    @FindBy(partialLinkText = "Keep shopping")
    private WebElement verifyAddToCartButton;

    public String giftCardMsg(){
        String msg = getText(giveTheGiftOfEtsy,"giveTheGiftOfEtsy");
        return msg;
    }

    public void buyGiftCard (String to,String from,String note, String email){
        sendKeys(toBox, "toBox", to);
        sendKeys(fromBox, "fromBox", from);
        moveToElement(moneyAmount,"moneyAmount");
        TestLogger.log("Chose $25 for the amount");
        sendKeys(noteBox,"noteBox", note);
        moveToElement(deliveryMethod, "deliveryMethod");
        TestLogger.log("Chose email for delivery method");
        sendKeys(emailBox,"emailBox", email);
        click(addToCart,"addToCart");
    }

    public WebElement getVerifyAddToCartButton(){
        return verifyAddToCartButton;
    }

}
