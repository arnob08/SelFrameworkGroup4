package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPage extends ApplicationPageBase {

    @FindBy(css = ".wt-text-heading-02")
    private WebElement message;

    @FindBy (css = "div.wt-mt-xs-5:nth-child(2) > h2:nth-child(1) > a:nth-child(1)")
    private WebElement cleverUtility;

    @FindBy(xpath = "/html/body/div[3]/div/div[4]/div/h2/a")
    private WebElement winterPastels;

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
}
