package com.higgsup.intern.w01.oop_part02.exercise06;

import com.higgsup.intern.w01.oop_part02.exercise05.BankAccount;

public class BalanceAscending implements MyComparator {
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        boolean isAsc = false;
        if(a1.getBalance() < a2.getBalance()){
            isAsc = true;
        } else{
            isAsc = false;
        }
        return isAsc;
    }
}
