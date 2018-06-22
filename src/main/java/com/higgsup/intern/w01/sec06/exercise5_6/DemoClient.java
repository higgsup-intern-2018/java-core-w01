package com.higgsup.intern.w01.sec06.exercise5_6;

public class DemoClient
{
    public static void main(String[] args) {
        BankAccount flatFee = new FlatFee(10000);
        BankAccount nickel = new NickelNDime(9000);
        BankAccount gamble = new Gamble(11000);
        flatFee.deposit(100);
        flatFee.deposit(200);
        gamble.withdraw(1000);

        MyComparator comparator = new BalanceAscending();
        MyComparator anotherComparator = new BalanceDescending();
        MyComparator lastComparator = new TransactionCountDescending();
        InsertionSort sortAccount = new InsertionSort();

        //Balance ascending
        BankAccount[] accounts = new BankAccount[]{flatFee, nickel, gamble};
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        sortAccount.sort(accounts, comparator);
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        System.out.println();

        //Balance descending
        sortAccount.sort(accounts, anotherComparator);
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        System.out.println();

        //Transaction count descending
        sortAccount.sort(accounts, lastComparator);
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getTransaction() + " ");
        }
        System.out.println();
    }
}
