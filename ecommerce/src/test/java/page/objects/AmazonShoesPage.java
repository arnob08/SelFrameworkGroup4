package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonShoesPage extends BrowserDriver {

@FindBy(xpath = "//*[@id=\"sort\"]")
private WebElement sortList;

@FindBy(xpath = "//*[@id=\"sort\"]/option[2]")
private WebElement sortListLowToHigh;

@FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/span/div/label/input")
private WebElement checkTopBrandsBox;

public void shoeListSort(){
    sortList.click();
    sortListLowToHigh.click();
}

public void checkTopBrandsBox(){
    checkTopBrandsBox.click();
}



}
