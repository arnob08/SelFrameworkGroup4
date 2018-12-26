package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.GiftCardsPage;

public class GiftCardPageTest extends GiftCardsPage {
    AmazonHomePage objOfAmazonHomePage = null;
    GiftCardsPage objOfGiftCardPage = null;

   @BeforeMethod
       public void initializationOfElements(){

       objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
       objOfGiftCardPage = PageFactory.initElements(driver,GiftCardsPage.class);

   }


    @Test
    public void redeemGiftCardTest(){
       objOfAmazonHomePage.clickGiftCards();
       String actualText = objOfGiftCardPage.reedemGiftCard();
        Assert.assertEquals(actualText,"Redeem Gift Cards");
        System.out.println("eGift passed");

    }


@Test
    public void yourBalanceTest(){
       objOfAmazonHomePage.clickGiftCards();
       String actualText = objOfGiftCardPage.viewYourBalance();
       Assert.assertEquals(actualText,"View Your Balance");
    System.out.println("your balance passed");

}

@Test
    public  void bitthdayTest(){
       objOfAmazonHomePage.clickGiftCards();
       String actualText = objOfGiftCardPage.birthdays();
       Assert.assertEquals(actualText,"Birthdays");
    System.out.println("Birthday Passed");

}

}
