package com.higgsup.intern.w01.sec05;

public class SavingsAccountTest
{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(2000);
        SavingsAccount anotherSavingsAccount = new SavingsAccount(3000);
        SavingsAccount.annualInterestRate = 4;

        //First balance
        System.out.printf("First account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());

        //Calculate monthly interest
        savingsAccount.calculateMonthlyInterest();
        anotherSavingsAccount.calculateMonthlyInterest();

        //Balance after changing
        System.out.printf("\nFirst account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);

        savingsAccount.calculateMonthlyInterest();
        anotherSavingsAccount.calculateMonthlyInterest();

        //Balance after changing
        System.out.printf("\nFirst account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());
    }
}
