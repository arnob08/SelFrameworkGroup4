package test.pageobjects;

import application.page.base.ApplicationPageBase;
import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.AmazonSignIn;
import page.objects.HomePage;
import page.objects.LoginPage;
import reporting.TestLogger;
import sheet.google.api.GoogleSheetReader;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.testng.annotations.DataProvider;

public class LoginPageTest extends ApplicationPageBase {

    LoginPage objLoginPage = null;
    AmazonSignIn objHomePage = null;


    @BeforeMethod
    public void initializationOfElements() {

        objLoginPage= PageFactory.initElements(driver, LoginPage.class);
        objHomePage = PageFactory.initElements(driver, AmazonSignIn.class);
    }
    /*
    *
    * Read Data from XLSX file
    *
    * */
   @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());

        String[][] data = dr.getExcelSheetData("Sheet3");
        return data;
    }



    @Test(dataProvider = "DP")
    public  void invalidSignin(String email, String password, String expectedErroMessage){

        objHomePage.tempt();
        objLoginPage.login(email, password);
      /*  String expectedText = expectedErroMessage;
        String actulText = objLoginPage.getErroMessage();
        Assert.assertEquals(actulText, expectedText);
*/
    }
    /*
    *
    * Read data from Google Sheet
    * Make sure you have created client_secret.json from your account where you have Google Sheet Data file
    * Delete .credentials directory from your module if it is exists. Other wise it will take existing/old credentials
    * thus it may give unauthorized access error(error code starting with 4, such as 403,404)
    *
    * */
    @Test
    public  void invalidSigninByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        TestLogger.log("Using Sheet Number " + range.charAt(5)+ " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId,range);

            objHomePage.tempt();

        for (List cell: getRecords) {

            objLoginPage.login(cell.get(0).toString(), cell.get(1).toString());

            String expectedText = cell.get(2).toString();

            String actulText = objLoginPage.getErroMessage();
            Assert.assertEquals(actulText, expectedText);

        }

    }

}
