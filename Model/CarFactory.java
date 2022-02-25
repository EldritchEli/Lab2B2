package Model;

import Model.CarClasses.*;

public class CarFactory {

    public Car makeCar(int y, int x, String modelName ) {
        Car c;
        switch (modelName){
            case "Saab95" -> c = new Saab95();

            case "Volvo240" -> c = new Volvo240();

            case "Scania" -> c = new Scania();

            default -> c = null;

        }
        c.setY(y); c.setX(x);
        return c;}


}
