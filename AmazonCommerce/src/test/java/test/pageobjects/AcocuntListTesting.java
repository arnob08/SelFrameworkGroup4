package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;

public class AcocuntListTesting extends AmazonHomePage {


    AmazonHomePage objOfAmazonHomePage;

    @BeforeMethod
    public void initializationOfElements(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);

    }


    @Test
    public void accountListTesting(){
        objOfAmazonHomePage.accountList();

    }



}
