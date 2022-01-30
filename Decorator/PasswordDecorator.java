/**
 * @author npelino
 */

public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * @param Password
     * Class constructor
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    public abstract String getPassword();
}
