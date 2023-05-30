package pages;

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

    public void goToPrincipalPage(){
        driver.get("https://www.mercadolibre.cl");
        btnAcceptCookies.click();
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
