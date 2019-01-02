package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.AmazonShirtPage;

public class AmazonShirtPageTesting extends AmazonHomePage{

    AmazonHomePage objOfAmazonHomePage;
    AmazonShirtPage objOfAmazonShirtPage;

    @BeforeMethod
    public  void inIt(){

        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazonShirtPage = PageFactory.initElements(driver,AmazonShirtPage.class);
    }

    @Test
    public void searchWhiteShirtTest(){
        objOfAmazonHomePage.searchShirts();
       String actualText = objOfAmazonShirtPage.whiteTShirt();
        String expectedText = "Men's Regular-Fit Quick-Dry Golf Polo Shirt";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void searchCheckShirtTest(){
        objOfAmazonHomePage.searchShirts();
        String actulText = objOfAmazonShirtPage.checkShirt();
        String expectedText = "Men's Standard-Fit Long-Sleeve Plaid Slub Shirt";
        Assert.assertEquals(actulText,expectedText);
    }

@Test
    public void searchBlackShirtTest(){
        objOfAmazonHomePage.searchShirts();
        String actualText = objOfAmazonShirtPage.blackTShirt();
        String expectedText = "Men's Workwear Pocket Long-Sleeve Henley Shirt";
        Assert.assertEquals(actualText,expectedText);
}

}
