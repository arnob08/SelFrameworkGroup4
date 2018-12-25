package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.LastMinuteDealPage;

public class AmazonLastMinDealTesting extends LastMinuteDealPage {
    LastMinuteDealPage objOfLastMinuteDealPage= null;
    AmazonHomePage objOfAmazonOfHomePage = null;

    @BeforeMethod()
        public void initializationOfElements(){
        objOfLastMinuteDealPage = PageFactory.initElements(driver,LastMinuteDealPage.class);
        objOfAmazonOfHomePage= PageFactory.initElements(driver,AmazonHomePage.class);
    }

   @Test
   public void amazonProductTest() {
        objOfAmazonOfHomePage.clickLastMinuteDeal();
        String actualText = objOfLastMinuteDealPage.amazonProducts();
       Assert.assertEquals(actualText,"");

       System.out.println("Amazon device passed");
   }

@Test
    public void furnitureTest(){
        objOfAmazonOfHomePage.clickLastMinuteDeal();
        String actualText = objOfLastMinuteDealPage.furnitures();
        Assert.assertEquals(actualText,"Furniture");
    System.out.println("Furniture passed");
}
}
