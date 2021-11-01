package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardPage {

    WebDriver hubdriver;

    public dashboardPage(WebDriver rdriver){
        hubdriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(className = "jss187 h1")
    @CacheLookup
    WebElement header;

    @FindBy(className = "MuiTab-wrapper:nth-of-type(1)")
    @CacheLookup
    WebElement lnkDashord;

    //
    @FindBy(className = "MuiListItem-root.jss180.MuiListItem-gutters")
    @CacheLookup
    WebElement lnkSideMenu;

    //
    @FindBy(className = "MuiListItem-root.jss180.MuiListItem-gutters:nth-of-type(3)")
    @CacheLookup
    WebElement sideMenuItem;

    //
    @FindBy(className = "jss1039.jss1040 h1")
    @CacheLookup
    WebElement getLnkSideMenuHeader;

    public void clickNavbar(){
        lnkDashord.click();
    }
    public void clickSideMenuItem(){
        sideMenuItem.click();
    }

    public void getHeader(){
        header.getText();
    }
    public void getSideMenuHeader(){
        getLnkSideMenuHeader.getText();
    }
    public void getSideMenuItem(){
        sideMenuItem.getText();
    }
}

