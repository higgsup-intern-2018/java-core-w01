package com.higgsup.intern.w01.oop_part02.exercise06;

import com.higgsup.intern.w01.oop_part02.exercise05.BankAccount;

public class InsertSort {
    public void sort(BankAccount[] account, MyComparator compare){
        BankAccount temp;
        for (int i = 1; i < account.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(compare.less(account[j],account[j-1])){
                    temp = account[j];
                    account[j] = account[j-1];
                    account[j-1] = temp;
                }
            }
        }
    }
}
