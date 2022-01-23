/**
 * @author npelino
 * Interface made to interact with observers
 */

public interface Subject {
   public void registerObserver(Observer observer);
   public void removeObserver(Observer observer);
   public void notifyObservers();
}
