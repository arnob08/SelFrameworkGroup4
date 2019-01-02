package test.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonDogCollarPage;
import page.objects.AmazonHomePage;

public class AmazonDogCollarTest extends AmazonDogCollarPage {
    AmazonDogCollarPage objOfAmazonDogCollarPage;
    AmazonHomePage objOfAmazonHomePage;
    @BeforeMethod
public void inIt(){
       objOfAmazonDogCollarPage = PageFactory.initElements(driver,AmazonDogCollarPage.class);
       objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
    }

@Test
    public void collarTest1() {
    objOfAmazonHomePage.searchDogCollars();
    String actualText = objOfAmazonDogCollarPage.dogcollar1();
    String expactedText = "Safety Basic Classic and Training Slip Heavy Duty Nylon Dog Black Collar (Latest Buckle Down Plastic Clip Collar - for Medium Boy and Girl Dogs (Medium,Black)";
    Assert.assertEquals(actualText,expactedText);

}


    @Test
    public void collarTest2(){
        objOfAmazonHomePage.searchDogCollars();
        String actualText = objOfAmazonDogCollarPage.dogCollar2();
        String expactedText = "American Flag Dog Collar in 5 Different Sizes Classic...";
        Assert.assertEquals(actualText, expactedText);


}
    @Test
    public void collarTest3() {
        objOfAmazonHomePage.searchDogCollars();
        String actualText = objOfAmazonDogCollarPage.dogCollar3();
        String expactedText = "Blueberry Pet 6 Colors 3M Reflective Classic Fashion Color Dog Collar, Neutral Gray, Large, Neck 18\"-26\", Adjustable Collars for Dogs";
        Assert.assertEquals(actualText, expactedText);
    }
}
