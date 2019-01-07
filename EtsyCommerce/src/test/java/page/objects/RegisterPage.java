package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class RegisterPage extends ApplicationPageBase {

    @FindBy(id = "join_neu_email_field")
    private WebElement emailBox;

    @FindBy(id = "join_neu_first_name_field")
    private WebElement firstNameBox;

    @FindBy(id = "join_neu_password_field")
    private WebElement passwordBox;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    private WebElement registerButton;

    @FindBy(partialLinkText = "Register")
    private WebElement verifyRegisterPage;

    public void register (String email, String firstName, String password){
        switchWindowHandle();
        sendKeys(emailBox, "emailBox", email);
        sendKeys(firstNameBox,"firstNameBox", firstName);
        sendKeys(passwordBox, "passwordBox", password);
        click(registerButton, "registerButton");
    }

    public WebElement getVerifyRegisterPage(){
        return verifyRegisterPage;
    }
}
