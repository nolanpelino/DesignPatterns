import java.util.Random;
import java.util.random.*;
/**
 * @author npelino
 * Easy password extends Password and its methods.
 */
public class EasyPassword extends Password {
    
    /**
     * Constructor for the class
     * @param String
     */
    public EasyPassword(String phrase) {
        this.password = phrase;
    }

    /**
     * Returns the password
     */
    public String getPassword(){
        Random rand = new Random();
        String upgrade = this.password;
        upgrade = upgrade.replaceAll("\\s", "");
        return upgrade + rand.nextInt(100);
    }
}
