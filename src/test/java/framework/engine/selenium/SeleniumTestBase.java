package framework.engine.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class SeleniumTestBase {

    WebDriver driver;
    static Properties properties;


    @BeforeEach
    void webDriverSetup(){
        String browserName = properties.getProperty("browser");
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.inicializarDriver(browserName);
    }

    @AfterEach
    void close(){
        driver.quit();
    }

}