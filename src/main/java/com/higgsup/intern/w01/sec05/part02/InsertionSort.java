package com.higgsup.intern.w01.sec05.part02;

import com.higgsup.intern.w01.sec05.part02.accounts.BankAccount;

public class InsertionSort {
    public void sort(BankAccount[] account, MyComparator compare) {
        int n = account.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j > 0; j--){
                if(compare.less(account[j], account[j-1])){
                    swap(account, j, j - 1);
                }
            }
        }
    }
    public static void swap(BankAccount[] account, int i, int j){
        BankAccount temp = account[i];
        account[i] = account[j];
        account[j] = temp;
    }
}
