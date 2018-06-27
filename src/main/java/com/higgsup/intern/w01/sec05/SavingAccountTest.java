/*(Savings Account Class) Create class SavingsAccount.
 Use a static variable annualInterestRate to store the annual interest rate for all account holders.
 Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
 Provide method calculateMonthlyInterest to calculate the monthly interest
 by multiplying the savingsBalance by annualInterestRate divided by 12, this interest should be added to savingsBalance.
  Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
  Write a program to test class SavingsAccount.
  Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
  Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers.
  Then set the annualInterestRate to 5%, calculate the next month's interest and print the new balances for both savers.
  */
package com.higgsup.intern.w01.sec05;

public class SavingAccountTest {
    public static void main(String[] args) {

        SavingAccount saver1  = new SavingAccount(4 , 2000);
        SavingAccount saver2  = new SavingAccount(4 , 3000);

        System.out.println("Print balance for saver1 with rate = 4% :  "+saver1.calculateMonthlyInterest());
        System.out.println("Print balance for saver2 with rate = 4%:  "+saver2.calculateMonthlyInterest());

        SavingAccount.modifyInterestRate(5);
        System.out.println("New balance for saver1 with rate = 5%"+saver1.calculateMonthlyInterest());
        System.out.println("New balance for saver2 with rate = 5%"+saver2.calculateMonthlyInterest());






    }
}
