package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonBookPage;
import page.objects.AmazonHomePage;

public class AmazonBookTest extends AmazonBookPage {

    AmazonHomePage objOfAmazonHomePage;
    AmazonBookPage objOfAmazonBookPage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazonBookPage = PageFactory.initElements(driver,AmazonBookPage.class);
    }

    @Test
    public void awardWinnerTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.awardWinnersText();
        String expectedText= "Award Winners";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void bargainBooksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.bargainBooksText();
        String expectedText= "Bargain Books";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void fallReadingTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.fallReadingText();
        String expectedText= "Fall Reading";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void bookOfTheMonthTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.bookOfTheMonthText();
        String expectedText= "Best Books of the Month";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void bookoftheYearTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.bookOfTheYearText();
        String expectedText= "Best Books of the Year";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void celebrityPicksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.celebrityPicksText();
        String expectedText= "Celebrity Picks";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void booksOfSpanishTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.bookOfSpanishText();
        String expectedText= "Books in Spanish";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void childrensBooksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.childrensBooksText();
        String expectedText= "Children's Books";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void dealsInBooksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.dealsInBooksText();
        String expectedText= "Deals in Books";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void primeBooksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.primeBookText();
        String expectedText= "Prime Book Box";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void top20BooksTest(){
        objOfAmazonHomePage.book();
        String actualText = objOfAmazonBookPage.top20BookText();
        String expectedText= "Top 20 Lists in Books";
        Assert.assertEquals(actualText,expectedText);

    }






}
