package com.higgsup.intern.w01.oop_part02.exercise05;

public class NickelNDime extends  BankAccount {
    private int myWithdraw;
    public NickelNDime(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(int withdraw) {
        if(super.withdraw(withdraw)){
            myWithdraw +=1;
        }
        return true;
    }

    @Override
    public int endMonthCharge() {
        return 2000 * myWithdraw;
    }
}
