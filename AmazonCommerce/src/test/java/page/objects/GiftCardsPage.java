package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GiftCardsPage extends ApplicationPageBase {
    ApplicationPageBase objOfApplicationPageBase;


    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[4]")
    public WebElement reedemGiftCard;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[5]")
    public WebElement viewYourBalance;

    @FindBy(xpath = "//*[@id=\"nav-subnav\"]/a[3]")
    public WebElement birthdays;

    public String reedemGiftCard() {
    String actualText = reedemGiftCard.getText();
    return  actualText;


    }

    public String viewYourBalance(){
        String getText = objOfApplicationPageBase.getText(viewYourBalance,"View Your Balance");
        return getText;

    }
    public String birthdays(){
        String getText= objOfApplicationPageBase.getText(birthdays,"Birthday");

        return getText;

    }

}
