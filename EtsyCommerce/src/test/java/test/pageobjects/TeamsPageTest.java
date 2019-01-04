package test.pageobjects;

import application.page.base.ApplicationPageBase;
import com.util.xlsx.reader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.TeamsPage;

import java.io.File;

public class TeamsPageTest extends ApplicationPageBase {

    TeamsPage objOfTeamsPage;
    FooterPage objOfFooterPage;

    @BeforeMethod
    public void initializationOfElements(){
        objOfTeamsPage = PageFactory.initElements(driver, TeamsPage.class);
        objOfFooterPage = PageFactory.initElements(driver, FooterPage.class);
    }

    @Test
    public void verifyTeamPageTest(){
        objOfFooterPage.goToTeams();
        String actualText = objOfTeamsPage.verifyTeamPage();
        Assert.assertEquals(actualText, "Teams");
    }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet2");
        return data;
    }

    @Test(dataProvider = "DP")
    public void subscribeTest(String email){
        objOfFooterPage.goToTeams();
        objOfTeamsPage.subscribe(email);
    }
}

