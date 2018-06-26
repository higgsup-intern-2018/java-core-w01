package com.higgsup.intern.w01.oop_part01;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        savingsBalance = (savingsBalance * annualInterestRate)/12;
        return savingsBalance;
    }
}
