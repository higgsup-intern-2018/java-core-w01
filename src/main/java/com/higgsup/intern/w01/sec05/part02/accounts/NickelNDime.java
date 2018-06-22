package com.higgsup.intern.w01.sec05.part02.accounts;

public class NickelNDime extends BankAccount {
    private double withdrawalMoney;
    private double balance;
    private int sucessfulTransaction;

    public NickelNDime(double balance) {
        super(balance);
        this.balance = balance;
    }

    @Override
    double endMonthCharge() {
        if (super.withdraw(withdrawalMoney) == true){
            sucessfulTransaction++;
            return 2000*sucessfulTransaction;
        }
        return 0;
    }
}
