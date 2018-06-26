package com.higgsup.intern.w01.oop_part02.exercise05;

import java.util.Random;

public class Gambler extends  BankAccount {
    public Gambler(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(int withdraw) {
        double random = Math.random();
        if(random <0.5){
            super.deposit(withdraw);
        } else {
            super.withdraw(withdraw);
        }
        return true;
    }

    @Override
    public int endMonthCharge() {
        return 0;
    }
}
