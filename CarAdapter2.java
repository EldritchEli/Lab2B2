import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CarAdapter2 {

    private double x;
    private double y;
    private BufferedImage texture;

    public CarAdapter2(Car car) {
        this.x = car.getX();
        this.y = car.getY();
        try {
            texture = ImageIO.read(CarAdapter2.class.getResourceAsStream("pics/" + car.getModelName() +".jpg"));

        } catch (IOException ex)
        {
            texture = null;
            ex.printStackTrace();
        }
    }
    public CarAdapter2() {

    }

}
