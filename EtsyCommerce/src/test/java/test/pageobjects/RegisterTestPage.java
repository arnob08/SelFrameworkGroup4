package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.RegisterPage;

public class RegisterTestPage extends RegisterPage {
    RegisterPage objOfRegisterPage;
    HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements (){
        objOfRegisterPage = PageFactory.initElements(driver, RegisterPage.class);
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @Test
    public void fillForm (){
        objOfHomePage.register();
        objOfRegisterPage.enterEmail();
        objOfRegisterPage.enterFirstName();
        objOfRegisterPage.enterPassword();

    }
}
