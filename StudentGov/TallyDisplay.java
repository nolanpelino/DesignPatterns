import java.util.HashMap;

/**
 * @author npelino
 * Observer implemented class to update votes and give tallys
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();


    /**
     * Constructor for the class
     * initializes private poll
     * @param a subject containing the poll as a whole
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the votes for the private hashmap
     * @param Hashmap containing the candidate and their votes 
     */
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();
    }

    /** 
     * Displays the hashmap with the candidate and their no.
     * of votes
     */
    private void display() {
        System.out.println("Current Tallies:");
        for (HashMap.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}
