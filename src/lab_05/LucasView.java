/**
 * Author: Alain Michienzi (github: https://github.com/AlainMi95)
 * Date: November 19 2022
 * Version: 1.0
 */
package lab_05;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The program prints each row of the Lucas series separately.
 * At the same time, using another thread, the program calculates
 * the overall sum of all rows In the end, the program save the
 * Lucas series into a file.
 * While processing, the user can press the ‘cancel’ button. In that case, the program
 * stops and print the sum of the Lucas series that is calculated so far.
 */
public class LucasView extends JFrame{

    private Thread calculateLucasSeriesThread;
    private Thread calculateLucasSumThread;

    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JTextArea textArea;
    private JProgressBar progressBar;
    private JLabel sumLabel;
    private JTextField numberInputTxtField;
    private JButton getSumBtn;
    private JButton cancelBtn;
    private JLabel imputLabel;

    /**
     * Constructor for LucasView
     */
    public LucasView() {
        createUIComponents();

        getSumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkInput(numberInputTxtField.getText())) {
                    cancelBtn.setEnabled(true);
                    textArea.setText("");
                    int rowNumber = Integer.parseInt(numberInputTxtField.getText());

                    calculateLucasSeriesThread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            calculateLucasSeries(rowNumber);
                        }
                    });

                    calculateLucasSumThread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            calculateLucasSum(rowNumber);
                        }
                    });

                    calculateLucasSeriesThread.start();
                    calculateLucasSumThread.start();
                }
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateLucasSeriesThread.interrupt();
                calculateLucasSumThread.interrupt();
                writeResultToFile();
            }
        });
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Finding Lucas series sum");
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private void calculateLucasSeries(int rowNumber) {
        int L0 = 2;
        int L1 = 1;
        int LN = 0;

        textArea.setText(String.valueOf(L0));
        textArea.setText(textArea.getText()+"\n"+String.valueOf(L1));

        progressBar.setMaximum(rowNumber-2);
        progressBar.setStringPainted(true);

        for(int i = 0; i < rowNumber-2; i++) {
            LN = L0 + L1;
            textArea.setText(textArea.getText()+"\n"+String.valueOf(LN));
            L0 = L1;
            L1 = LN;

            progressBar.setValue(i+1);
        }
        cancelBtn.setEnabled(false);
        writeResultToFile();
    }

    private void calculateLucasSum(int rowNumber) {
        int L0 = 2;
        int L1 = 1;
        int LN = 0;
        int sum = L0 + L1;

        sumLabel.setText(sumLabel.getText()+sum);

        for(int i = 0; i < rowNumber-2; i++) {
            LN = L0 + L1;
            sum += LN;
            sumLabel.setText("Sum = "+sum);
            L0 = L1;
            L1 = LN;
        }
    }

    private void writeResultToFile() {
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("src/lab_05/data.txt"))) {
            bWriter.write(textArea.getText());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean checkInput(String input) {
        if(input == null) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Enter valid input!", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            int rowNumber = Integer.parseInt(numberInputTxtField.getText());

            if(rowNumber < 3 || rowNumber >20){
                JOptionPane.showMessageDialog(new JFrame(),
                        "Enter valid input!", "Warning",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(),
                    "Enter valid input!", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
