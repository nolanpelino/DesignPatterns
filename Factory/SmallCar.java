/**
 * @author npelino
 * Small car is a class that extends the type, Car
 */
public class SmallCar extends Car {
    public SmallCar(String make, String model) {
        super(make, model);
    }

    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    protected void addAccesories() {
        super.accessory.add(Accessories.FLOOR_MATTS);
        super.accessory.add(Accessories.PHONE_CHARGER);
    }
}
