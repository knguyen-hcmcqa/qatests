package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "formHorizontalEmail")
    public WebElement username;

    @FindBy(how = How.ID, using = "formHorizontalPassword")
    public WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "col-login__btn")
    public WebElement loginButton;


    public void login (String pusername, String ppassword){
        writeText(username,pusername);
        writeText(password, ppassword);
        click(loginButton);
    }

}
