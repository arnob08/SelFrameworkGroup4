package page.objects;


import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ApplicationPageBase {

    @FindBy(id = "etsy-logo")
    private WebElement logo;

    @FindBy(id = "search-query")
    private WebElement searchBox;

    @FindBy(id = "register")
    private WebElement registerButton;

    @FindBy(id = "sell-on-etsy")
    private WebElement sellButton;

    @FindBy(css = ".discovery > a:nth-child(1)")
    private WebElement discoverButton;

    @FindBy(id = "catnav-primary-link-66")
    private WebElement artAndCollectibles;

    @FindBy(id = "catnav-l3-128")
    private WebElement sculpture;

    @FindBy(xpath = "//p[contains(text(),'New discoveries')]")
    private WebElement verifyDiscoverPage;

    @FindBy(partialLinkText = "Open your Etsy shop")
    private WebElement verifySellPage;

    @FindBy(partialLinkText = "Register")
    private WebElement verifyRegisterPage;

    @FindBy(partialLinkText = "DUNDER MIFFLIN PAPER Company")
    private WebElement verifySearchResult;

    public void search() {
        searchBox.sendKeys("dunder mifflin hat", Keys.ENTER);
    }

    public boolean logoVer(){
        logo.isDisplayed();
        return true;
    }

    public void register(){
        click(registerButton, "registerButton");
    }

    public void sell(){
        click(sellButton, "sellButton");
    }

    public void discover(){
        click(discoverButton,"discoverButton");
    }

//    public void selectArtAndCollectibles(){
//        driver.switchTo().frame("etsy-device-id-iframe");
//        moveToElementWithSubMenu(artAndCollectibles,sculpture,"artAndCollectibles","sculpture");
//    }

    public WebElement getVerifyDiscoverPage(){
        return verifyDiscoverPage;
    }

    public WebElement getVerifySellPage(){
        return verifySellPage;
    }

    public WebElement getVerifyRegisterPage(){
        return verifyRegisterPage;
    }

    public WebElement getVerifySearchResult(){
        return verifySearchResult;
    }

}




















