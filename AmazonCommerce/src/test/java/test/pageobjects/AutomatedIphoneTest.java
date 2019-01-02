package test.pageobjects;

import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;
import page.objects.AutomatedIphonePage;

import java.io.File;
import java.io.IOException;

public class AutomatedIphoneTest extends AutomatedIphonePage {

    AmazonHomePage objOfAmazonHomePage;
    AutomatedIphonePage objOfAutomatedIphonePage;

    @BeforeMethod
    public void inIt(){
        objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
        objOfAutomatedIphonePage = PageFactory.initElements(driver,AutomatedIphonePage.class);

    }

    @DataProvider(name = "dp2")
    public Object[][] getData () throws Exception {
        File filePAth = new File(System.getProperty("user.dir")+"/testData/iphone.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filePAth.getAbsolutePath());
        String [][]  data = dr.getExcelSheetData("Sheet1");
        return data;

    }

@Test(dataProvider = "dp2")
public void iphoneCharger(String item) throws IOException{

   objOfAmazonHomePage.iphoneAutomatedSearch(item) ;
   //String expectedText = expectedMessage;



}






}
