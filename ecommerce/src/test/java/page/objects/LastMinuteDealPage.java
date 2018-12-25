package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LastMinuteDealPage extends BrowserDriver {


    @FindBy(how =How.CLASS_NAME,using = "a-section")
private WebElement amazonProducts;

@FindBy(how=How.XPATH, using = "//*[@id=\"widgetFilters\"]/div/div[3]/div[3]/span/a/div/div[2]/span")

private WebElement furnitures;


    public String amazonProducts(){

       String getText = amazonProducts.getText();
       return getText;

    }

public String furnitures(){

        String getText = furnitures.getText();
        return getText;
}

}
