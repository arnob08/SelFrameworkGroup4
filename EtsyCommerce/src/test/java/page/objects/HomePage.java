package page.objects;


import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BrowserDriver {

    @FindBy(id = "etsy-logo")
    private WebElement logo;

    @FindBy(id = "search-query")
    private WebElement searchBox;

    @FindBy(id = "catnav-primary-link-66")
    private WebElement dropDown;

    @FindBy(id = "register")
    private WebElement registerButton;

    @FindBy(id = "sell-on-etsy")
    private WebElement sellButton;

    @FindBy(css = ".discovery > a:nth-child(1)")
    private WebElement discoverButton;

    public void search () {
        searchBox.sendKeys("dunder mifflin hat", Keys.ENTER);
    }

    public boolean logoVer (){
        logo.isDisplayed();
        return true;
    }

    public void dropDownFunction (){
        Actions ele = new Actions(driver);
        ele.moveToElement(dropDown).build().perform();
    }

    public void register (){
        registerButton.click();
    }

    public void sell (){
        sellButton.click();
    }

    public void discover(){
        discoverButton.click();
    }

}




















