package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercadoLibreHomePage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@data-testid='action:understood-button']")
    public WebElement btnAcceptCookies;
    @FindBy(id = "cb1-edit")
    public WebElement inputBrowser;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnSearch;
    @FindBy(xpath = "//a[contains(text(), 'Supermercado')]")
    public WebElement btnSupermercado;
    @FindBy(xpath = "//h3[contains(text(), 'Despensa')]")
    public WebElement btnDespensa;


    public void goToPrincipalPage(){
        driver.get("https://www.mercadolibre.cl");
        btnAcceptCookies.click();
    }

    public void goToDespensaSupermercado(){
        btnSupermercado.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", btnDespensa);
        btnDespensa.click();
    }

    public void writeProduct(String producto){
        inputBrowser.click();
        inputBrowser.sendKeys(producto);
    }

    public void pressSearch(){
        btnSearch.click();
    }

    public MercadoLibreHomePage(WebDriver driver, WebDriverWait wait) {
        super();
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
