package View;


import Model.CarClasses.Car;
import Model.CarGroup;
import Model.Observer;

import java.awt.*;
import javax.swing.*;

// This panel represents the animated part of the view with the car images.

public class DrawPanel extends JPanel implements Observer {

    private CarGroup carGroup;

    private TextureAdapter adapter = new CarAdapter();

    JPanel carSpeedPanel = new JPanel();
    JLabel speed = new JLabel("speed");



    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, CarGroup carGroup) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.magenta);
        this.carGroup = carGroup;

    }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Car car:
             carGroup.getCars()) {
            g.drawImage(adapter.getTexture(car), (int)car.getX(), (int)car.getY(), null); // see javadoc for more info on the parameters
        }
    }

    public void updateObserver() {
        repaint();
    }
}
