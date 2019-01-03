package test.pageobjects;

import application.page.base.ApplicationPageBase;
import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.RegisterPage;

import java.io.File;

public class RegisterTestPage extends ApplicationPageBase {
    RegisterPage objOfRegisterPage;
    HomePage objOfHomePage;

    @BeforeMethod
    public void initializationOfElements (){
        objOfRegisterPage = PageFactory.initElements(driver, RegisterPage.class);
        objOfHomePage = PageFactory.initElements (driver, HomePage.class);
    }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet4");
        return data;
    }

    @Test(dataProvider = "DP")
    public void register (String email,String firstName,String password){
        objOfHomePage.register();
        objOfRegisterPage.register(email, firstName, password);
    }
}