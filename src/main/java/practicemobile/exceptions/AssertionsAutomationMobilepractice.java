package practicemobile.exceptions;

public class AssertionsAutomationMobilepractice extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String TITLE_ELEMENT_NO_EXPECTED = "El titulo a verificar no es visible";
    public static final String ALERT_MESSAGE_NO_EXPECTED = "El mensaje de la alerta no es el esperado";

    public AssertionsAutomationMobilepractice(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertionsAutomationMobilepractice(String message) {
        super(message);
    }

}
