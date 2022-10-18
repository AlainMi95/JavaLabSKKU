package midterm;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static Main MAIN;

    private JFrame tripPlannerFrame;
    private JPanel mainPanel;

    private JButton trainButton;
    private JButton busButton;
    private JButton taxiButton;

    private JButton yesButton;
    private JButton noButton;

    private JButton cancelButton;
    private JButton clearButton;
    private JButton enterButton;

    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton zeroButton;

    private JLabel tripPlanerLabel;

    private JTextArea tripPlanerTextArea;

    public static void main(String[] args) {
        MAIN = new Main();

        MAIN.generateNewButtonsWithIcon();
        MAIN.createTripPlanerFrame();
        MAIN.addTripPlannerLogo();
    }

    private void addLayouts() {


    }
    private void addTripPlannerLogo() {
        JLabel topLogoLabel = new JLabel(new ImageIcon("assets/planner_logo.png"));
        mainPanel.add(topLogoLabel);
        mainPanel.repaint();
    }

    private void createTripPlanerFrame() {
        tripPlannerFrame = new JFrame();
        mainPanel = new JPanel();
        tripPlannerFrame.setSize(500, 600);
        tripPlannerFrame.add(mainPanel);
        tripPlannerFrame.setVisible(true);
    }

    private void generateNewButtonsWithIcon() {
        trainButton = new JButton(new ImageIcon("assets/train.png"));
        busButton = new JButton(new ImageIcon("assets/bus.png"));
        taxiButton = new JButton(new ImageIcon("assets/taxi.png"));

        yesButton = new JButton("yes");
        noButton = new JButton("no");

        cancelButton = new JButton(new ImageIcon("assets/cancel.png"));
        clearButton = new JButton(new ImageIcon("assets/clear.png"));
        enterButton = new JButton(new ImageIcon("assets/enter.png"));

        oneButton = new JButton(new ImageIcon("assets/1.png"));
        twoButton = new JButton(new ImageIcon("assets/2.png"));
        threeButton = new JButton(new ImageIcon("assets/3.png"));
        fourButton = new JButton(new ImageIcon("assets/4.png"));
        fiveButton = new JButton(new ImageIcon("assets/5png"));
        sixButton = new JButton(new ImageIcon("assets/6.png"));
        sevenButton = new JButton(new ImageIcon("assets/7.png"));
        eightButton = new JButton(new ImageIcon("assets/8.png"));
        nineButton = new JButton(new ImageIcon("assets/9.png"));
        zeroButton = new JButton(new ImageIcon("assets/0.png"));
    }
}
