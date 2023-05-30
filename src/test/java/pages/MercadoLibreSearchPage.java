package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MercadoLibreSearchPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@class='onboarding-cp-button andes-button andes-button--transparent andes-button--small']")
    public WebElement btnMasTarde;
    @FindBy(xpath = "//h2[@class='ui-search-item__title shops__item-title']")
    public WebElement txtResult;
    public void noDarUbicacion(){
        btnMasTarde.click();
    }
    public String findTxtResult(){
        return txtResult.getText();
    }

    public MercadoLibreSearchPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
