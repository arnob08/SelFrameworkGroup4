package page.objects;


import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {

    @FindBy(id = "search-query")
    private WebElement searchBox;

    @FindBy(id = "etsy-logo")
    private WebElement logo;

    public void search () {
        searchBox.sendKeys("dunder mifflin hat", Keys.ENTER);
    }

}





















/*public HomePage() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/