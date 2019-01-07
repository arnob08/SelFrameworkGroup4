package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonRegistryPage extends ApplicationPageBase {


    @FindBy(xpath = "//*[@id=\"contentGrid_395686\"]/div/div[3]/div[1]/div/div/a")
public WebElement easyReturn;


public String easyReturn (){

    String easyText = easyReturn.getText();
    return easyText;

}






}