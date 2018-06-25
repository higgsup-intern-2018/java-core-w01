package com.higgsup.intern.w01.sec06.Bank;

public class InsertionSort {
    public void sort(BankAccount[] account, MyComparator compare) {
        int n = account.length;
        for (int i = 1; i < n; i++) {
            BankAccount bankAccount = account[i]; // biến tham chiếu là phần tử thứ i trong mảng
            int j = i - 1;
            while (j >= 0  && compare.less( bankAccount, account[j])) {
                /* cái compare less là để so sánh xem phần tử đứng sau có nhỏ hơn phần tử đúng trước ko? */
                account[j + 1] = account[j];
                j= j-1;
            }
            account[j + 1] = bankAccount;
        }
    }
}
