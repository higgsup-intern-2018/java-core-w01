package com.higgsup.intern.w01.oop_part02.exercise05;

public class FlatFee extends  BankAccount {
    public FlatFee(double balance) {
        super(balance);
    }

    @Override
    public int endMonthCharge() {
        return 10000;
    }
}
