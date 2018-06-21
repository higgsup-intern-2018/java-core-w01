package com.higgsup.intern.w01.sec05;

public class Exercise7
{
    static double annualInterestRate;
    private double savingsBalance;

    public Exercise7(double balance)
    {
        if(balance > 0){
            savingsBalance = balance;
        }
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    static void modifyInterestRate(double interestRate)
    {
        annualInterestRate = interestRate;
    }
}
