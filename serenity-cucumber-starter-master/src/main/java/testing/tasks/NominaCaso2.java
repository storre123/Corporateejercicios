package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import testing.ui.CarguePage;

import java.nio.file.Path;

public class NominaCaso2 implements Task {

    private final String rutaArchivo;

    public NominaCaso2(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                // Paso 1: Ingresar al menú
                Click.on(CarguePage.BUTTON_MENU),

                // Paso 2: Seleccionar servicio de archivos
                Click.on(CarguePage.BUTTON_SERVICIO_ARCHIVOS),

                // Paso 3: Administrar cargas
                Click.on(CarguePage.BUTTON_ADMINISTRAR_CARGAS),

                // Paso 4: Iniciar carga
                Click.on(CarguePage.BUTTON_INICIO_CARGA),

                // Paso 5: Seleccionar tipo de ambiente
                Click.on(CarguePage.TIPO_AMBIENTE),

                // Paso 6: Seleccionar ambiente de producción
                Click.on(CarguePage.SELECT_TIPO_AMBIENTE_QA),

                // Paso 7: Aceptar términos de confidencialidad
                Click.on(CarguePage.CHECK_CONFIDENCIALIDAD),

                // Paso 8: Cargar archivo desde ruta
                Upload.theFile(Path.of(rutaArchivo)).to(CarguePage.INPUT_FILE),

                // Paso 9: Clic en botón de cargar
                Click.on(CarguePage.BUTTON_CARGAR)
        );
    }
    public static NominaCaso2 conRuta(String rutaArchivo) {
        return new NominaCaso2(rutaArchivo);
    }
}
