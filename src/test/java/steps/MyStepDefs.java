package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;


public class MyStepDefs {
    private WebDriverConfig config;

    public MyStepDefs(WebDriverConfig config) {
        this.config = config;
    }

    @Before
    public void setUp() {
        config.setupWebDriver();
    }

    @After
    public void tearDown() {
        config.closeWebDriver();
    }

    @Given("^He accedido a la pagina de paraisokawaii$")
    public void acceder_a_solotodo() {
        config.getHomePage().navigateToPage();
    }

    @And("^Selecciono la opcion acceder$")
    public void ir_a_registro() {
        config.getHomePage().pressRegister();
    }

    @When("^Completo el formulario de registro$")
    public void completar_registro() {
        config.getRegisterPage().completeForm(
                "latiamaskawaii",
                "latiakawaii123@gmail.com",
                "MiCONTRAsegura2023");
    }

    @And("^Hago clic en boton Registrarse$")
    public void registrarse() {
        config.getRegisterPage().pressRegister();
    }

    @Then("^El registro es realizado de forma exitosa$")
    public void registro_exitoso() {
        assertEquals("Cuenta creada", "MI CUENTA", config.getSuccessPage().successTxt());
    }
}