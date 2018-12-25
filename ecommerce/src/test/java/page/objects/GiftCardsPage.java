package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GiftCardsPage extends BrowserDriver {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[4]")
    private WebElement reedemGiftCard;


    public String reedemGiftCard() {
String actualText = reedemGiftCard.getText();
return  actualText;


    }


}
