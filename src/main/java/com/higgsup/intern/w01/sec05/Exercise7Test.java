package com.higgsup.intern.w01.sec05;

public class Exercise7Test
{
    public static void main(String[] args) {
        Exercise7 savingsAccount = new Exercise7(2000);
        Exercise7 anotherSavingsAccount = new Exercise7(3000);
        Exercise7.annualInterestRate = 4;

        //First balance
        System.out.printf("First account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());

        //Calculate monthly interest
        savingsAccount.calculateMonthlyInterest();
        anotherSavingsAccount.calculateMonthlyInterest();

        //Balance after changing
        System.out.printf("\nFirst account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());

        Exercise7.modifyInterestRate(5);

        savingsAccount.calculateMonthlyInterest();
        anotherSavingsAccount.calculateMonthlyInterest();

        //Balance after changing
        System.out.printf("\nFirst account balance: $%.2f", savingsAccount.getSavingsBalance());
        System.out.printf("\nSecond account balance: $%.2f", anotherSavingsAccount.getSavingsBalance());
    }
}
