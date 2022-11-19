/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: November 08 2022
 * Version: 1.0
 */
package lab_04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this SKKUApplicationForm extends a JFrame and is used for the visual and funtionalitis for the SKKU
 * Application Form.
 * USer can fill out the form and submit it.
 * The Application checks for correctness of the input.
 */
public class SKKUApplicationForm extends JFrame{
    private JPanel mainPanel;
    private JPanel imgPanel;
    private JPanel formPanel;
    private JPanel titlePanel;
    private JPanel txtFieldPanel;
    private JTextField nameTxtField;
    private JTextField bDateTxtField;
    private JTextField mailTxtField;
    private JTextField degreeTxtField;
    private JTextField uniTxtField;
    private JTextField gpaTxtField;
    private JLabel nameLabel;
    private JLabel bDateLabel;
    private JLabel mailLabel;
    private JLabel degreeLabel;
    private JLabel gpaLabel;
    private JLabel uniLabel;
    private JLabel statementLabel;
    private JTextArea statementTxtArea;
    private JLabel addressLabel;
    private JTextField addressTxtField;
    private JButton submitBtn;
    private JLabel sideImgLabel;
    private JLabel titleImgLabel;
    private JTextField phoneTxtField;
    private JTextField experienceTxtField;
    private JLabel phoneLabel;
    private JLabel experienceLabel;

    private String errorString ="";

    /**
     * Constructor for SKKU Application Form
     */
    public SKKUApplicationForm() {
        createUIComponents();
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameChecker();
                birthDateChecker();
                emailChecker();
                uniChecker();
                gpaChecker();
                statementChecker();
                phoneNumberChecker();

                if(nameChecker()&&
                birthDateChecker()&&
                emailChecker()&&
                uniChecker()&&
                gpaChecker()&&
                statementChecker()&&
                phoneNumberChecker()){
                    JOptionPane.showMessageDialog(new JFrame(),
                            "Successfully Submitted","Success Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }else {
                    System.out.println(errorString);
                    JOptionPane.showMessageDialog(new JFrame(),
                            errorString, "You have the following problems:",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("SKKU Application Form");
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private boolean nameChecker() {
        String nameRegex = "^[a-zA-Z\\s]+";
        String nameFromTxtField = nameTxtField.getText();
        if(!nameFromTxtField.matches(nameRegex)) {
            errorString = errorString + "You forgot to write your name or surname\n";
            return false;
        }
        return true;
    }

    private boolean birthDateChecker() {
        String birthDateRegex = "^\\d{4}/\\d{2}/\\d{2}$";
        String birthDateFromTxtField = bDateTxtField.getText();
        if(!birthDateFromTxtField.matches(birthDateRegex)) {
            errorString = errorString+"Birthdate must be in '06/06/1995' format\n";
            return false;
        }
        return true;
    }

    private boolean emailChecker() {
        String mailRegex = "^(.+)@(.+).(.+)$";
        String mailFromTxtField = mailTxtField.getText();
        System.out.println("befor; "+ errorString);

        if(!mailFromTxtField.matches(mailRegex)) {
            errorString = errorString+"Email must be in example@some.some\n";
            System.out.println("after; "+ errorString);
            return false;
        }

        return true;
    }

    private boolean uniChecker() {
        if(uniTxtField.getText() == "" ||uniTxtField.getText() == null) {
            errorString = errorString+"For graduate, you have to enter previous university and GPA\n";
            return false;
        }
        return true;
    }

    private boolean gpaChecker() {
        try {
            double gpa = Double.parseDouble(gpaTxtField.getText());

            if(gpa<0 || gpa>4.5) {
                errorString = errorString+"GPA must be between 0 and 4.5\n";
                return false;
            }
        }catch (NumberFormatException e) {
            errorString = errorString+"GPA must be between 0 and 4.5\n";
            return false;
        }
        return true;
    }

    private boolean statementChecker() {
        int wordCount = statementTxtArea.getText().split("\\s").length;
        if(wordCount<100) {
            errorString = errorString+"Your Personal Statement must be at least 100 words\n";
            return false;
        }
        return true;
    }

    private boolean phoneNumberChecker() {
        //Proper format for a phonenumber is ‘10 2158-0222’
        return true;
    }

}

