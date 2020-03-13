package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends BaseTest {
    @Test(priority = 0)
    public void verifyNumOfApprovedRequests () throws InterruptedException {
        page.GetInstance(HomePage.class).goToHomePage();

        page.GetInstance(HomePage.class).
                goToLoginPage().login("admin@test.com", "test123");

        Thread.sleep(2000);

        int expectedNumOfApprovedRequests = 5;

        page.GetInstance(HomePage.class).verifyNumOfApprovedRequests(expectedNumOfApprovedRequests);
    }
}
