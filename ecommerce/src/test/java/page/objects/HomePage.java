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

}





















/*public HomePage() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/