package View;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents the full view of the MVC pattern of your car simulator.
 * It initializes with being center on the screen and attaching it's controller in it's state.
 * It communicates with the Controller by calling methods of it when an action fires of in
 * each of it's components.
 * TODO: Write more actionListeners and wire the rest of the buttons
 **/

public class CarView extends JFrame{
    private static final int X = 800;
    private static final int Y = 800;

    // The controller member
    CarController carC;

    DrawPanel drawPanel;

    SpeedPanel speedPanel;

    JPanel controlPanel = new JPanel();





    // Constructor
    public CarView(String framename, DrawPanel drawPanel, SpeedPanel speedPanel){
        this.drawPanel = drawPanel;
        this.speedPanel = speedPanel;


        initComponents(framename);
    }
    JPanel carPanel = new JPanel();
    JPanel carGrid = new JPanel();
    JPanel gasPanel = new JPanel();
    JSpinner gasSpinner = new JSpinner();
    int gasAmount = 0;
    JLabel gasLabel = new JLabel("      Amount of gas");

    public JButton gasButton = new JButton("Gas");
    public JButton brakeButton = new JButton("Brake");
    public JButton turboOnButton = new JButton("Saab Turbo on");
    public JButton turboOffButton = new JButton("Saab Turbo off");
    public JButton liftBedButton = new JButton("Scania Lift Bed");
    public JButton lowerBedButton = new JButton("Lower Lift Bed");
    public JButton addSaab = new JButton("Add new Saab");
    public JButton addVolvo240 = new JButton("Add new Volvo");
    public JButton addScania = new JButton("Add new Scania");
    public JButton removeFirst = new JButton("Remove first car");
    public JButton removeLast = new JButton("Remove last car");
    public JButton removeAll = new JButton("Remove all cars");
    public JButton startButton = new JButton("Start all cars");
    public JButton stopButton = new JButton("Stop all cars");


    // Sets everything in place and fits everything
    // TODO: Take a good look and make sure you understand how these methods and components work
    private void initComponents(String title) {

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X + 150,Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        carPanel.setLayout(new FlowLayout());
        carPanel.setPreferredSize(new Dimension(150,560));
        carGrid.setLayout(new GridLayout(6,1));
        carGrid.setPreferredSize(new Dimension(150,300));
        Dimension dimen = new Dimension(150,100);
        addSaab.setPreferredSize(dimen);addVolvo240.setPreferredSize(dimen);
        addScania.setPreferredSize(dimen); removeFirst.setPreferredSize(dimen);
        removeLast.setPreferredSize(dimen); removeAll.setPreferredSize(dimen);
        carGrid.add(addSaab); carGrid.add(addVolvo240); carGrid.add(addScania);
        carGrid.add(removeFirst); carGrid.add(removeLast); carGrid.add(removeAll);


        carPanel.add(speedPanel);
        carPanel.add(carGrid);
        this.add(carPanel);

        this.add(drawPanel);




        SpinnerModel spinnerModel =
                new SpinnerNumberModel(0, //initial value
                        0, //min
                        100, //max
                        1);//step
        gasSpinner = new JSpinner(spinnerModel);
        gasSpinner.setPreferredSize(new Dimension(150,30));



        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        gasPanel.add(gasSpinner, BorderLayout.PAGE_END);
        //gasPanel.setPreferredSize(new Dimension(150,260));

        this.add(gasPanel);






        controlPanel.setLayout(new GridLayout(2,3));

        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);
        controlPanel.add(lowerBedButton, 5);
        controlPanel.setPreferredSize(new Dimension((X/2)+4, 200));
        this.add(controlPanel);
        controlPanel.setBackground(Color.CYAN);


        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(new Dimension(X/5-15,200));
        this.add(startButton);


        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(new Dimension(X/5-15,200));
        this.add(stopButton);

        // This actionListener is for the gas button only
        // TODO: Create more for each component as necessary
        // TURBO OFF



        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}