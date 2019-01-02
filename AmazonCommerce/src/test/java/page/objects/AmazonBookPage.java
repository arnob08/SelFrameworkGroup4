package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBookPage extends ApplicationPageBase {

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[1]/a")
    private WebElement awardWinners;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[2]/a")
    private WebElement bargainBooks;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[3]/a")
    private WebElement fallReading;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[4]/a")
    private WebElement bookOfTheMonth;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[5]/a")
    private WebElement bookOfTheYear;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[6]/a")
    private WebElement celebrityPicks;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[7]/a")
    private WebElement booksOfSpanish;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[8]/a")
    private WebElement childrensBooks;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[9]/a")
    private WebElement dealsInBooks;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[10]/a")
    private WebElement primeBook;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[11]/a")
    private WebElement top20Books;


    public String awardWinnersText(){
    String getText = getText(awardWinners,"Award Winners");
    return getText;

}
    public String bargainBooksText(){
        String getText = getText(bargainBooks,"Bargain books");
        return getText;

    }
    public String fallReadingText(){
        String getText = getText(fallReading,"Fall Reading");
        return getText;

    }
    public String bookOfTheMonthText(){
        String getText = getText(bookOfTheMonth,"Book Of The Month");
        return getText;

    }
    public String bookOfTheYearText(){
        String getText = getText(bookOfTheYear,"Book Of The Year");
        return getText;

    }
    public String celebrityPicksText(){
        String getText = getText(celebrityPicks,"Celebrity Picks");
        return getText;

    }
    public String bookOfSpanishText(){
        String getText = getText(booksOfSpanish,"Books In Spanish");
        return getText;

    }
    public String childrensBooksText(){
        String getText = getText(childrensBooks,"Children's Books");
        return getText;

    }
    public String dealsInBooksText(){
        String getText = getText(dealsInBooks,"Deals In Books");
        return getText;

    }
    public String primeBookText(){
        String getText = getText(primeBook,"Prime Book");
        return getText;

    }
    public String top20BookText(){
        String getText = getText(top20Books,"Top 20 Books");
        return getText;

    }



}
