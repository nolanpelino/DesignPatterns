import java.util.*;
import java.lang.*;
/**
 * 
 * @author npelino
 * Car Class
 */
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessory = new ArrayList<Accessories>();

    /**
     * Car constructor
     * @param String
     * @param String
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Creates Car by calling protected methods
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccesories();
        displayAccesories();
    }

    protected abstract void addFrame();

    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    protected abstract void addAccesories();

    /**
     * Displays total accessories
     */
    protected void displayAccesories() {
        System.out.println(accessory.size());
        System.out.println("Accessories:");
        for (int i = 0; i < accessory.size(); i++) {
           System.out.println("- " + accessory.get(i)); 
        }
    }
}
