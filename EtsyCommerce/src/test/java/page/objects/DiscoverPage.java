package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPage extends ApplicationPageBase {

    @FindBy(css = ".wt-text-heading-02")
    private WebElement message;

    @FindBy (partialLinkText = "Clever utility")
    private WebElement cleverUtility;

    @FindBy(partialLinkText = "Winter pastels")
    private WebElement winterPastels;

    @FindBy(partialLinkText = "Clever utility")
    private WebElement verifyCleverUtility;

    @FindBy(partialLinkText = "Winter pastels")
    private WebElement verifyWinterPastels;

    public String discoverPageMsg(){
        String text = getText(message,"message");
        return text;
    }

    public void setCleverUtility(){
        cleverUtility.click();
    }

    public void setWinterPastels(){
        winterPastels.click();
    }

    public WebElement getCleverUtility(){
        return verifyCleverUtility;
    }

    public WebElement getWinterPastels(){
        return verifyWinterPastels;
    }
}
