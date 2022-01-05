package practicemobile.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static practicemobile.userinterfaces.AuthenticationUserInterfaces.ALERT_MESSAGE_ERROR;
import static practicemobile.util.Constants.TIME;

public class TheAlert implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(ALERT_MESSAGE_ERROR, isVisible()).forNoMoreThan(TIME).seconds());
        return Text.of(ALERT_MESSAGE_ERROR).viewedBy(actor).asString();
    }

    public static TheAlert message() {
        return  new TheAlert();
    }
}
