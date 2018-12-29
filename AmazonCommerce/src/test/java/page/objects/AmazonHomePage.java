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

import java.security.Key;

public class AmazonHomePage extends ApplicationPageBase {

    ApplicationPageBase objOfApplictionPageBase;

    @FindBy(how = How.CLASS_NAME, using = "nav-line-2")
    public WebElement orders;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    public WebElement search;

    @FindBy(how = How.ID, using = "nav-your-amazon")
    public WebElement yourAmzon;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[2]")
    public WebElement lastMinuteDeal;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-xshop\"]/a[3]")
    public WebElement giftCards;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    public WebElement accountList;

    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    public WebElement logoDisplay;

    @FindBy(xpath = "//*[@id=\"nav-upnav\"]/a")
    public WebElement topLogoDisplay;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")
    public WebElement registry;

    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
    public WebElement signIn;

    public String contactUs() {

        String getText = yourAmzon.getText();

        return getText;

    }

    public void orders() {

        objOfApplictionPageBase.click(orders,"Orders");
    }


    public String lastMinuteDael() {
        String dealText = objOfApplictionPageBase.getText(lastMinuteDeal,"Last minute Deal");
        return dealText;
    }

    public void clickLastMinuteDeal() {

        objOfApplictionPageBase.click(lastMinuteDeal,"Last Minute Deal");
    }


    public void clickGiftCards() {
       objOfApplictionPageBase.click(giftCards,"gift card"); ;
    }

    public String giftCards() {
        String giftText = objOfApplictionPageBase.getText(giftCards,"gift Card");
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
        search.sendKeys("shoe",Keys.ENTER);




}
public void registry(){
        registry.click();
}



}
