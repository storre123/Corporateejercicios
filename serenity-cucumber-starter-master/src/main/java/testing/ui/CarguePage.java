package testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarguePage {


    public static final Target BUTTON_MENU = Target.the("Boton para ingresara al menu de opciones")
            .located(By.id("navigation_more"));


    public static final Target BUTTON_SERVICIO_ARCHIVOS = Target.the("Boton servicio de archivos")
            .located(By.id("navigation_collapsed_0"));


    public static final Target BUTTON_ADMINISTRAR_CARGAS = Target.the("Boton Administrar Cargas")
            .located(By.id("navigation_fileServices_manageUploads"));//Administrar Cargas

    public static final Target BUTTON_INICIO_CARGA = Target.the("Boton para iniciar carga de archivo de nómina")
            .located(By.id("a_add_link_initiate"));


    public static final Target INPUT_FILE = Target.the("Campo para adjuntar archivo")
            .located(By.id("file"));

    public static final Target TIPO_AMBIENTE = Target.the("Opcion para seleccionar tipo de ambiente")
            .located(By.id("environmentType_displayText"));//*[@id=""]

    public static final Target SELECT_TIPO_AMBIENTE_PROD = Target.the("Opcion para seleccionar ambiente de produccion")
            .located(By.id("environmentType_option_production"));

    public static final Target SELECT_TIPO_AMBIENTE_QA = Target.the("Opcion para seleccionar ambiente de QA")
            .located(By.id("environmentType_option_test"));

    public static final Target CHECK_CONFIDENCIALIDAD = Target.the("CHECK para aceptar terminos de confidencialidad")
            .located(By.id("input-confidential-checkbox_checkinput-background"));//*[@id="input-confidential-checkbox_checkinput-background"]/svg

    public static final Target BUTTON_CARGAR = Target.the("Boton cargar de archivo de nómina")
            .located(By.id("btnInitiateUpload"));//*[@id="btnInitiateUpload"] //BOTON INICIAR CARGUE

    public static final Target DASHBOARD_EXITOSO = Target.the("Mensaje de CARGUE EXITOSO")
            .located(org.openqa.selenium.By.xpath("//span[normalize-space()='Acción Exitosa']"));

}
