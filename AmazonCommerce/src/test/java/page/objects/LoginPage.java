package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends ApplicationPageBase {
     private WebDriver driver ;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME, css = "#center_column > div.alert.alert-danger > p")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public WebElement submitButton;

    public LoginPage login(String email, String password){
        sendKeys(emailBox,"emailbox",email);
        sendKeys(passwordBox,"password box",password);
        click(submitButton,"Submit Button");
        return new LoginPage();
    }


    public String getErroMessage(){

        String actualText = getText(errorMessage,"errorMessage");

        return actualText;
    }


    /*public LoginPage login(String email, String password){

        TestLogger.log("Sending keys to email box");
        sendKeys(emailBox,"emailBox", email);
        sendKeys(passwordBox,"passwordBox",password);


        return new LoginPage();

    }*/



}