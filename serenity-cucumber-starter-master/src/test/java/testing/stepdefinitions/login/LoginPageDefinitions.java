package testing.stepdefinitions.login;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.SuccessLogin;
import testing.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPageDefinitions {
    @When("Inicia sesión con las credenciales {string}, {string}, {string}")
    public void inicia_sesión_con_las_credenciales(String codcompania, String idusua, String contrasena) {
        OnStage.withCurrentActor(Login.conCredenciales(codcompania, idusua , contrasena));
    }
    @Then("Debe iniciar sesión correctamente")
    public void debeIniciarSesionCorrectamente() {
        theActorInTheSpotlight().should(seeThat(SuccessLogin.loginExitoso()));
    }
}
