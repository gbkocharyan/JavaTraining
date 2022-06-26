package com.company.Varkavorum;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Schedule {
    double principal;
    double annualInterestRate;
    int numYears;

    Schedule(double principal, double annualInterestRate,
             int numYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numYears = numYears;
        printAmortizationSchedule(principal,annualInterestRate,numYears);
    }

    public void printAmortizationSchedule(double principal, double annualInterestRate,
                                          int numYears) {
        double interestPaid, principalPaid, newBalance;
        double monthlyInterestRate, monthlyPayment;
        int month;
        int numMonths = numYears * 12;

        // Output monthly payment and total payment
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment = monthlyPayment(principal, monthlyInterestRate, numYears);
        System.out.format("Monthly Payment: %8.2f%n", monthlyPayment);
        System.out.format("Total Payment:   %8.2f%n", monthlyPayment * numYears * 12);

        // Print the table header
        printTableHeader();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        for (month = 1; month <= numMonths; month++) {
            // Compute amount paid and new balance for each payment period
            interestPaid = principal * (monthlyInterestRate / 100);
            principalPaid = monthlyPayment - interestPaid;
            newBalance = principal - principalPaid;
            cal.add(Calendar.MONTH, 1);
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            String date = sdf.format(cal.getTime());

            // Output the data item
            printScheduleItem(month, date, interestPaid, principalPaid, newBalance);

            // Update the balance
            principal = newBalance;
        }
    }

    /**
     * @param loanAmount
     * @param monthlyInterestRate in percent
     * @param numberOfYears
     * @return the amount of the monthly payment of the loan
     */
    static double monthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfYears) {
        monthlyInterestRate /= 100;  // e.g. 5% => 0.05
        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

    /**
     * Prints a table data of the amortization schedule as a table row.
     */
    private static void printScheduleItem(int month, String date, double interestPaid,
                                          double principalPaid, double newBalance) {

        System.out.format("%5d%15s%12.2f%13.2f%14.2f\n",
                month, date, interestPaid, principalPaid, newBalance);
    }

    /**
     * Prints the table header for the amortization schedule.
     */
    private static void printTableHeader() {
        System.out.println("\nAmortization schedule");
        for (int i = 0; i < 40; i++) {  // Draw a line
            System.out.print("-");
        }
        System.out.format("\n%8s%13s%11s%13s%12s\n\n",
                "Payment#", "Payment_day", "Interest", "Principal", "Balance");

    }

    @Override
    public String toString() {
        return "Schedule{" +
                "principal=" + principal +
                ", annualInterestRate=" + annualInterestRate +
                ", numYears=" + numYears +
                '}';
    }
}
