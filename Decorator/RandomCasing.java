import java.util.Random;
import java.util.random.*;
/**
 * @author npelino
 * Class for random casing in passwords
 */
public class RandomCasing extends PasswordDecorator {

    /**
     * Constructor
     * @param Password
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password
     */
    public String getPassword() {
        String upgrade = super.passwordBeginning.getPassword();
        int x;
        char[] c = upgrade.toCharArray();
        Random rand = new Random();
        for (int i = 0; i < c.length; i++) {
            x = rand.nextInt(2);
            if((x == 1) && (c[i] >= 97) && (c[i] <= 122)) {
                c[i] = Character.toUpperCase(c[i]);
            }
        }
        String retNew = new String(c);
        return retNew;
    }
}
