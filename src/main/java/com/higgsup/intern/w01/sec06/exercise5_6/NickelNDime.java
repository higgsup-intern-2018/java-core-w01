package com.higgsup.intern.w01.sec06.exercise5_6;

public class NickelNDime extends BankAccount
{
    static int withdraw;

    public NickelNDime(double balance)
    {
        super(balance);
    }

    @Override
    public boolean withdraw(int amount) {
        if(super.withdraw(amount))
        {
            withdraw++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double endMonthCharge() {
        return 2000 * withdraw;
    }
}
