/**
 * @author npelino
 */
public class LuxuryCar extends Car {

    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    public void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }

    protected void addAccesories() {
        super.accessory.add(Accessories.FLOOR_MATTS);
        super.accessory.add(Accessories.PHONE_CHARGER);
        super.accessory.add(Accessories.BACK_UP_CAMERA);
        super.accessory.add(Accessories.EXTRA_CUP_HOLDERS);
        super.accessory.add(Accessories.HEATED_SEATS);
        super.accessory.add(Accessories.SPORTS_SEATS);
        super.accessory.add(Accessories.WINDOW_TINT);
        super.accessory.add(Accessories.HIGH_END_SOUND);
        super.accessory.add(Accessories.TRUNK_ORGANIZER);
        super.accessory.add(Accessories.BLUE_TOOTH);
    }
}
