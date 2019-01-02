package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonFooterPage;

public class FooterListTesting extends AmazonFooterPage {

    AmazonFooterPage objOfAmazonFooterPage;
    @BeforeMethod
    public void initalizationOfElements(){
        objOfAmazonFooterPage = PageFactory.initElements(driver,AmazonFooterPage.class);
    }
@Test
    public void footerLinkCountTesting(){
        int linkList = objOfAmazonFooterPage.footerList();
        Assert.assertEquals(1,linkList);

    }

@Test
    public void countryNameTest(){
        String actualText = objOfAmazonFooterPage.countryName();
        Assert.assertEquals(actualText,"United States");
}


}
