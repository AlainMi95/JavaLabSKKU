/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: October 26 2022
 * Version: 1.0
 */
package midterm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The main purpose of the application is to plan the transportation methods for your trip and
 * calculate the trip's overall cost.
 * This class runs the whole application.
 * its sets the GUI elemts and listens to different actions from buttons.
 */
public class TripPlanner extends JFrame{
    private JPanel mainPanel;
    private JPanel logoPanel;
    private JPanel textAreaPanel;
    private JPanel numPadPanel;
    private JPanel transportPanel;
    private JPanel yesNoPanel;
    private JPanel textPanel;
    private JTextArea plannerTextArea;
    private JButton trainButton;
    private JButton busButton;
    private JButton taxiButton;
    private JButton yesButton;
    private JButton noButton;
    private JPanel numberPanel;
    private JPanel cancelPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton cancelButton;
    private JButton clearButton;
    private JButton enterButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JLabel logoLabel;

    private Train train;
    private PublicTransport publicTransport;
    private Station station;

    private String state;

    /**
     * Constructor of the TripPlanner.
     */
    public TripPlanner() {
        createUIComponents();
        runTripPlanner();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Trip Planner");
        setSize(550, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void runTripPlanner() {
        trainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText("You chosen TRAIN \n Enter base fare:");
                train = new Train();
                state = "train";
            }
        });
        busButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        taxiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText("Choose transport (from left menu):");
            }
        });
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                train.calculatePayment();
                plannerTextArea.setText("Transport 1: KORAIL \n Fare: "+
                        train.getTotalFare()+
                        "\n ================================\n"+
                        "Total Fare: "+train.getTotalFare());
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(state == "nStation") {
                    String[] parts = plannerTextArea.getText().split(":");

                    station.setnStations(Integer.parseInt(parts[1]));
                    plannerTextArea.setText("Add more transport (from the right)?");
                    state = "";
                }

                if(state == "station") {
                    String[] parts = plannerTextArea.getText().split(":");

                    station = new Station();
                    station.setFarePerStation(Double.parseDouble(parts[1]));
                    train.setStation(station);

                    plannerTextArea.setText("Enter number of stations:");
                    state = "nStation";
                }

                if(state == "train") {
                    String[] parts = plannerTextArea.getText().split(":");
                    train.setBaseFare(Double.parseDouble(parts[1]));

                    plannerTextArea.setText("Enter fare per station(for extra stations):");
                    state = "station";
                }

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plannerTextArea.setText(plannerTextArea.getText()+"0");
            }
        });
    }
}
