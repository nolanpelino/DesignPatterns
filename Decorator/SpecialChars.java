import java.util.Random;
/**
 * @author npelino
 * Class to include special characters in passwords
 */
public class SpecialChars extends PasswordDecorator {

    /**
     * Constructor
     * @param Password
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with special characters inserted
     */
    public String getPassword() {
        Random rand = new Random();
        char[] c = {'*', '!', '%', '+', '.', '{', '}'};
        StringBuilder upgrade = new StringBuilder(super.passwordBeginning.getPassword());
        for (int i = 0; i < upgrade.length(); i++) {
            if((rand.nextInt(11) + 1) >= 8) {
                upgrade.insert(i, c[rand.nextInt(7)]);
            } 
        }
        return upgrade.toString();
    }
}
