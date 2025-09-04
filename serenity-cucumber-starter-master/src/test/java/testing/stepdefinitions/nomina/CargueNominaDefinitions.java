package testing.stepdefinitions.nomina;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.SuccessCargue;
import testing.tasks.Login;
import testing.tasks.NominaCaso1;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CargueNominaDefinitions
    {
        private static final String PAGE_URL = "pages.url";
    @Given("{string} ingresa a corporate con sus credenciales {string}, {string}, {string}")
    public void ingresaACorporateConSusCredenciales(String actor,String codcompania, String idusua, String contrasena) {

        OnStage.theActorCalled(actor);
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.conCredenciales( "CB00000015", "epinzo109", "BOGOTA$UAT20250*"));

    }
    @When("el usuario genera el cargue del archivo de Nomina de forma exitosa {string}")
    public void elUsuarioGeneraElCargueDelArchivoDeNominaDeFormaExitosa( String rutaArchivo) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NominaCaso1.conRuta(rutaArchivo)
        );

    }
    @Then("El sistema muestra mensaje de cargue exitoso")
    public void el_sistema_muestra_mensaje_de_cargue_exitoso() {
        theActorInTheSpotlight().should(seeThat(SuccessCargue.cargueNominaExitoso()));
    }
}
