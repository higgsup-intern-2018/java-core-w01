package com.higgsup.intern.w01.sec05.part02.accounts;

public class NickelNDime extends BankAccount {
    private int successfulTransactionCount;

    public NickelNDime(double balance) {
        super(balance);
    }

    @Override
    boolean withdraw(double withdrawalMoney) {
        if(super.withdraw(withdrawalMoney)){
            successfulTransactionCount++;
            return true;
        }else return false;
    }

    @Override
    double endMonthCharge() {
        return 2000 * successfulTransactionCount;
    }

}
