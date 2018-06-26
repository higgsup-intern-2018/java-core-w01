package com.higgsup.intern.w01.oop_part01;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(2000.00);
        SavingsAccount.modifyInterestRate(4);
        SavingsAccount s2 = new SavingsAccount(3000.00);
        System.out.println("Monthly Interest of s1 with interest rate 4%: "+s1.calculateMonthlyInterest());
        System.out.println("Monthly Interest of s2 with interest rate 4%: "+s2.calculateMonthlyInterest());
        System.out.println();
        SavingsAccount.modifyInterestRate(5);
        System.out.println("Monthly Interest of s1 with interest rate 5%: "+s1.calculateMonthlyInterest());
        System.out.println("Monthly Interest of s2 with interest rate 5%: "+s2.calculateMonthlyInterest());
    }
}
