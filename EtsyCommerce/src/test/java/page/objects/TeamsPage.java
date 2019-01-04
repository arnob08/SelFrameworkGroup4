package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamsPage extends ApplicationPageBase {

    @FindBy(xpath = "//h1[text()='Teams']")
    private WebElement teamsText;

    @FindBy(id = "email-text")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@value='Subscribe']")
    private WebElement subscribeButton;

    public String verifyTeamPage(){
        String text = getText(teamsText,"teamsText");
        return text;
    }

    public void subscribe(String email){
        sendKeys(emailBox,"emailBox", email);
        click(subscribeButton,"subscribeButton");

    }
}
