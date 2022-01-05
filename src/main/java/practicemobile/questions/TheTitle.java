package practicemobile.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.assertj.core.api.SoftAssertions;
import practicemobile.models.TestData;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static practicemobile.userinterfaces.AuthenticationUserInterfaces.LABEL_PRODUCTS;
import static practicemobile.util.Constants.EXPECTED;
import static practicemobile.util.Constants.TIME;

public class TheTitle implements Question<Boolean> {

    private final SoftAssertions validateSendValues = new SoftAssertions();

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag = false;

        actor.attemptsTo(WaitUntil.the(LABEL_PRODUCTS, isVisible()).forNoMoreThan(TIME).seconds());
        if (LABEL_PRODUCTS.resolveFor(actor).isVisible()) {
            flag = true;
            validateSendValues.assertThat(Text.of(LABEL_PRODUCTS).viewedBy(actor).asString())
                    .isEqualTo(TestData.getData().get(EXPECTED).toString());
            validateSendValues.assertAll();
        }
        return flag;
    }

    public static TheTitle is() {
        return new TheTitle();
    }
}
