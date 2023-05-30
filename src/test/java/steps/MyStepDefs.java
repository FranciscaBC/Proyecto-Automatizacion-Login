package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    //Paraiso Kawaii
    @Given("He accedido a la pagina de paraisokawaii")
    public void heAccedidoALaPaginaDeParaisokawaii() {
        config.getHomePage().navigateToPage();
    }

    @And("Selecciono la opcion acceder")
    public void seleccionoLaOpcionAcceder() {
        config.getHomePage().pressRegister();
    }

    @When("Completo el formulario de registro")
    public void completoElFormularioDeRegistro() {
        config.getRegisterPage().completeForm(
                "latiamaskawaii",
                "latiakawaii123@gmail.com",
                "MiCONTRAsegura2023");
    }

    @And("Hago clic en boton Registrarse")
    public void hagoClicEnBotonRegistrarse() {
        //config.getRegisterPage().pressRegister();
    }

    @Then("El registro es realizado de forma exitosa")
    public void elRegistroEsRealizadoDeFormaExitosa() {
        assertEquals("Cuenta creada", "MI CUENTA", config.getSuccessPage().successTxt());
    }

    @When("Completo el formulario de ingreso")
    public void completoElFormularioDeIngreso() {
        config.getLoginPage().completeLogin(
                "maialamaskawaii",
                "MiPdjaviertem3");
    }

    @And("Hago clic en boton Acceder")
    public void hagoClicEnBotonAcceder() {
        config.getLoginPage().pressLogin();
    }

    @Then("Puedo ver la frase MI CUENTA en pantalla")
    public void puedoVerLaFraseMICUENTAEnPantalla() {
        assertEquals("Cuenta creada", "MI CUENTA", config.getSuccessPage().successTxt());
    }

    //MercadoLibre

    @Given("Estoy en la pagina principal de Mercadolibre")
    public void estoyEnLaPaginaPrincipalDeMercadolibre() {
        config.getMercadoLibreHomePage().goToPrincipalPage();
    }

    @When("Escribo el producto a buscar {string}")
    public void escriboElProductoABuscar(String arg0) {
        config.getMercadoLibreHomePage().writeProduct(arg0);
    }

    @And("Hago clic en el boton buscar")
    public void hagoClicEnElBotonBuscar() {
        config.getMercadoLibreHomePage().pressSearch();
    }

    @Then("Aparece un producto con ese nombre {string}")
    public void apareceUnProductoConEseNombre(String arg0) {
        config.getMercadoLibreSearchPage().noDarUbicacion();
        assertEquals("Producto encontrado con exito", arg0, config.getMercadoLibreSearchPage().findTxtResult());
    }
}