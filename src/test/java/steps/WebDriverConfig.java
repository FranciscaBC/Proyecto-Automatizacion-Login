package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.RegisterPage;
import pages.SuccessPage;

import java.time.Duration;

public class WebDriverConfig {
    private WebDriver driver;
    private WebDriverWait wait;
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

    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Configura una espera implícita de 10 segundos
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