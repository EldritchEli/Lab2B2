import java.util.ArrayList;

public class Application {

    CarView frame;
    // A list of cars, modify if needed
    CarGroup carGroup = new CarGroup();
    ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();
        Volvo240 volvo240 = new Volvo240();
        Saab95 saab95 = new Saab95();
        Scania scania = new Scania();

        saab95.setY(100);
        scania.setY(200);

        cc.carGroup.add(volvo240);
        cc.carGroup.add(saab95);
        cc.carGroup.add(scania);

        // Start a new view and send a reference of self
        }
    }
}
