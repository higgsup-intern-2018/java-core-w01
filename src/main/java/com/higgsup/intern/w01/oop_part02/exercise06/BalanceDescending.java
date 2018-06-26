package com.higgsup.intern.w01.oop_part02.exercise06;

import com.higgsup.intern.w01.oop_part02.exercise05.BankAccount;

public class BalanceDescending implements MyComparator{
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        boolean isDesc = false;
        if(a1.getBalance() > a2.getBalance()){
            isDesc = true;
        } else{
            isDesc = false;
        }
        return isDesc;
    }
}
