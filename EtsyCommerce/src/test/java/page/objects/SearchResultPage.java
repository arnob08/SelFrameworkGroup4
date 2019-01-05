package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import com.sun.org.apache.bcel.internal.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import sun.java2d.Spans;


public class SearchResultPage extends ApplicationPageBase {

    @FindBy(xpath = "//a[contains(@title, 'DUNDER MIFFLIN')]")
    private WebElement hat;

    @FindBy(partialLinkText = "DUNDER MIFFLIN PAPER Company")
    private WebElement verifyHatPage;

    public void selectHat (){
        click(hat, "hat");
    }

    public WebElement getVerifyHatPage(){
        return verifyHatPage;
    }
}