import java.util.ArrayList;

public class Application {



    public static void main(String[] args) {


        // A list of cars, modify if needed



        CarFactory carFactory = new CarFactory();
        CarGroup carGroup = new CarGroup();
        Volvo240 volvo240 = new Volvo240();

        Scania scania = new Scania();



        ArrayList<Car> cars = new ArrayList<>();
        DrawPanel drawPanel = new DrawPanel(800, 800 - 240, carGroup);
        SpeedPanel speedPanel = new SpeedPanel(carGroup);
        CarView frame = new CarView("Simulation", drawPanel, speedPanel);// Instance of this class
        CarController cc = new CarController(carGroup, frame);



        carGroup.addObserver(speedPanel);
        carGroup.addObserver(drawPanel);




        // Start a new view and send a reference of self
        }
    }

