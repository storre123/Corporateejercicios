package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.Question;
import testing.ui.CarguePage;

public class SuccessCargue implements Question<Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(CarguePage.DASHBOARD_EXITOSO).isDisplayed()
        );
        return true;
    }

    public static SuccessCargue cargueNominaExitoso() {
        return new SuccessCargue();
    }
}
