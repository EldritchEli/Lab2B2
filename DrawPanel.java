import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel implements Observer{

    CarGroup carGroup;
    List<Car> cars;



    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.magenta);
        this.cars = new ArrayList<Car>();
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Car car:
             cars) {


            g.drawImage(getTexture(car), (int)car.getX(), (int)car.getY(), null); // see javadoc for more info on the parameters
        }
    }
}
