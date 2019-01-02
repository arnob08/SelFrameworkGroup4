package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBatPage extends ApplicationPageBase {

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[2]/span/a/span")
    private WebElement softBallBat;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[4]/span/a/span")
    private WebElement baseBallBat;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[6]/span/a/span")
    private WebElement huntingTool;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[8]/span/a/span")
    private WebElement huntingKnives;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[10]/span/a/span")
    private WebElement baseBallStarterEquipment;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[2]/span/a/span")
    private WebElement tv;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[3]/span/ul/div/li[4]/span/a/span")
    private WebElement primeVideo;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[2]/span/a/span")
    private WebElement kidsBaseballBat;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[4]/span/a/span")
    private WebElement kidsSport;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[6]/span/a/span")
    private WebElement stuffedAnimal;




    public String softBallText(){
        String getText = getText(softBallBat,"SoftBall Bat");
        return getText;
    }


    public String baseBallText(){
        String getText = getText(baseBallBat,"Baseball Bat");
        return getText;
    }


    public String huntingToolText(){
        String getText = getText(huntingTool,"Hunting Tool");
        return getText;
    }


    public String huntingKnivesText(){
        String getText = getText(huntingKnives,"Hunting Knives");
        return getText;
    }



    public String baseBallStarterEquipmentText(){
        String getText = getText(baseBallStarterEquipment,"Baseball Starter Equipment");
        return getText;
    }


    public String tvText(){
        String getText = getText(tv,"Tv");
        return getText;
    }


    public String primeVideoText(){
        String getText = getText(stuffedAnimal,"Prime Video");
        return getText;
    }

    public String kidsBaseBallBatText(){
        String getText = getText(kidsBaseballBat,"Kids Baseball Bat");
        return getText;
    }

    public String kidsSportText(){
        String getText = getText(kidsSport,"Kids Sport");
        return getText;
    }

    public String stuffedAnimalText(){
        String getText = getText(stuffedAnimal,"Stuffed Animal");
        return getText;
    }

}
