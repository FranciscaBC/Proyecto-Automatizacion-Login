package pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessPage {
    boolean seEncuentra;
    private WebDriver driver;

    @FindBy(xpath = "//span[contains(text(),'Mi cuentaafas')]")
    public WebElement txtMyAccount;
    @FindBy(xpath = "//a[@title = 'Mi cuentaczsczc']//parent::div")
    public  WebElement divCuenta;

    String txt;

    public String successTxt() {
        try {
            txt = txtMyAccount.getText();
        }catch (Exception e){
            Assert.fail("No se encontro el elemento que se estaba buscando: " + e);}
        return txt;
    }


    public SuccessPage(WebDriver driver, WebDriverWait wait) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean validaIngreso() {
         seEncuentra = false;
        try{
            if(txtMyAccount.isDisplayed()){
                return seEncuentra = true;
            }
        }catch(Exception e){
            if(divCuenta.isDisplayed()){
                return seEncuentra = true;
            }else{
                Assert.fail("No se encontro el elemento que se estaba buscando: " );
            }
        }
        return seEncuentra;
    }

}