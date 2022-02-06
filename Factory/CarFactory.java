/**
 * @author npelino
 * Class to set up car Objects
 */
public class CarFactory {

    public static Car createCar(String type, String make, String model) {
        
        if (type.equalsIgnoreCase(CarType.SMALL.toString())) {
            SmallCar smCar = new SmallCar(make, model);
            smCar.assemble();
            return smCar;
        } else if (type.equalsIgnoreCase(CarType.SEDAN.toString())) {
            SedanCar sdCar = new SedanCar(make, model);
            sdCar.assemble();
            return sdCar;
        } else if (type.equalsIgnoreCase(CarType.LUXURY.toString())) {
            LuxuryCar lxCar = new LuxuryCar(make, model);
            lxCar.assemble();
            return lxCar;
        } else {
            return null;
        }
    }
}
