/**
 * @author npelino
 */
public class SedanCar extends Car {

    public SedanCar(String make, String model) {
        super(make, model);
    }

    public void addFrame() {
        System.out.println("Adding a three part frame");
    }

    protected void addAccesories() {
        super.accessory.add(Accessories.FLOOR_MATTS);
        super.accessory.add(Accessories.PHONE_CHARGER);
        super.accessory.add(Accessories.BACK_UP_CAMERA);
        super.accessory.add(Accessories.EXTRA_CUP_HOLDERS);
        super.accessory.add(Accessories.HEATED_SEATS);
    }
}
