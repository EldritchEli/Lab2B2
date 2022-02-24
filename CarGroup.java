import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class CarGroup implements Subject{

    private CarFactory carFactory = new CarFactory();
        public List<Observer> observers;

        public double gasAmount;

        private TimerListener timerListener;

        public CarGroup() {
            observers = new ArrayList<>();
            timerListener = new TimerListener();
            timer.start();
        }
        private final int delay = 50;
        Timer timer = new Timer(delay, new TimerListener());

        CarController cc;

        ArrayList<Car> cars = new ArrayList<>();

        void add (Car car) {
            cars.add(car);
        }

        void brake() {
            double brake = 0.2;
            for (Car car : cars
            ) {
                car.brake(brake);
            }
        }

        void gas() {
            double gas = gasAmount / 100;
            for (Car car : cars
            ) {
                car.gas(gas);
            }
        }
        void startEngine(){
            for (Car car : cars
            ) {
                car.startEngine();
            }
            System.out.println("hello");
        }

        void turboOn() {
            for (Car car : cars
            ) {

                if (car instanceof HasTurbo t) {t.setTurboOn();
                    System.out.println("Turbo on");
                }}

        }

        void turboOff() {
            for (Car car : cars) {if (car instanceof HasTurbo t){
                t.setTurboOff();
                System.out.println("turbo off");}}}

        void liftBed() {
            for (Car car : cars) {
                if (car instanceof HasFlatbed f) {
                    f.incrementFlatbed();
                    System.out.println("lifting");}}}


        void lowerBed() {
            for (Car car : cars) {
                if(car instanceof HasFlatbed f) {f.decrementFlatbed();

                    System.out.println("lowering");}}}

        void stopEngine() {
            for (Car car : cars) {
                car.stopEngine();
                System.out.println("All engines stopped!");}}


    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : cars) {
                car.move();
                int x = (int) Math.round(car.getX());
                int y = (int) Math.round(car.getY());
                // repaint() calls the paintComponent method of the panel
                if (car.getX() > 700) {
                    car.stopEngine();
                    car.setAngle(180);
                    car.startEngine();
                }
                else if (car.getX() < 0) {
                    car.stopEngine();
                    car.setAngle(0);
                    car.startEngine();
                }
            }
            notifyObserver();
        }
    }



        public ArrayList<Car> getCars() {return cars;}

        public double getGasAmount() {return gasAmount;}

        public void setGasAmount(double gasAmount) {this.gasAmount = gasAmount;}

    public void addObserver(Observer observer) {
        observers.add(observer);}

    public void removeObserver(Observer observer){
        observers.remove(observer);
        }



    public void notifyObserver(){

            for (Observer observer : observers){
                observer.updateObserver();
            }

    }

    public TimerListener getTimerListener() {
        return timerListener;
    }
}




