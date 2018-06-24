package com.higgsup.intern.w01.sec06.exercise5_6;

public class TransactionCountDescending implements MyComparator
{
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        return a1.getTransaction() > a2.getTransaction();
    }
}
