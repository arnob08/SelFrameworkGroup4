package test.pageobjects;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SearchResultPage;

public class SearchResultPageTest extends SearchResultPage {

    HomePage objOfHomePage;
    SearchResultPage objOfSearchResultPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSearchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    }


    @Test
    public void selectArtTest (){
        objOfHomePage.search();
        objOfSearchResultPage.selectHat();
    }

}
