package View;



import Model.CarClasses.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CarAdapter implements TextureAdapter{




    public CarAdapter() {}

    public BufferedImage getTexture(Car car) {



        BufferedImage texture = null;
        String filePath;


        if (car instanceof Saab95) {
            filePath = "pics/Saab95.jpg";
        }

        else if (car instanceof Scania) {
            filePath = "pics/Scania.jpg";
        }

        else if (car instanceof Volvo240) {
            filePath = "pics/Volvo240.jpg";
        }
        else {
            filePath = "pics/ImageMissing.jpg";}


            try {
                texture = ImageIO.read(DrawPanel.class.getResourceAsStream(filePath));
            } catch (IOException ex) {
                texture = null;
                ex.printStackTrace();
            }
        // System.out.println(filePath);
        return texture;}}
