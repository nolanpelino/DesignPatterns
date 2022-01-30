/**
 * @author npelino
 * Class to set up symbols
 */
public class Symbols extends PasswordDecorator {

    /**
     * Constructor
     * @param Password
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password
     */
    public String getPassword() {
        String upgrade = super.passwordBeginning.getPassword();
        upgrade = upgrade.replaceAll("a", "@");
        upgrade = upgrade.replaceAll("b", "8");
        upgrade = upgrade.replaceAll("e", "3");
        upgrade = upgrade.replaceAll("g", "9");
        upgrade = upgrade.replaceAll("i", "!");
        upgrade = upgrade.replaceAll("o", "0");
        upgrade = upgrade.replaceAll("s", "\\$");
        upgrade = upgrade.replaceAll("t", "7");
        return upgrade;
    }
}
