import java.util.HashMap;
/**
 * @author npelino
 * Main interface that contains the update method
 */

public interface Observer {
    public void update(HashMap<String, Integer> votes);
}
