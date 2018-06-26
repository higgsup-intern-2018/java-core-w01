package com.higgsup.intern.w01.oop_part02.exercise06;

import com.higgsup.intern.w01.oop_part02.exercise05.BankAccount;
import com.higgsup.intern.w01.oop_part02.exercise05.FlatFee;
import com.higgsup.intern.w01.oop_part02.exercise05.Gambler;
import com.higgsup.intern.w01.oop_part02.exercise05.NickelNDime;

public class DemoClient {
    public static void main(String[] args) {
        FlatFee a1 = new FlatFee(1200);
        a1.deposit(1200);

        Gambler a2 = new Gambler(4300);
        a2.deposit(700);
        a2.withdraw(400);
        a2.withdraw(40);

        NickelNDime a3 = new NickelNDime(7800);
        a3.deposit(1200);
        a3.deposit(1200);

        BankAccount bankAccount[] = new BankAccount[] {a1,a2,a3};

        MyComparator comparatorAscending = new BalanceAscending();
        MyComparator comparatorDescending = new BalanceDescending();
        MyComparator comparatorCountDescending = new TransactionCountDescending();


        InsertSort insertSort = new InsertSort();
        System.out.print("\nBalance Ascending: ");
        insertSort.sort(bankAccount,comparatorAscending);
        for(BankAccount bank : bankAccount){
            System.out.print(bank.getBalance()+" ");
        }

        System.out.print("\nBalance Descending: ");
        insertSort.sort(bankAccount,comparatorDescending);
        for(BankAccount bank : bankAccount){
            System.out.print(bank.getBalance()+" ");
        }

        System.out.print("\nTransaction Count Descending: ");
        insertSort.sort(bankAccount,comparatorCountDescending);
        for(BankAccount bank : bankAccount){
            System.out.print(bank.getTransactionCount()+" ");
        }
    }
}
