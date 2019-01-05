package test.pageobjects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SellPage;

public class SellPageTest extends ApplicationPageBase {

    SellPage objOfSellPage;
    HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSellPage = PageFactory.initElements (driver, SellPage.class);
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @Test
    public void sellPageMsgTest(){
        objOfHomePage.sell();
        String actualText = objOfSellPage.sellPageMsg();
        Assert.assertEquals(actualText, "Open your Etsy shop");
    }

    @Test
    public void faqsTest(){
        objOfHomePage.sell();
        objOfSellPage.getFaqs();
        Assert.assertTrue(objOfSellPage.getVerifyFaqsPage().isDisplayed());
    }

    @Test
    public void supportTest(){
        objOfHomePage.sell();
        objOfSellPage.support();
        String actualText = objOfSellPage.talkToUsMsg();
        Assert.assertEquals(actualText,"Talk to us");
    }
}
