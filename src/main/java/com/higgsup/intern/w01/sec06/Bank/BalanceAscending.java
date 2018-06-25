package com.higgsup.intern.w01.sec06.Bank;

public class BalanceAscending implements MyComparator{
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        return a1.getBalance() < a2.getBalance();
    }
}
