package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonBatPage;
import page.objects.AmazonHomePage;

public class AmazonBatTest extends AmazonBatPage {

    AmazonHomePage objOfAmazonHomePage;
    AmazonBatPage objOfAmazonBatPage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAmazonBatPage = PageFactory.initElements(driver,AmazonBatPage.class);
    }


    @Test
    public void softBallTest(){
        objOfAmazonHomePage.bat();
     String actualText =  objOfAmazonBatPage.softBallText();
     String expectedText = "Baseball & Softball Bats";
     Assert.assertEquals(actualText,expectedText);

    }


    @Test
    public void baseBallTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.baseBallText();
        String expectedText = "Baseball Bats";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void huntingToolTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.huntingToolText();
        String expectedText = "Hunting & Tactical Knives & Tools";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void huntingKnifeTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.huntingKnivesText();
        String expectedText = "Hunting Knives";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void baseBallStarterEquipmentTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.baseBallStarterEquipmentText();
        String expectedText = "Baseball & Softball Starter Equipment";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void tvTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.tvText();
        String expectedText = "TV";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void primeVideoTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.primeVideoText();
        String expectedText = "Stuffed Animals & Plush Toys";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void kidsBaseBallTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.kidsBaseBallBatText();
        String expectedText = "Kids' Baseball Bats";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void kidsSportTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.kidsSportText();
        String expectedText = "Kids' Sports";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void stuffedAnimalTest(){
        objOfAmazonHomePage.bat();
        String actualText =  objOfAmazonBatPage.stuffedAnimalText();
        String expectedText = "Stuffed Animals & Plush Toys";
        Assert.assertEquals(actualText,expectedText);

    }







}
