package com.higgsup.intern.w01.sec05.part02.accounts;

public class FlatFee extends BankAccount{
    private double balance;

    public FlatFee(double balance) {
        super(balance);
        this.balance = balance;
    }

    @Override
    double endMonthCharge() {
        return 1000;
    }
}
