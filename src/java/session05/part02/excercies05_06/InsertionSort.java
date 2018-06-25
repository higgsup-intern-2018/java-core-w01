package session05.part02.excercies05_06;

public class InsertionSort {
    public void sort(BankAccount[] account , MyComparator compare)
    {
        int j;
        BankAccount bankAccount;
        int x = account.length;
        for (int i = 1 ; i<x-2 ; i++){
            j=i-1;
            bankAccount = account[i];
            while ( !compare.less(account[j],bankAccount) )
            {
                account[j+i]=account[j];
                j=j-1;
            }
            account[j+i]=bankAccount;
        }
    }
}
