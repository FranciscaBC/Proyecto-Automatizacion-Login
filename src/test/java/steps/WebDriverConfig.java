package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class WebDriverConfig {
    private WebDriver driver;
    private WebDriverWait wait;
    private HomePage homePage;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private SuccessPage successPage;
    private MercadoLibreHomePage mercadoLibreHomePage;
    private MercadoLibreSearchPage mercadoLibreSearchPage;

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
    public SuccessPage getSuccessPage(){return successPage;}

    public MercadoLibreHomePage getMercadoLibreHomePage() {
        return mercadoLibreHomePage;
    }
    public MercadoLibreSearchPage getMercadoLibreSearchPage() {
        return mercadoLibreSearchPage;
    }

    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Configura una espera implícita de 10 segundos
        driver.manage().window().maximize();
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        loginPage = new LoginPage(driver,wait);
        successPage = new SuccessPage(driver, wait);
        mercadoLibreHomePage = new MercadoLibreHomePage(driver, wait);
        mercadoLibreSearchPage = new MercadoLibreSearchPage(driver, wait);
    }

    public void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}