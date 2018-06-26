package com.higgsup.intern.w01.oop_part02.exercise06;

import com.higgsup.intern.w01.oop_part02.exercise05.BankAccount;

public class TransactionCountDescending implements MyComparator {
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        boolean isCounting = false;
        if(a1.getTransactionCount() > a2.getTransactionCount()){
            isCounting = true;
        } else{
            isCounting = false;
        }
        return isCounting;
    }
}
