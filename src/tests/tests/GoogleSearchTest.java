package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class GoogleSearchTest {

    @BeforeTest
    public void openBrowser(){

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/lib/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");


    }

    @Test
    public void verifyGoogleSearchByText(){
        GoogleSearchPage googleSearchpage = new GoogleSearchPage();
        Assert.assertTrue(googleSearchpage.verifySearchForDucksOnGoogle(),"Ducks test search not displayed expected results on search results");
        Reporter.log("Verified search and results displayed as expected.");
    }



}
