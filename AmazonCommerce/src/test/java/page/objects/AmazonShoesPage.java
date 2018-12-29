package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonShoesPage extends ApplicationPageBase {

@FindBy(xpath = "//*[@id=\"sort\"]")
public WebElement sortList;

@FindBy(xpath = "//*[@id=\"sort\"]/option[2]")
public WebElement sortListLowToHigh;

@FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/span/div/label/input")
public WebElement checkTopBrandsBox;

@FindBy(xpath = "//*[@id=\"sort\"]")
public List<WebElement> sortListLinks;

public void shoeListSort(){
    sortList.click();
    sortListLowToHigh.click();
}

public void checkTopBrandsBox(){
    checkTopBrandsBox.click();
}

public int countSortListLink() {
  int li= sortListLinks.size();

    return li ;
}

}


