import java.util.HashMap;

/**
 * @author npelino
 * Class implements observer to display the candidate and 
 * their votes
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private int numVotes = 0;

    /**
     * Constructor for the class
     * @param Takes in a subject ovject
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the votes for the private hashmap
     * @param Hashmap with the candidates
     */
    public void update(HashMap<String, Integer> votes) {
        numVotes = 0;
        for (HashMap.Entry<String, Integer> entry : votes.entrySet()) {
            numVotes = numVotes + entry.getValue();
        }
        this.votes = votes;
        display();
    }

     /** 
     * Displays the hashmap with the candidate and the 
     * percentage of votes they hold
     */
    private void display() {
        double perc;
        double dbNumVotes = numVotes;
        System.out.println("Current Percent of Votes:");
        for (HashMap.Entry<String, Integer> entry : votes.entrySet()) {
            perc = (entry.getValue() / dbNumVotes) * 100;
            System.out.println(entry.getKey() + ": " + (perc) + "%");
        }
        System.out.println();
    }
}
