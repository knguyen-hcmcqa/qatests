package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PageGenerator;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeMethod
    public void setup () {
        System.setProperty("webdriver.chrome.driver", "D:\\AutomationTest\\qatests\\browsers\\chromedriver.exe");

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver,15);

        driver.manage().window().maximize();

        page = new PageGenerator(driver);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
