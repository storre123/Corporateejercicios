package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target CODCOMPANIA = Target.the("campo código de compañía")
            .located(By.xpath("//input[@placeholder='Ingresar código vigente']"));

    public static final Target IDUSUA = Target.the("campo ID de usuario")
            .located(By.xpath("//input[@placeholder='Ingresar ID registrado']"));

    public static final Target CONTRASENA = Target.the("campo contraseña")
            .located(By.xpath("//input[@placeholder='Ingresar Contraseña']"));

    public static final Target IDIOMA = Target.the("desplegable de idioma")
            .located(By.id("model_language_displayText"));

    public static final Target OPCION_IDIOMA = Target.the("opción de idioma Español")
            .located(By.id("model_language_option_es_co"));

    public static final Target SUBMIT_BUTTON = Target.the("botón ingresar")
            .located(By.id("btnLogin"));

    public static final Target ACCEPT_BUTTON = Target.the("botón Aceptar")
            .located(By.id("btnContinue"));

}
