package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    private HomePage() { }

    public static final Target DASHBOARD_TEXT = Target.the("Mensaje de bienvenida")
            .located(By.id("banking-logo"));

}
