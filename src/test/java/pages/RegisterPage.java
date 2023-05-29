package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement inputName;

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@id='reg_password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement btnRegister;


    public void completeForm(String userName, String email, String password){
        inputName.click();
        inputName.sendKeys(userName);
        inputEmail.click();
        inputEmail.sendKeys(email);
        inputPassword.click();
        inputPassword.sendKeys(password);
    }
    public void pressRegister(){
        btnRegister.click();
    }

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}