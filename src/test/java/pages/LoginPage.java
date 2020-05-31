package pages;

import driver.WrappedWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement btmLogin;


    protected void setInputLogin(String login) {
        inputLogin.sendKeys(login);
    }

    protected void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    protected void setBtmLogin() {
        btmLogin.click();
    }

}
