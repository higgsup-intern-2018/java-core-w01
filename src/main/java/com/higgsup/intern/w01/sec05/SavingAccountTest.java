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
