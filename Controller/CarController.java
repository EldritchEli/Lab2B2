package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;

/*
* This class represents the Controller part in the MVC pattern.
* Its responsibilities are to listen to the View and responds in an appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController{
    // member fields:
    // The frame that represents this instance View of the MVC pattern
    // A list of cars, modify if needed
    CarGroup carGroup;
    CarView carView;

    public CarController(CarGroup carGroup, CarView carView) {
        this.carGroup = carGroup;
        this.carView = carView;
        carView.gasSpinner.addChangeListener(e -> carGroup.setGasAmount((int)((JSpinner)e.getSource()).getValue()));
        carView.startButton.addActionListener(e -> carGroup.startEngine());
        carView.stopButton.addActionListener(e -> carGroup.stopEngine());
        carView.brakeButton.addActionListener(e -> carGroup.brake());
        carView.gasButton.addActionListener(e -> carGroup.gas());
        carView.turboOnButton.addActionListener(e -> carGroup.turboOn());
        carView.turboOffButton.addActionListener(e -> carGroup.turboOff());
        carView.liftBedButton.addActionListener(e -> carGroup.liftBed());
        carView.lowerBedButton.addActionListener(e -> carGroup.lowerBed());
        carView.addSaab.addActionListener(e -> carGroup.add("Saab95"));
        carView.addScania.addActionListener(e -> carGroup.add("Scania"));
        carView.addVolvo240.addActionListener(e -> carGroup.add("Volvo240"));
        carView.removeFirst.addActionListener(e -> carGroup.removeFirst());
        carView.removeLast.addActionListener(e -> carGroup.removeLast());
        carView.removeAll.addActionListener(e -> carGroup.removeAll());
    }

    void brake() {
        carGroup.brake();
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
