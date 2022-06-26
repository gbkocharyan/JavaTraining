package com.company.Varkavorum;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements DecisionListener {

    int amount;
    LoanEnum loanType = null;
    String loanPurpose;
    Customer client = new Customer.Builder()
            .setLoanList()
            .setPassport()
            .setName()
            .setSurname()
            .setBirthDate()
            .setSalary()
            .setScore()
            .build();

    List <Customer> customer = new ArrayList<>();

    @Override
    public void logic() throws IOException {

            Schedule schedule = new Schedule(amount, loanType.percent, loanType.duration);

            Loan loan1 = new Loan(loanType, loanPurpose, schedule, amount);

            System.out.println("Dear " + client.getName() + " Your loan sum is " + loan1.getSumMoney());
            System.out.println(loan1);
            client.getLoansList().add(loan1);
            customer.add(client);
            System.out.println("Added into bank's customers ");
            for (Customer cu : customer) {
                if (cu != null)
                    System.out.println(cu.getLoansList());
                System.out.println(cu.getPassport());
            }

            FileWriter writerCustomer = new FileWriter("C:\\Users\\Gevorg.Kocharyan\\Desktop\\Customers.txt");
            FileWriter writerLoans = new FileWriter("C:\\Users\\Gevorg.Kocharyan\\Desktop\\Loans.txt");
            FileReader reader = new FileReader("C:\\Users\\Gevorg.Kocharyan\\Desktop\\Loans.txt");
            writerCustomer.append(client.toString());
            writerCustomer.close();
            writerLoans.append(loan1.toString());
            writerLoans.close();

            String text = reader.toString();
            System.out.println(text);
    }

    public void processes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the sum of loan: ");
        int requiredAmount = sc.nextInt();
        if (client.getScore() >= 450 && client.getScore() < 600) {
            if (requiredAmount <= (client.getSalary() * 3)) {
                amount = requiredAmount;
            } else {
                amount = client.getSalary() * 3;
            }
        } else if (client.getScore() >= 600 && client.getScore() < 750) {
            if(requiredAmount <= (client.getSalary() * 5)) {
                amount = requiredAmount;
            } else {
                amount = client.getSalary() * 5;
            }
        } else {
            if (requiredAmount <= (client.getSalary() * 10)) {
                amount = requiredAmount;
            } else {
                amount = client.getSalary() * 10;
            }
        }

        System.out.println("What type of loan do you wont? ");
        int loanTypeID = sc.nextInt();

        switch (loanTypeID) {
            case 1:
                loanType = LoanEnum.APARIK;
                break;
            case 2:
                loanType = LoanEnum.BUSINESS;
                break;
            case 3:
                loanType = LoanEnum.SPAROXAKAN;
                break;
        }

        System.out.println("Enter purpose of Loan ");

        loanPurpose = sc.next();
        System.out.println(loanPurpose);
    }


    @Override
    public String toString() {
        return "Bank{" +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", client=" + client +
                ", customer=" + customer +
                '}';
    }
}