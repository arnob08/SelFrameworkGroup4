package test.pageobjects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.DiscoverPage;
import page.objects.HomePage;

public class DiscoverPageTest extends ApplicationPageBase {

    DiscoverPage objOfDiscoverPage;
    HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfDiscoverPage = PageFactory.initElements (driver, DiscoverPage.class);
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @Test
    public void discoverPageMessageTest(){
        objOfHomePage.discover();
        String actualText = objOfDiscoverPage.discoverPageMsg();
        Assert.assertEquals(actualText, "Discover something unique");
    }

    @Test
    public void cleverUtilityTest(){
        objOfHomePage.discover();
        objOfDiscoverPage.setCleverUtility();
        Assert.assertTrue(objOfDiscoverPage.getCleverUtility().isDisplayed());
    }

    @Test
    public void winterPastelsTest(){
        objOfHomePage.discover();
        objOfDiscoverPage.setWinterPastels();
        Assert.assertTrue(objOfDiscoverPage.getWinterPastels().isDisplayed());
    }

}
