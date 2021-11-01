package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class docPage {
    WebDriver hubdriver;

    public docPage(WebDriver rdriver){
        hubdriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/header/h1")
    @CacheLookup
    WebElement header;

    @FindBy(xpath = "//*[@id=\"app\"]/header/nav/div/div/div/button[3]")
    @CacheLookup
    WebElement lnkDoc;

    //
    @FindBy(xpath = "//*[@id=\"Menu.downloadsApi\"]/a/div/span")
    @CacheLookup
    WebElement lnkSideMenu;

    //
    @FindBy(className = "MuiListItem-root.jss180.MuiListItem-gutters:nth-of-type(3)")
    @CacheLookup
    WebElement listSideMenuItem;

    //
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/header/h1")
    @CacheLookup
    WebElement sideMenuHeader;

    public void clickNavbar(){
        lnkDoc.click();
    }
    public void clickSideMenuItem(){
        lnkSideMenu.click();
    }

    public String getHeader(){
       return header.getText();
    }
    public String getSideMenuHeader(){
        return sideMenuHeader.getText();
    }
    public void getSideMenuItem(){
        listSideMenuItem.getText();
    }
}
