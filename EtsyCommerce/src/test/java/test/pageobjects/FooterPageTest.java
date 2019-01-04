package test.pageobjects;

import application.page.base.ApplicationPageBase;
import org.apache.poi.ss.usermodel.Footer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterPage;

public class FooterPageTest extends ApplicationPageBase {

    FooterPage objOfFooterPage;

    @BeforeMethod
    public void initializationOfElements(){

        objOfFooterPage = PageFactory.initElements(driver, FooterPage.class);
    }

    @Test
    public void giftCardsTest(){
        objOfFooterPage.goToGiftCards();
    }

    @Test
    public void teamsTest(){

        objOfFooterPage.goToTeams();
    }
}
