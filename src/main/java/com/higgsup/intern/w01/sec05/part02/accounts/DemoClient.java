package com.higgsup.intern.w01.sec05.part02.accounts;

import com.higgsup.intern.w01.sec05.part02.*;

public class DemoClient {
    public static void main(String[] args) {
        FlatFee flatFee = new FlatFee(1000);
        NickelNDime nickelNDime = new NickelNDime(5000);
        Gambler gambler = new Gambler(2000);

        flatFee.deposit(500);
        flatFee.withdraw(150);

        nickelNDime.deposit(200);
        nickelNDime.deposit(50);
        nickelNDime.withdraw(200); //successful
        nickelNDime.withdraw(300); //successful
        nickelNDime.withdraw(6000); //unsuccessful
        nickelNDime.withdraw(9000); //unsuccessful

        gambler.withdraw(600);
        gambler.deposit(1000);
        gambler.deposit(1000);
        gambler.withdraw(50);


        MyComparator comparatorForAscending = new BalanceAscending();
        MyComparator comparatorDescending = new BalanceDescending();
        MyComparator comparatorForTransactionCountDescending = new TransactionCountDescending();

        InsertionSort insertionSort = new InsertionSort();

        BankAccount [] accounts = new BankAccount[] {flatFee, nickelNDime, gambler };

        System.out.println("List of bank accounts before sorting:");
        for (BankAccount bankAccount : accounts){
            System.out.println(bankAccount.toString());
        }
        System.out.println();
        System.out.println("After sorting by Balance Ascending:");
        insertionSort.sort(accounts, comparatorForAscending);
        for (BankAccount bankAccount : accounts){
            System.out.println(bankAccount.toString());
        }
        System.out.println();
        System.out.println("After sorting by Balance Descending:");
        insertionSort.sort(accounts, comparatorDescending);
        for (BankAccount bankAccount : accounts){
            System.out.println(bankAccount.toString());
        }
        System.out.println();
        System.out.println("After sorting by Transaction count Descending:");
        insertionSort.sort(accounts, comparatorForTransactionCountDescending);
        for (BankAccount bankAccount : accounts){
            System.out.println(bankAccount.toString());
        }
        System.out.println("\nBankAccount: FlatFee");
        flatFee.endMonthCharge();
        flatFee.endMonth();
        System.out.println("\nBankAccount: NickelNDime");
        nickelNDime.endMonthCharge();
        nickelNDime.endMonth();
        System.out.println("\nBankAccount: Gambler");
        gambler.endMonthCharge();
        gambler.endMonth();
    }
}
