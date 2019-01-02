package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonDogCollarPage extends ApplicationPageBase {


    @FindBy(xpath = "//*[@id=\"result_0\"]/div/div[4]/div/a/h2")
    private WebElement dogCollar1;

    @FindBy(xpath = "//*[@id=\"result_1\"]/div/div[4]/div/a/h2")
    private WebElement dogCollar2;

    @FindBy(xpath = "//*[@id=\"result_2\"]/div/div[4]/div/a/h2")
private WebElement dogCollar3;

public String dogcollar1(){
    String gettext = getText(dogCollar1,"Dog Collar 1");
    return gettext;
}


public String dogCollar2(){
    String getText = getText(dogCollar2,"Dog Collar 2");
    return getText;
}

public String dogCollar3(){
    String getText = getText(dogCollar3,"Dog Collar 3");
    return getText;
}





}
