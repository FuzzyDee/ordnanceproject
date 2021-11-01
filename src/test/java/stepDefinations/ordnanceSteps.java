package stepDefinations;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.dataHubPage;
import pageObjects.docPage;
import pageObjects.supportPage;

import java.util.concurrent.TimeUnit;


public class ordnanceSteps {

    WebDriver driver;
    public dataHubPage home;
    public docPage doc;
    public supportPage support;
    @Given("I Launched the Browser")
    public void i_launched_the_browser() {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Dudley\\Documents\\ChromeDriver\\chromedriver.exe");
      driver = new ChromeDriver();
      home = new dataHubPage(driver);
      doc = new docPage(driver);
    }

    @When("I navigate to the OSDatahub Page {string}")
    public void i_navigate_to_the_os_datahub_page(String url) {
        driver.navigate().to(url);
    }

    @When("I click accept cookies")
    public void i_click_accept_cookies() {
        home.clickAccept();
    }
    @Then("I should see the page load correctly")
    public void i_should_see_the_page_load_correctly() {
        boolean pageImage = home.getImage();
        Assert.assertTrue(pageImage);
    }

    @Then("I should see a welcome message saying {string}")
    public void i_should_see_a_welcome_message_saying(String message) {
        String header = home.getHeader();
        Assert.assertTrue(home.getHeader().contains(message));
        System.out.println(header);

    }
    // API dashboard page
    @When("I navigate to API Dashboard")
    public void i_navigate_to_api_dashboard() {

    }
    @Then("I should see the Dashboard page header")
    public void iShouldSeeTheDashboardPageHeader() {
    }
    //download page
    @When("I navigate to the Download page")
    public void i_navigate_to_the_download_page() {

    }
    @Then("I should see the Download page header")
    public void i_should_see_the_download_page_header() {

    }

    // doc page
    @When("I navigate to the Doc page")
    public void i_navigate_to_the_doc_page() {
        doc.clickNavbar();
    }

    @Then("I should see the Doc page header {string}")
    public void i_should_see_the_doc_page_header(String header) {
        String txt = doc.getHeader();
        Assert.assertTrue(header, true);
        System.out.println(txt);
    }
    @When("I click on the side menu")
    public void i_click_on_the_side_menu() {
        doc.clickSideMenuItem();
    }
    @Then("I should see highlighted page displayed {string}")
    public void i_should_see_highlighted_page_displayed(String header) {
        String txt = doc.getSideMenuHeader();
        Assert.assertTrue(doc.getSideMenuHeader().contains(header));
        System.out.println(txt);
    }
    @And("the current Url should be {string}")
    public void the_current_url_should_be(String currentUrl) {
        String current = driver.getCurrentUrl();
        Assert.assertTrue(driver.getCurrentUrl().contains(currentUrl));
        System.out.println(current);
    }

   //support page
    @When("I navigate to the Support page")
    public void i_navigate_to_the_support_page() {
        support.clickNavbar();
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String pagetitle ) {
        String title = driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains(pagetitle));
        System.out.println(title);
    }

    @When("I click on the Support side menu")
    public void i_click_on_the_support_side_menu() {
        support.clickNavbar();
    }
    @Then("I should see support highlighted page displayed")
    public void i_should_see_support_highlighted_page_displayed() {
    }

    @Then("I should see support highlighted page {string}")
    public void iShouldSeeSupportHighlightedPage(String arg0) {
        String header = support.getSideMenuHeader();
        System.out.println(header);
    }
    @And("the side bar should display lists")
    public void theSideBarShouldDisplayLists() {
        support.getSideMenuItem();
    }



}
