package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

import javax.print.attribute.standard.Severity;

public class HomePageTest extends HomePage {

    HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @Test
    public void logoTest(){
        boolean logo = objOfHomePage.logoVer();
        Assert.assertEquals(logo,true);
        System.out.println("logo test passed");
    }

    @Test
    public void searchTest() {
        objOfHomePage.search();
    }

    @Test
    public void registerTest(){
        objOfHomePage.register();
    }

    @Test
    public void sellTest(){
        objOfHomePage.sell();
    }

    @Test
    public void discoverTest(){
        objOfHomePage.discover();
    }
}