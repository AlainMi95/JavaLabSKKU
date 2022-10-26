package midterm;

import javax.swing.*;

public class TripPlanner extends JFrame{
    private JPanel mainPanel;
    private JPanel logoPanel;
    private JPanel textAreaPanel;
    private JPanel numPadPanel;
    private JPanel transportPanel;
    private JPanel yesNoPanel;
    private JPanel textPanel;
    private JTextArea textArea1;
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

    public TripPlanner() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Trip Planner");
        setSize(550, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
