package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    public WebElement inputNickname;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(name = "login")
    public WebElement btnLogin;

    public void completeLogin(String userName, String password) {
        inputNickname.click();
        inputNickname.sendKeys(userName);
        inputPassword.click();
        inputPassword.sendKeys(password);
    }

    public void pressLogin() {
        btnLogin.click();
    }

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}