package com.higgsup.intern.w01.sec05.part01;

public class SavingsAccount {
    public static double annualInterestRate = 0.04;

    private double savingsBalance;

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = getSavingsBalance()*(annualInterestRate/12);
        this.savingsBalance = savingsBalance + monthlyInterest;
        return monthlyInterest;
    }

    public static void modifyInterestRest(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
}
