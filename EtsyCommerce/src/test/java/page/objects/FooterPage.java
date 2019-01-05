package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends ApplicationPageBase {

    @FindBy(xpath = "//span[text()='Gift cards']")
    private WebElement giftCards;

    @FindBy(xpath = "//span[text()='Teams']")
    private WebElement teams;

    @FindBy(id = "page-title")
    private WebElement verifyGiftCardPage;

    @FindBy(xpath = "//h1[text()='Teams']")
    private WebElement verifyTeamsPage;

    public void goToGiftCards(){
        click(giftCards,"giftCards");
    }

    public void goToTeams(){
        click(teams,"teams" );
    }

    public WebElement getVerifyGiftCardPage(){
        return verifyGiftCardPage;
    }

    public WebElement getVerifyTeamsPage() {
        return verifyTeamsPage;
    }
}
