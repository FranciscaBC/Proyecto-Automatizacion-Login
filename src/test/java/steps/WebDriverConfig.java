package steps;

import io.github.bonigarcia.wdm.WebDriverManager; //clase que se usa para configurar los controles de los navegadores web en tiempo de ejecución
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegisterPage;
import pages.SuccessPage;
import java.time.Duration;

public class WebDriverConfig {
    private WebDriver driver; //interactua con el navegador
    private WebDriverWait wait; //espera que ocurran ciertas condiciones en el navegador
    private HomePage homePage;
    private RegisterPage registerPage;
    private SuccessPage successPage;

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    public SuccessPage getSuccessPage() {
        return successPage;
    }

    public void setupWebDriver() { //Configuracion del navegador web
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Configura una espera implícita de 5 segundos
        homePage = new HomePage(driver, wait);
        registerPage = new RegisterPage(driver, wait);
        successPage = new SuccessPage(driver, wait);
    }

    public void closeWebDriver() {
        if (driver != null) {
            //driver.quit();
        }
    }
}