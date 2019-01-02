package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonFooterPage  extends ApplicationPageBase {
ApplicationPageBase objOfApplicationPageBase;

    @FindBy(xpath = "//*[@id=\"navFooter\"]")
   public List <WebElement> amazonFooterList;

    @FindBy(xpath = "//*[@id=\"icp-touch-link-country\"]/span[2]")
    public WebElement countryName;


    public int footerList(){

       int listCount =amazonFooterList.size();
       return listCount;
    }

    public String countryName(){
     String name = objOfApplicationPageBase.getText(countryName,"Country Name");
     return name;
}

}
