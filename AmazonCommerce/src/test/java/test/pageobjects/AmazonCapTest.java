package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.AmazonCapPage;

public class AmazonCapTest extends AmazonCapPage {

    AmazonHomePage objOfAmazonHomePage;
    AmazonCapPage objOfAmazoniPodpage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazoniPodpage = PageFactory.initElements(driver, AmazonCapPage.class);
    }

    @Test
    public void mensHatTest(){
        objOfAmazonHomePage.cap();
     String actualText = objOfAmazoniPodpage.mensHatText();
     String expectedText = "Men's Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void mensBeaniesTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.mensBeaniText();
        String expectedText = "Men's Skullies & Beanies";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void scarfTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.scarfsText();
        String expectedText = "Surf, Skate & Street Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void mensAccessioriesTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.mensAccessioriesText();
        String expectedText = "Men's Accessories";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void womensHatTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.womensHatText();
        String expectedText = "Women's Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void womensAccessioriesTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.womensAccessioriesText();
        String expectedText = "Women's Accessories";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void boysCapTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.boysCapText();
        String expectedText = "Boys' Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void mesNoveltyTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.mensNoveltyText();
        String expectedText = "Men's Novelty Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void womensNoveltyTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.womensNoveltyText();
        String expectedText = "Women's Novelty Hats & Caps";
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void noveltyClothesTest(){
        objOfAmazonHomePage.cap();
        String actualText = objOfAmazoniPodpage.noveltyClothesText();
        String expectedText = "Novelty Clothing";
        Assert.assertEquals(actualText,expectedText);
    }








}
