import java.util.*;

/**
 * @author npelino
 * A class to setup candidates and manage the 
 * presidential race using the subject interface
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates;

    /**
     * Class Constructor that sets schoolname 
     * @param String name of the school
     */
    public StudentGovPoll(String school) {
        this.school = school;
    }

    /**
     * Adds a new observer
     * @param Observer object 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes a specific observer
     * @param Observer object 
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Calls the update method on all current observers
     */
    public void notifyObservers() {
        for (Observer individual : observers){
          individual.update(this.votes);
      }
    }

    /**
     * Adds a candidate to the poll
     * @param String of the candidates name
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    /**
     * Adds a candidates votes tp the poll
     * @param String of the candidates name and their votes
     */
    public void enterVotes(String president, int num) {
        num = num + votes.get(president);
        votes.put(president, num);
        notifyObservers();
    }
    
    /**
     * 
     * @return String with the name of the school
     */
    public String getSchool() {
        return school;
    }



}
