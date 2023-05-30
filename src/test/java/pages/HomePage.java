package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@data-open='#login-form-popup']")
    public WebElement btnAccess;

    public void navigateToPage() {
        driver.get("https://paraisokawaii.cl");
    }

    public void pressRegister() {
        btnAccess.click();
    }

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}