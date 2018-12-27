package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.AmazonShoesPage;

public class AmazonShoeListTesting extends AmazonShoesPage {
    AmazonHomePage objOfAmazonHomePage;
    AmazonShoesPage objOfAmazonShoesPage;

    @BeforeMethod
    public void intialisationOfElements(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazonShoesPage = PageFactory.initElements(driver,AmazonShoesPage.class);

    }

    @Test
    public void shoeListSortTest(){
        objOfAmazonHomePage.searchItem();
        objOfAmazonShoesPage.shoeListSort();
    }
@Test
    public void checkTopBrandBoxTest(){
        objOfAmazonHomePage.searchItem();
        objOfAmazonShoesPage.checkTopBrandsBox();
}

    @Test
    public void sortLinktest(){
        objOfAmazonHomePage.searchItem();
        int listCount = objOfAmazonShoesPage.countSortListLink();
        Assert.assertEquals(1,listCount);
    }

}
