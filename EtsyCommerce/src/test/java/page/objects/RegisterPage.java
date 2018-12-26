package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class RegisterPage extends BrowserDriver {

    @FindBy(id = "join_neu_email_field")
    private WebElement email;

    @FindBy(id = "join_neu_first_name_field")
    private WebElement firstName;

    @FindBy(id = "join_neu_password_field")
    private WebElement password;

    public void enterEmail (){

        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
            }
        }

        email.sendKeys("test@gmail.com",Keys.ENTER);
    }

    public void enterFirstName (){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("join_neu_first_name_field")));
        firstName.sendKeys("tester", Keys.ENTER);
    }

    public void enterPassword (){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("join_neu_password_field")));
        password.sendKeys("#set123secret", Keys.ENTER);
    }
}
