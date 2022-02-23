import java.awt.image.BufferedImage;

public class Triple {
    private double x;
    private double y;
    private BufferedImage texture;
    public Triple(double x, double y, BufferedImage texture) {
        this.x = x;
        this.y = y;
        this.texture = texture;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
