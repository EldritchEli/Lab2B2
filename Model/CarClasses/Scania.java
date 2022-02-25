package Model.CarClasses;

import java.awt.*;

public class Scania extends FlatbedCar{
    /**
     * Constructor for Model.CarClasses.Scania.
     */
    public Scania () {
        super(2,150, Color.magenta,"Scania",4,70,1);
    }

    /**
     * Calculates the speed factor of Model.CarClasses.Scania.
     * @return The unique speed factor of Model.CarClasses.Scania.
     */
    public double speedFactor(){
        return getEnginePower() * 0.01;
    }
}
