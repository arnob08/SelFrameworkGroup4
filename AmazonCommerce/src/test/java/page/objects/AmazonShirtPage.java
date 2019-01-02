package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonShirtPage extends ApplicationPageBase {

    @FindBy(xpath = "//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
    private WebElement whiteTShirt;

    @FindBy(xpath = "//*[@id=\"result_1\"]/div/div[4]/div[1]")
    private WebElement checkShirt;

    @FindBy(xpath = "//*[@id=\"result_2\"]/div/div[4]/div[1]/a/h2")
    private WebElement blackTShirt;

public String whiteTShirt(){
   /* boolean isEnabled = blackTShirt.isEnabled();
    boolean isDisplayed = blackTShirt.isDisplayed();
    boolean isSelected = blackTShirt.isSelected();*/
  String getText =  getText(whiteTShirt,"White shirt");
    return getText;
}


public String checkShirt(){
    String getText = getText(checkShirt,"Check Shirt");
    return getText;
}

public String blackTShirt(){
    String getText = getText(blackTShirt,"Black shirt");
    return getText;
}



}
