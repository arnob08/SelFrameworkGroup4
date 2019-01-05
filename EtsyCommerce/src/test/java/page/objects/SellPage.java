package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellPage extends ApplicationPageBase {
    @FindBy(css = "a.pl-xs-4:nth-child(2)")
    private WebElement sellMsg;

    @FindBy(css = "a.sticky-navigation-link:nth-child(6)")
    private WebElement faqButton;

    @FindBy(css = "a.sticky-navigation-link:nth-child(3)")
    private WebElement supportButton;

    @FindBy(xpath = "//h2[text()='Talk to us']")
    private WebElement talkToUsMsg;

    @FindBy(xpath = "//h1[contains(text(),'Frequently Asked Questions')]")
    private WebElement verifyFaqsPage;

    public String sellPageMsg (){
        String text = getText(sellMsg, "sellMsg");
        return text;
    }

    public void getFaqs(){
        click(faqButton,"faqButton");
    }

    public void support(){
        click(supportButton,"supportButton");
    }

    public String talkToUsMsg(){
        String text = getText(talkToUsMsg,"talkToUsMsg");
        return text;
    }

    public WebElement getVerifyFaqsPage(){
        return verifyFaqsPage;
    }
}
