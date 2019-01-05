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
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @Test
    public void logoTest(){
        boolean logo = objOfHomePage.logoVer();
        Assert.assertEquals(logo,true);
    }

    @Test
    public void searchTest() {
        objOfHomePage.search();
        Assert.assertTrue(objOfHomePage.getVerifySearchResult().isDisplayed());
    }

    @Test
    public void registerTest(){
        objOfHomePage.register();
        Assert.assertTrue(objOfHomePage.getVerifyRegisterPage().isDisplayed());
    }

    @Test
    public void sellTest(){
        objOfHomePage.sell();
        Assert.assertTrue(objOfHomePage.getVerifySellPage().isDisplayed());
    }

    @Test
    public void discoverTest(){
        objOfHomePage.discover();
        Assert.assertTrue(objOfHomePage.getVerifyDiscoverPage().isDisplayed());
    }

//    @Test
//    public void selectArtAndCollectiblesTest(){
//        objOfHomePage.selectArtAndCollectibles();
//    }
}
