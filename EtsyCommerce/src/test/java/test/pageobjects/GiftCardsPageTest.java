package test.pageobjects;

import application.page.base.ApplicationPageBase;
import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.GiftCardsPage;

import java.io.File;

public class GiftCardsPageTest extends ApplicationPageBase {

    FooterPage objOfFooterPage;
    GiftCardsPage objOfGiftCardsPage;

    @BeforeMethod
    public void initializationOfElements(){
        objOfFooterPage = PageFactory.initElements(driver, FooterPage.class);
        objOfGiftCardsPage = PageFactory.initElements(driver, GiftCardsPage.class);
    }

    @Test
    public void giftCardsTest(){
        objOfFooterPage.goToGiftCards();
        String actualText = objOfGiftCardsPage.giftCardMsg();
        Assert.assertEquals(actualText, "Give the gift of Etsy");
    }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @Test(dataProvider = "DP")
    public void buyGiftCardTest (String to,String from,String note, String email){
        objOfFooterPage.goToGiftCards();
        objOfGiftCardsPage.buyGiftCard(to,from,note,email);
        Assert.assertTrue(objOfGiftCardsPage.getVerifyAddToCartButton().isDisplayed());
    }


}
