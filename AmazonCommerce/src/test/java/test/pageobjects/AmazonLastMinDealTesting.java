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
@Test
    public void kitchenTest(){
        objOfAmazonOfHomePage.clickLastMinuteDeal();
        String actualText = objOfLastMinuteDealPage.kitchen();
        Assert.assertEquals(actualText,"Kitchen");
    System.out.println("Kitchen Passed");
}
@Test
    public void electronicsTest(){
        objOfAmazonOfHomePage.clickLastMinuteDeal();
        String actualText = objOfLastMinuteDealPage.electronics();
        Assert.assertEquals(actualText,"Electronics");
    System.out.println("Electronics passed");
}


}
