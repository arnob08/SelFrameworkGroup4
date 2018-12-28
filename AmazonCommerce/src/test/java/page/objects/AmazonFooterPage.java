package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonFooterPage  extends ApplicationPageBase {

    @FindBy(xpath = "//*[@id=\"navFooter\"]")
    private List <WebElement> amazonFooterList;

    @FindBy(xpath = "//*[@id=\"icp-touch-link-country\"]/span[2]")
    private WebElement countryName;


    public int footerList(){

       int listCount =amazonFooterList.size();
       return listCount;
    }

    public String countryName(){
     String name = countryName.getText();
     return name;
}

}
