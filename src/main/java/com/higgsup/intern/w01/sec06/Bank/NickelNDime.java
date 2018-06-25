package com.higgsup.intern.w01.sec06.Bank;

public class NickelNDime extends BankAccount {
    int withDrawCount; // dem so lan minh rut tien ra

    public NickelNDime(double balance){
        super(balance);
    }

    @Override
    public boolean withDraw(int amount) {
        if(super.withDraw(amount)){ // amount: so tien ma minh muon rut
            withDrawCount++; // sau khi rut thanh cong thi no se tang so lan rut len 1 lan
            return true;
        }else {
           return false;
        }
    }

    @Override
    public double endMonthCharge() {
        return 2000*withDrawCount;
    }
}
