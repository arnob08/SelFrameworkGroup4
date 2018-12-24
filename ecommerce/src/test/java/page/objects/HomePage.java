package page.objects;


import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {

   // private WebDriver driver;

    @FindBy(id = "chrome-search")
    private WebElement searchBox;

    @FindBy(xpath = "//p[text()='Mennace harrington bomber jacket in red']")
    private WebElement actualText;

    @FindBy(linkText = "Help & FAQs")
    private WebElement helpAndFAQs;


    public String search (){

        searchBox.sendKeys("Jackets", Keys.ENTER);
        String maroonJacket = actualText.getText();
        return maroonJacket;

    }

    public void helpAndFAQs(){

        helpAndFAQs.click();
    }



}





















/*public HomePage() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/