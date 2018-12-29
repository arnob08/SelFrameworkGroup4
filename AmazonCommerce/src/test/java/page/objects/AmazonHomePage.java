package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage extends ApplicationPageBase {


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

    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
    private WebElement signIn;

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
        //WebDriverWait wait =new WebDriverWait(driver,30);
      //  WebElement ele = wait.until(
                //ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]"))
      //  );

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
