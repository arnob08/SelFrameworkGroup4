package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends HomePage {

   HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements() {

        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void searchTest (){

        String actualText =objOfHomePage.search();
        Assert.assertEquals(actualText,"Mennace harrington bomber jacket in red");
        System.out.println("test passed");
    }

}
