package com.higgsup.intern.w01.sec06.exercise5_6;

public class InsertionSort
{
    public void sort(BankAccount[] account, MyComparator compare)
    {
        int n = account.length;
        for(int i = 1; i < n; ++i)
        {
            BankAccount bankAccount = account[i];
            int j = i-1;
            while(j >= 0 && !compare.less(account[j], bankAccount))
            {
                account[j+1] = account[j];
                j = j-1;
            }
            account[j+1] = bankAccount;
        }
    }
}
