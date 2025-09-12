package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.NoSuchElementException;
import testing.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    private final String codCompania;
    private final String idUsua;
    private final String contrasena;

    public Login(String idUsua, String contrasena, String codCompania) {
        this.codCompania = codCompania;
        this.idUsua = idUsua;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.codCompania).into(LoginPage.CODCOMPANIA),
                Enter.theValue(this.idUsua).into(LoginPage.IDUSUA),
                Enter.theValue(this.contrasena).into(LoginPage.CONTRASENA),
                Click.on(LoginPage.IDIOMA),
                Click.on(LoginPage.OPCION_IDIOMA),
                Click.on(LoginPage.SUBMIT_BUTTON),
                Task.where("{conditional click on accept button}", a -> {
                    try {
                        if (LoginPage.ACCEPT_BUTTON.resolveFor(a).isVisible()) {
                            a.attemptsTo(Click.on(LoginPage.ACCEPT_BUTTON));
                        }
                    } catch (NoSuchElementException e) {
                        // El botón no está presente, continuar sin hacer clic
                    }
                })

        );

    }

    public static Login conCredenciales(String codcompania, String idusua, String contrasena) {
        return instrumented(Login.class, idusua, contrasena, codcompania);
    }
}


