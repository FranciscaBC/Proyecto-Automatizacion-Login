package framework.engine.bdd;

import framework.engine.selenium.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.apachecommons.CommonsLog;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
        glue = {"src/test/java/aut/testcreation/steps"},
        features = {"src/test/java/aut/testcreation/features"})
@CommonsLog
public class CucumberBaseTestRunner {

    public static WebDriver driver;
    private static DriverFactory driverFactory;

    public static void setUp(){
        driverFactory = new DriverFactory();
        driver = driverFactory.createWebDriver();
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }
}