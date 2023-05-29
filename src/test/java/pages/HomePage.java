package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    private WebDriver driver;

    //p[contains(text(),'CREAR CUENTA')]
    @FindBy(xpath = "//a[@data-open='#login-form-popup']")
    public WebElement btnAccess;

    public void navigateToPage(){
        driver.get("https://paraisokawaii.cl");
                driver.manage().window().maximize();
    }
    public void pressRegister() {
        btnAccess.click();
    }

    public HomePage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}