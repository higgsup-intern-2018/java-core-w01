package session05.part02.excercies05_06;

public class BalanceAscending implements MyComparator{
    @Override
    public boolean less(BankAccount a1, BankAccount a2) {
        if (a1.getBalance()<a2.getBalance())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
