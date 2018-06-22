package com.higgsup.intern.w01.sec06.exercise5_6;

public class FlatFee extends BankAccount
{
    public FlatFee(double balance)
    {
        super(balance);
    }

    @Override
    public double endMonthCharge() {
        return 10000;
    }
}
