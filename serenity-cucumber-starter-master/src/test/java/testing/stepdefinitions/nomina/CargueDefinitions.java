package testing.stepdefinitions.nomina;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.SuccessCargue;
import testing.tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CargueDefinitions {

    private static final String PAGE_URL = "pages.url";

    @Given("{string} ingresa a corporate con sus credenciales {string}, {string}, {string}")
    public void ingresaACorporateConSusCredenciales(String actor,String codcompania, String idusua, String contrasena) {

        OnStage.theActorCalled(actor);
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        OnStage.withCurrentActor(Login.conCredenciales(codcompania, idusua , contrasena));

    }
    //--------------------  Nomina  --------------------
    @When("el usuario genera el cargue del archivo de Nomina por la opcion produccion de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeNominaPorLaOpcionProduccionDeFormaExitosa( String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NominaCaso1.conRuta(rutaArchivo)
        );
    }
    @When("el usuario genera el cargue del archivo de Nomina por la opcion pruebas de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeNominaPorLaOpcionPruebasDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NominaCaso2.conRuta(rutaArchivo)
        );
    }

    @When("el usuario genera el cargue del archivo de Nomina por la opcion Produccion sin check de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeNominaPorLaOpcionProduccionSinCheckDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NominaCaso3.conRuta(rutaArchivo)
        );
    }

    @When("el usuario genera el cargue del archivo de Nomina por la opcion Pruebas sin check de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeNominaPorLaOpcionPruebasSinCheckDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NominaCaso4.conRuta(rutaArchivo)
        );

    }

    //--------------------  Proveedores  --------------------


    @When("el Usuario genera el cargue del archivo de Proveedores por la opcion produccion de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeProveedoresPorLaOpcionProduccionDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ProveedoresCaso1.conRuta(rutaArchivo)
        );
    }

    @When("el Usuario genera el cargue del archivo de Proveedores por la opcion pruebas de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeProveedoresPorLaOpcionPruebasDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ProveedoresCaso2.conRuta(rutaArchivo)
        );
    }

    @When("el Usuario genera el cargue del archivo de Proveedores por la opcion Produccion sin check de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeProveedoresPorLaOpcionProduccionSinCheckDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ProveedoresCaso3.conRuta(rutaArchivo)
        );
    }

    @When("el Usuario genera el cargue del archivo de Proveedores por la opcion Pruebas sin check de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeProveedoresPorLaOpcionPruebasSinCheckDeFormaExitosa(String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ProveedoresCaso4.conRuta(rutaArchivo)
        );
    }
    //--------------------  Otros Terceros  --------------------
    //--------------------  Giros  --------------------
    //--------------------  Desinversiones csv  --------------------
    //--------------------  Desinversiones standar  --------------------
    //--------------------  Libranza csv  --------------------
    //--------------------  Libranza standar  --------------------
    //--------------------  Pila  --------------------
    //--------------------  Validacion Beneficiarios  --------------------
    //--------------------  Adenda  --------------------


    @Then("El sistema muestra mensaje de cargue exitoso")
    public void el_sistema_muestra_mensaje_de_cargue_exitoso() {
        theActorInTheSpotlight().should(seeThat(SuccessCargue.cargueExitoso()));
    }



}
