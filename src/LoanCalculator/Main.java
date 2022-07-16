package LoanCalculator;

import javax.swing.*;

import static LoanCalculator.LoanCalculator.createAndShowGUI;


public class Main {
    public static void main(String[] args) {
        LoanCalculator loanCalculator = new LoanCalculator();
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}
