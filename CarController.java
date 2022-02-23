import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:
    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    CarGroup carGroup = new CarGroup(this);


    void brake(int amount) {
        carGroup.brake(amount);
    }
    // Calls the gas method for each car once
    void gas(int amount) {
        carGroup.gas(amount);
    }
    void startEngine(){
        carGroup.startEngine();
    }

    void turboOn() {
       carGroup.turboOn();
    }

    void turboOff() {
        carGroup.turboOff();
    }

    void liftBed() {
        for (Car car : cars) {
            if (car instanceof FlatbedCar) {
                ((FlatbedCar) car).incrementFlatbed();}}}

    void lowerBed() {
        for (Car car : cars) {
            if(car instanceof FlatbedCar) {
                ((FlatbedCar) car).decrementFlatbed();
            }}}

    void stopEngine() {
        carGroup.stopEngine();
    }
}
