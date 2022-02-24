import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SpeedPanel extends JPanel implements Observer{

    CarGroup carGroup;
    List<Car> cars;
    JEditorPane jPane;

    public SpeedPanel(CarGroup carGroup) {
        this.carGroup = carGroup;
        this.cars = carGroup.getCars();
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(150,200));
        this.jPane = new JEditorPane("Car", "helooooo\n wee ");
        jPane.setPreferredSize(new Dimension(150,165));
        this.add(new JLabel("CarSpeed"));

        this.add(jPane);

    }



    public void updateCarSpeed() {

        StringBuilder sBuilder = new StringBuilder();
        for (Car car: cars
             ) {sBuilder.append(""+ car.getModelName() + ": " + (double)Math.round(car.getCurrentSpeed()*100)/100 +"\n");}
        jPane.setText(sBuilder.toString());
    }

    @Override
    public void updateObserver() {
        updateCarSpeed();


    }
}
