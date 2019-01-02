package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonBabyToyPage;
import page.objects.AmazonHomePage;

public class AmazonBabyToysTest extends AmazonBabyToyPage {

    AmazonHomePage objOfAmazonHomePage;
AmazonBabyToyPage objOfAmazonBabyToyPage;
    @BeforeMethod
    public void inIT(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazonBabyToyPage = PageFactory.initElements(driver,AmazonBabyToyPage.class);

    }

@Test
    public void babyAndToddlerTest(){
        objOfAmazonHomePage.babyToys();
    String actualText = objOfAmazonBabyToyPage.babyAndToddlerText();
    String expectedText = "Baby & Toddler Toys";
    Assert.assertEquals(actualText,expectedText);
}

    @Test
    public void babyMusicalToyTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.musicalToysText();
        String expectedText = "Baby Musical Toys";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyRattlerTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyRattlerText();
        String expectedText = "Baby Rattles";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyTeethingTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyTeethinText();
        String expectedText = "Baby Teether Toys";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyEntertaimentTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyEntertainmentText();
        String expectedText = "Baby Activity & Entertainment Products";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyGymTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyGymText();
        String expectedText = "Baby Gyms & Playmats";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyWalkerTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyWalkerText();
        String expectedText = "Baby Walkers";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyBibTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyBibText();
        String expectedText = "Baby Bibs";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void babyBouncerTest(){
        objOfAmazonHomePage.babyToys();
        String actualText = objOfAmazonBabyToyPage.babyBouncerText();
        String expectedText = "Infant Bouncers & Rockers";
        Assert.assertEquals(actualText,expectedText);
    }



}
