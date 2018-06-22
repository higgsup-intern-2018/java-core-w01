package com.higgsup.intern.w01.sec06.exercise5_6;

public class NickelNDime extends BankAccount
{
    private int withdrawCount;

    public NickelNDime(double balance)
    {
        super(balance);
    }

    @Override
    public boolean withdraw(int amount) {
        if(super.withdraw(amount))
        {
            withdrawCount++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int endMonthCharge() {
        return 2000 * withdrawCount;
    }
}
