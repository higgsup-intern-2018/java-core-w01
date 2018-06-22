package com.higgsup.intern.w01.sec06.exercise5_6;

public class Gamble extends BankAccount
{
    public Gamble(double balance)
    {
        super(balance);
    }

    @Override
    public boolean withdraw(int amount) {
        double random = Math.random();
        if(random <= 0.5)
        {
            super.withdraw(amount);
        }else{
            super.deposit(amount);
        }
        return true;
    }

    @Override
    public int endMonthCharge() {
        return 0;
    }
}
