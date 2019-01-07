package test.pageobjects;

import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.AmazonSignIn;
import sheet.google.api.GoogleSheetReader;

import java.io.File;
import java.util.Properties;

public class AmazonGoogleSignInTest extends AmazonSignIn {
    AmazonSignIn objOfAmazonSignIn = null;

    @BeforeMethod
    public void init() {
        objOfAmazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);

    }




    @DataProvider(name = "googleSheetReader")
    public Object[][] getDataFromGoogleSheet() throws Exception{
        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(spreadsheetId,range);
        return  data;
    }




    @Test(dataProvider = "googleSheetReader")
    public void invalidGoogleSignIn(String email,String password, String expectedErroMessage){
        objOfAmazonSignIn.tempt();
        objOfAmazonSignIn.sendData(email,password);
        String expectedText = expectedErroMessage;
        String actualText = objOfAmazonSignIn.errormsg();
        Assert.assertEquals(actualText,expectedText);
    }
}
