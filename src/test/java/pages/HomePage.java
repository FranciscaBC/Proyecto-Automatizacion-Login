package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPagina() {
        driver.get("https://www.example.com%22/");
    }

    public boolean seMuestraLogo() {
        WebElement logoElement = driver.findElement(By.id("logo"));
        return logoElement.isDisplayed();
    }

    // Otros métodos de interacción con la página de inicio
}