package com.higgsup.intern.w01.sec06.Bank;

public class Gambler extends BankAccount {
    public Gambler(double balance){
        super(balance);
    }

    @Override
    public boolean withDraw(int amount) {
        double random = Math.random();
        if(random < 0.5){
            super.withDraw(amount);
        }else {
            super.deposit(amount);
        }return true;
    }

    @Override
    public double endMonthCharge() {
        return 0;
    }
}
