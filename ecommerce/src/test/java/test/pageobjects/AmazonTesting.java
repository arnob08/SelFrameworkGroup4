package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;


public class AmazonTesting extends AmazonHomePage {
    AmazonHomePage objOfAmazon = null;

    @BeforeMethod
    public void initializationOfElements() {

        objOfAmazon = PageFactory.initElements(driver, AmazonHomePage.class);
    }

    @Test
    public void searchboxTest() {

       objOfAmazon.orders();

        System.out.println("searchBox test passed");
    }

  @Test
    public  void yourAmazon(){
      String getText = objOfAmazon.contactUs();
      Assert.assertEquals(getText, "Your Amazon.com");
      System.out.println("Amazon Test Passed");
    }

    @Test
    public void lastMinuteDeal(){
        String dealText = objOfAmazon.lastMinuteDael();
        Assert.assertEquals(dealText, "Year-End Deals");
        System.out.println("last minute passed");
    }

    @Test
    public void GiftCardTest(){
        String actualtext = objOfAmazon.giftCards();
        Assert.assertEquals(actualtext,"Gift Cards");
        System.out.println("Gift card passed");
    }
}