package com.company.Varkavorum;

public class LoanApplication {
    Customer customer;
    private int score;
    LoanEnum loan;
    private double sumOfLoan;

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public LoanEnum getLoan() {
        return loan;
    }
    public void setLoan(LoanEnum loan) {
        this.loan = loan;
    }
    public double getSumOfLoan() {
        return sumOfLoan;
    }
    public void setSumOfLoan(int sumOfLoan) {
        this.sumOfLoan = sumOfLoan;
    }
    public LoanApplication(int score, LoanEnum loan, double sumOfLoan) {
        this.customer = customer;
        this.score = score;
        this.loan = loan;
        this.sumOfLoan = sumOfLoan;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "customer=" + customer +
                ", score=" + score +
                ", loan=" + loan +
                ", sumOfLoan=" + sumOfLoan +
                '}';
    }
}
