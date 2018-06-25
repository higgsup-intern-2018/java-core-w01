package session05.part02.excercies05_06;

public class TransactionCountDescending implements MyComparator {
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        if(a1.getNumberOfTransactions() > a2.getNumberOfTransactions())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
