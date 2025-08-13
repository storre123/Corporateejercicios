package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import testing.ui.HomePage;

public class SuccessLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(HomePage.DASHBOARD_TEXT).isDisplayed()
                //Ensure.that(HomePage.DASHBOARD_TEXT).text().contains("Dashboard")
        );
        return true;
    }

    public static SuccessLogin loginExitoso() {
        return new SuccessLogin();
    }
}
