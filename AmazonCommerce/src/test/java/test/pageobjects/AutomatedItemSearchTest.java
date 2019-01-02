package test.pageobjects;

import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.AmazonHomePage;

import java.io.File;
import java.io.IOException;

public class AutomatedItemSearchTest extends AmazonHomePage {

AmazonHomePage objOfAmazonHomePage;

@BeforeMethod
    public void inIt(){
    objOfAmazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);

}

@DataProvider(name = "dp")
    public Object[][] getItemData() throws Exception {
    File filepath = new File(System.getProperty("user.dir")+"/testData/item.xlsx");
    MyDataReader dr = new MyDataReader();
    dr.setExcelFile(filepath.getAbsolutePath());
    String [][] data = dr.getExcelSheetData("Sheet1");
    return data;

}
@Test(dataProvider = "dp")
    public void automatedItemsearch(String item){
    objOfAmazonHomePage.automatedSearch(item);
    //objOfAmazonHomePage.clickSearchButton();

}



}
