package com.higgsup.intern.w01.sec05.part02.accounts;

import java.util.Random;

public class Gambler extends BankAccount {
    private double balance;
    private double withdrawalMoney;

    public Gambler(double balance) {
        super(balance);
        this.balance = balance;
    }

    @Override
    double endMonthCharge() {
        if( new Random().nextDouble() <= 0.49 ) {
            return 0;
        }else return 2*withdrawalMoney;
    }
}

