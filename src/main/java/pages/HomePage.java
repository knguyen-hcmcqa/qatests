package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://ktvn-test.s3-website.us-east-1.amazonaws.com/";

    @FindBy(how = How.CLASS_NAME, using = "col-login__btn")
    public WebElement signInButton;

    @FindBys({
            @FindBy(how = How.XPATH, using = "//td[@class='td-request-approved uppercase']/following-sibling::td[1]/div[contains(text(), '2019')]")
    })
    public List<WebElement> elementsApproved;

    //Go to Homepage
    public void goToHomePage() {
        driver.get(baseURL);
    }

    //Go to LoginPage
    public LoginPage goToLoginPage() {
        click(signInButton);
        return new PageFactory().initElements(driver, LoginPage.class);
    }

    public void verifyApprovedRequests(int expectedNum) {
        int actualNum = elementsApproved.size();

        Assert.assertEquals(actualNum, expectedNum);
    }
}