package practicemobile.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import net.serenitybdd.screenplay.waits.WaitUntil;
import practicemobile.models.TestData;
import static practicemobile.userinterfaces.AuthenticationUserInterfaces.*;
import static practicemobile.util.Constants.*;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TEXTFIELD_USER, isVisible()).forNoMoreThan(TIME).seconds());
           actor.attemptsTo(Enter.theValue(TestData.getData().get(USER).toString()).into(TEXTFIELD_USER));
           actor.attemptsTo(Enter.theValue(TestData.getData().get(PASS).toString()).into(TEXTFIELD_PASSWORD));
           actor.attemptsTo(Click.on(BUTTON_LOGIN));
    }

    public static Login inDemoApplicationSauceLabs() {

        return Tasks.instrumented(Login.class);
    }
}
