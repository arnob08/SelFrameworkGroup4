package test.pageobjects;

import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.AmazonSignIn;
import reporting.TestLogger;
import sheet.google.api.GoogleSheetReader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class signInTest extends AmazonSignIn {


    AmazonSignIn objOfAmazonSignIn = null;

    @BeforeMethod
    public void init() {
        objOfAmazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);

    }


    @DataProvider(name = "DP2")
    public Object[][] getTestdata2() throws Exception {
        File filepath = new File(System.getProperty("user.dir") + "/testData/myData.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }

    @DataProvider(name = "googleSheetReader")
    public Object[][] getDataFromGoogleSheet() throws Exception{
        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        String[][] data = GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(spreadsheetId,range);
        return  data;
    }


    @Test(dataProvider = "DP2")
    public void signTest(String email, String password, String errorMessage) {
        objOfAmazonSignIn.tempt();
        objOfAmazonSignIn.sendData(email, password);
        String actualText = objOfAmazonSignIn.errormsg();
         String expectedText = errorMessage;
          Assert.assertEquals(actualText,expectedText);
    }

    @Test(dataProvider = "googleSheetReader")
    public void invalidGoogleSignIn(String email,String password, String expectedErroMessage){
        objOfAmazonSignIn.tempt();
        objOfAmazonSignIn.sendData(email,password);
        String expectedText = expectedErroMessage;
        String actualText = objOfAmazonSignIn.errormsg();
        Assert.assertEquals(actualText,expectedText);
    }
/*
    @Test(dataProvider = "supplyData")
    public void signInTest(String email, String password, String expectedErroMessage) {
        objOfAmazonSignIn.signIn();
        objOfAmazonSignIn.signInButton();


    }*/


//    @Test(dataProvider = "DP")
//    public void invalidSignin(String email, String password, String expectedErroMessage) {
//
////        objOfAmazonSignIn.signIn();
//        objOfAmazonSignIn.signInButton();
//        objOfAmazonSignIn.login1(email, password);
//        String expectedText = expectedErroMessage;
//        String actualText = objOfAmazonSignIn.errormsg();
//        Assert.assertEquals(actualText,expectedErroMessage);
//    }
/*
    @Test
    public void invalidSigninByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        TestLogger.log("Using Sheet Number " + range.charAt(5) + " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);

        objOfAmazonSignIn.tempt();

        for (List cell : getRecords) {

            objOfAmazonSignIn.sendData(cell.get(0).toString(), cell.get(1).toString());

            String expectedText = cell.get(2).toString();

            String actulText = objOfAmazonSignIn.errormsg();
            Assert.assertEquals(actulText, expectedText);

        }*/


    }
