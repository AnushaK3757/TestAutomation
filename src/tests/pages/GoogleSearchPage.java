package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GoogleSearchPage {

    public WebDriver driver;

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement textBox_GoogleSearch;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement button_GoogleSearch;

    @FindBy(xpath = " //*[contains(text(),'Duck - Wikipedia')]")
    public WebElement text_GoogleResult;

    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public boolean verifySearchForDucksOnGoogle(){
        boolean isExpectedverified = false;
        textBox_GoogleSearch.sendKeys("Ducks");
        button_GoogleSearch.click();
        if(text_GoogleResult.isDisplayed()){
            isExpectedverified = true;
            Reporter.log("Expected link is displayed on google results");
        }else
            Reporter.log("Expected link is not displayed on google results");
        return isExpectedverified;
    }

}
