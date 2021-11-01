package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.waitHelper;

public class dataHubPage {
     WebDriver hubdriver;
     waitHelper waitHelper;

    public dataHubPage(WebDriver rdriver){
        hubdriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper = new waitHelper(hubdriver);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div[1]/div[2]/h1")
    @CacheLookup
    WebElement heading;

    @FindBy(xpath = "//*[@id=\"ccc-notify-accept\"]")
    @CacheLookup
    WebElement accept;

    @FindBy(xpath = "//*[@id=\"app\"]/header/a/div/img")
    @CacheLookup
    WebElement pageImage;

    public void clickAccept(){
        waitHelper.waitForElement(accept, 30);
                accept.click();
    }
    public String getHeader(){
       return heading.getText();
    }
    public boolean getImage(){
        waitHelper.waitForElement(pageImage, 20);
        pageImage.isDisplayed();
        return true;
    }
}
