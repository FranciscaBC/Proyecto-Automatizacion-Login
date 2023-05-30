package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercadoLibreSuperMercado {

    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), 'Cereales y Barras')]")
    public WebElement btnCerealesYBarras;
    @FindBy(xpath = "//h2[contains(text(), 'Cereal Corn Flakes')]")
    public WebElement locatorCornFlakes;
    @FindBy(xpath = "//button[@class='onboarding-cp-button andes-button andes-button--transparent andes-button--small']")
    public WebElement btnMasTarde;
    @FindBy(xpath = "//button[@class='andes-button andes-spinner__icon-base andes-button--loud']")
    public WebElement btnAgregarAlCarro;
    @FindBy(xpath = "//span[contains(text(), 'Crear cuenta')]")
    public WebElement locatorBtnCrearCuenta;

    public void goToCereales() {
        btnCerealesYBarras.click();
        btnMasTarde.click();
    }

    public void addCornFlakes() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", locatorCornFlakes);
        js.executeScript("arguments[0].click();", locatorCornFlakes);
        btnAgregarAlCarro.click();
    }

    public String checkText() {
        return locatorBtnCrearCuenta.getText();
    }

    public MercadoLibreSuperMercado(WebDriver driver, WebDriverWait wait) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
