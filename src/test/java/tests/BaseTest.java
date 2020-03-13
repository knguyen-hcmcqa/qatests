package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.PageGenerator;

import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeMethod
    public void setup() {
        try {
            Properties properties = new Properties();
            properties.load(BasePage.class.getClassLoader()
                    .getResourceAsStream("application.properties"));
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
        } catch (Exception ex) {
        }

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 15);

        driver.manage().window().maximize();

        page = new PageGenerator(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
