import java.awt.image.BufferedImage;
import java.sql.Array;
import java.util.*;

public class CarAdapter implements Observer{

    CarGroup carGroup;
    List<Triple> tripleList;

    public CarAdapter(){
        this.tripleList = new ArrayList<>();
        carGroup = new CarGroup();
    }

    @Override
    public void updateObserver() {
        List<Triple> newTriples}

    public void add(double x, double y, BufferedImage texture) {
        tripleList.add(new Triple(x,y,texture));
    }
    public void set(int index, double x, double y) {
        tripleList.get(index).setPosition(x,y);
    }

    public double getX(int index) {
        return tripleList.get(index).getX();
    }

    public double getY(int index) {
        return tripleList.get(index).getY();
    }

    public BufferedImage getTexture(int index) {
        return tripleList.get(index).getTexture();
    }

    public List<Triple> getTripleList() {
        return tripleList;
    }
    public Triple get(int index){
        return tripleList.get(index);
    }
}
