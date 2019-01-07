package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AmazonBabyToyPage extends ApplicationPageBase {


    @FindBy(xpath = "//span[text()='Baby & Toddler Toys']")
    private WebElement babyAndToddler;

    @FindBy(xpath ="//span[text()='Baby Musical Toys']")
    private WebElement musicalToys;

    @FindBy(xpath = "//span[text()='Early Development Activity Centers']")
    private WebElement babyRattler;

    @FindBy(xpath ="//span[text()='Baby Teether Toys']" )
    private WebElement babyTeething;

    @FindBy(xpath ="//span[text()='Baby Activity & Entertainment Products']" )
    private WebElement babyEntertainment;

    @FindBy(xpath ="//span[text()='Baby Gyms & Playmats']" )
    private WebElement babyGym;

    @FindBy(xpath ="//span[text()='Baby Walkers']" )
    private WebElement babyWalker;

    @FindBy(xpath ="//span[text()='Baby Bibs']" )
    private WebElement babyBib;

    @FindBy(xpath ="//span[text()='Infant Bouncers & Rockers']" )
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
