package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Mi cuenta')]")
    public WebElement txtSuccess;

    public String successTxt(){return txtSuccess.getText();}

    public SuccessPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}