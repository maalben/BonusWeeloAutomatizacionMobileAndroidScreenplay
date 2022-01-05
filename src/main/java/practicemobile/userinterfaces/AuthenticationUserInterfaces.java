package practicemobile.userinterfaces;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AuthenticationUserInterfaces {

    public static final Target TEXTFIELD_USER = Target.the("Campo de texto de usuario")
            .located(MobileBy.AccessibilityId("test-Username"));

    public static final Target TEXTFIELD_PASSWORD = Target.the("Campo de texto de contraseña").located(MobileBy.AccessibilityId("test-Password"));

    public static final Target BUTTON_LOGIN = Target.the("Boton para hacer login").located(MobileBy.AccessibilityId("test-LOGIN"));

    public static final Target LABEL_PRODUCTS = Target.the("Etiqueta de titulo Productos").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView"));

    public static final Target ALERT_MESSAGE_ERROR = Target.the("Mensaje error en alerta").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView"));

}
