package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AmazonBabyToyPage extends ApplicationPageBase {


    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[2]/span/a/span")
    private WebElement babyAndToddler;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[4]/span/a/span")
    private WebElement musicalToys;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[8]/span/a/span")
    private WebElement babyRattler;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[2]/span/a/span" )
    private WebElement babyTeething;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[4]/span/a" )
    private WebElement babyEntertainment;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[6]/span/a/span" )
    private WebElement babyGym;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[8]/span/a/span" )
    private WebElement babyWalker;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[10]/span/a/span" )
    private WebElement babyBib;

    @FindBy(xpath ="//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[12]/span/a/span" )
    private WebElement babyBouncer;

public String babyAndToddlerText(){
    String getText = getText(babyAndToddler,"Baby and Toddler");
    return getText;

}
public String musicalToysText(){
    String getText = getText(musicalToys,"Musical Toys");
    return getText;
}
public String babyRattlerText(){
    String getText = getText(babyRattler,"Baby rattler");
    return getText;

}
    public String babyTeethinText(){
        String getText = getText(babyTeething,"Baby Teething ");
        return getText;

    }
    public String babyEntertainmentText(){
        String getText = getText(babyEntertainment,"Baby Entertainment");
        return getText;

    }
    public String babyGymText(){
        String getText = getText(babyGym,"Baby Gym");
        return getText;

    }
    public String babyWalkerText(){
        String getText = getText(babyWalker,"Baby Walker");
        return getText;

    }
    public String babyBibText(){
        String getText = getText(babyBib,"Baby Bib");
        return getText;

    }
    public String babyBouncerText(){
        String getText = getText(babyBouncer,"Baby Bouncer");
        return getText;

    }
}
