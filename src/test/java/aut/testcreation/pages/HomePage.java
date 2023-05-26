package aut.testcreation.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPagina() {
        driver.get("https://open.spotify.com/");
        driver.manage().window().maximize();

    }


}