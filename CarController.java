import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* Its responsibilities are to listen to the View and responds in an appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:
    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    CarGroup carGroup;

    public CarController(CarGroup carGroup) {
        this.carGroup = carGroup;
    }

    void brake(int amount) {
        carGroup.brake(amount);
    }
    // Calls the gas method for each car once
    void gas(int amount) {
        carGroup.gas();
    }

    void startEngine(){
        carGroup.startEngine();
    }

    void setGasAmount(int i) { carGroup.setGasAmount(i);}

    void turboOn() {
       carGroup.turboOn();
    }

    void turboOff() {
        carGroup.turboOff();
    }

    void liftBed() {carGroup.liftBed();}

    void lowerBed() {carGroup.lowerBed();}

    void stopEngine() {
        carGroup.stopEngine();
    }
}
