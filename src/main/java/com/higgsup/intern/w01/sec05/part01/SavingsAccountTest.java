package com.higgsup.intern.w01.sec05.part01;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        System.out.printf("The monthly interest of saver1: $%1.2f \n", saver1.calculateMonthlyInterest());
        System.out.printf("The monthly interest of saver2: $%1.2f \n", saver2.calculateMonthlyInterest());
        System.out.println();
        System.out.printf("New balances for saver1: $%1.2f \n", saver1.getSavingsBalance());
        System.out.printf("New balances for saver2: $%1.2f \n", saver2.getSavingsBalance());

        System.out.println("============================================");
        SavingsAccount.modifyInterestRest(0.05);
        System.out.printf("The next month interest of saver1: $%1.2f \n", saver1.calculateMonthlyInterest());
        System.out.printf("The next month interest of saver2: $%1.2f \n", saver2.calculateMonthlyInterest());
        System.out.println();
        System.out.printf("New balances for saver1: $%1.2f \n", saver1.getSavingsBalance());
        System.out.printf("New balances for saver2: $%1.2f \n", saver2.getSavingsBalance());

    }
}
