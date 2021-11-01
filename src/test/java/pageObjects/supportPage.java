package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.waitHelper;

import java.util.List;

public class supportPage {

    WebDriver hubdriver;

    public supportPage(WebDriver rdriver){
        hubdriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitHelper = new waitHelper(hubdriver);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/header/h1")
    @CacheLookup
    WebElement header;

    @FindBy(xpath = "//*[@id=\"app\"]/header/nav/div/div/div/button[4]/span[1]/font/font")
    @CacheLookup
    WebElement lnksupport;

    //
    @FindBy(xpath = "//*[@id=\"Menu.supportDownload/support/download\"]/a/div/span")
    @CacheLookup
    WebElement lnkSideMenu;

    //
    @FindBy(how = How.CLASS_NAME, using = "MuiListItem-root.jss180.MuiListItem-gutters:nth-of-type(3)")
    @CacheLookup
    List<WebElement> listSideMenuItem;

    //
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/header/h1")
    @CacheLookup
    WebElement sideMenuHeader;
    utilities.waitHelper waitHelper;

    public void clickNavbar(){
        waitHelper.waitForElement(lnksupport, 1000);
        lnksupport.click();
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
    public int getSideMenuItem(){
      return (listSideMenuItem.size());
    }
}
