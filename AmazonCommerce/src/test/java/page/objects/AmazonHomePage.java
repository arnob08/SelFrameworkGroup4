package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePage extends BrowserDriver {


    @FindBy(how = How.CLASS_NAME, using = "nav-line-2")
    private WebElement orders;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement search;

    @FindBy(how = How.ID, using = "nav-your-amazon")
    private WebElement yourAmzon;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[2]")
    private WebElement lastMinuteDeal;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[3]")
    private WebElement giftCards;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    private WebElement accountList;

    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    private WebElement logoDisplay;

    @FindBy(xpath = "//*[@id=\"nav-upnav\"]/a")
    private WebElement topLogoDisplay;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")
    private WebElement registry;



    public String contactUs() {

        String getText = yourAmzon.getText();

        return getText;

    }

    public void orders() {

        orders.click();
    }


    public String lastMinuteDael() {
        String dealText = lastMinuteDeal.getText();
        return dealText;
    }

    public void clickLastMinuteDeal() {

        lastMinuteDeal.click();
    }


    public void clickGiftCards() {
        giftCards.click();
    }

    public String giftCards() {
        String giftText = giftCards.getText();
        return giftText;

    }

    public void accountList() {

        Actions act = new Actions(driver);
        act.moveToElement(accountList).perform();

    }

    public boolean logoDisplay(){

    logoDisplay.isDisplayed();

    return false;
    }

    public boolean topLogoDisplay(){

      topLogoDisplay.isDisplayed();

      return true;
    }

public void searchItem(){
        search.sendKeys("shoes", Keys.ENTER);




}
public void registry(){
        registry.click();
}



}