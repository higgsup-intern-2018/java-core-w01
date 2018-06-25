package com.higgsup.intern.w01.sec06.Bank;

public class DemoClient {
    public static void main(String[] args) {
        BankAccount flatFee = new FlatFee(100000);
        BankAccount nickel = new NickelNDime(90000);
        BankAccount gamble = new Gambler(110000);
        flatFee.deposit(18000);
        flatFee.deposit(2000);
        nickel.withDraw(2000);
        gamble.withDraw(1000);

        flatFee.endMonth();
        System.out.println();
        nickel.endMonth();
        System.out.println();
        gamble.endMonth();
        System.out.println();

        flatFee.deposit(18000);
        flatFee.deposit(2000);
        nickel.withDraw(2000);
        gamble.withDraw(1000);

        MyComparator comparator = new BalanceAscending();
        MyComparator anotherComparator = new BalanceDescending();
        MyComparator lastComparator = new TransactionCountDescending();
        InsertionSort sortAccount = new InsertionSort();

        //Balance ascending
        BankAccount[] accounts = new BankAccount[]{flatFee, nickel, gamble};
        System.out.print("Initial balance value order: ");
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        System.out.println();
        sortAccount.sort(accounts, comparator);

        System.out.print("Balance value in ascending order: ");
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        System.out.println();

        //Balance descending
        sortAccount.sort(accounts, anotherComparator);
        System.out.print("Balance value in descending order: ");
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getBalance() + " ");
        }
        System.out.println();

        //Transaction count descending
        sortAccount.sort(accounts, lastComparator);
        System.out.print("Transaction count in descending order: ");
        for(BankAccount ba: accounts)
        {
            System.out.print(ba.getTransaction() + " ");
        }
        System.out.println();
    }
}
