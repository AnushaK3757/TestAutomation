package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/yyakeshwara/Downloads/chromedriver 7");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void verifyGoogleSearchByText(){
        GoogleSearchPage googleSearchpage = new GoogleSearchPage(driver);
        Assert.assertTrue(googleSearchpage.verifySearchForDucksOnGoogle(),"Ducks test search not displayed expected results on search results");
        Reporter.log("Verified search and results displayed as expected.");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
