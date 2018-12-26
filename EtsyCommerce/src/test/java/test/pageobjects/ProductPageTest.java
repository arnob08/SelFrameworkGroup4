package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.ProductPage;
import page.objects.SearchResultPage;

public class ProductPageTest extends ProductPage {

    HomePage objOfHomePage;
    SearchResultPage objOfSearchResultPage;
    ProductPage objOfProductPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSearchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
        objOfProductPage = PageFactory.initElements(driver, ProductPage.class);
    }

    @Test
    public void selectOptionTest() {
        objOfHomePage.search();
        objOfSearchResultPage.selectHat();
        objOfProductPage.selectOption();
        objOfProductPage.selectQuantity();
        objOfProductPage.clickCartButton();
    }
}

