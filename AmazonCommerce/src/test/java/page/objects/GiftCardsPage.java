package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GiftCardsPage extends ApplicationPageBase {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[4]")
    private WebElement reedemGiftCard;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]")
    private WebElement viewYourBalance;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]")
    private WebElement birthdays;

    public String reedemGiftCard() {
    String actualText = reedemGiftCard.getText();
    return  actualText;


    }

    public String viewYourBalance(){
        String getText = viewYourBalance.getText();
        return getText;

    }
    public String birthdays(){
        String getText= birthdays.getText();

        return getText;

    }




}
