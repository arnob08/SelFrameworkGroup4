package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LastMinuteDealPage extends ApplicationPageBase {

    ApplicationPageBase objOfApplicationPageBase;

    @FindBy(how =How.CLASS_NAME,using = "a-section")
    public WebElement amazonProducts;

    @FindBy(how=How.XPATH, using = "//*[@id=\"widgetFilters\"]/div/div[3]/div[3]/span/a/div/div[2]/span")
    public WebElement furnitures;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[5]/span/a/div/div[2]/span")
    public WebElement kitchen;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div/div[3]/div[6]/span/a/div/div[2]/span")
    public WebElement electronics;

    public String amazonProducts(){

       String getText = amazonProducts.getText();
       return getText;

    }

public String furnitures(){

        String getText = objOfApplicationPageBase.getText(furnitures,"Furniture");
        return getText;
}
public String kitchen(){
      String getText = objOfApplicationPageBase.getText(kitchen,"Kitchen");
      return getText;

}

 public String electronics(){
        String getText = objOfApplicationPageBase.getText(electronics,"Electronics");
        return getText;
 }

}
