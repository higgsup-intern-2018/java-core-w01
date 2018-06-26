package com.higgsup.intern.w01.oop_part02.exercise05;

public abstract class BankAccount {
    private double balance;
    private int transactionCount;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public boolean deposit(int deposit){
        boolean isDepositing = false;
        if(deposit > 0){
            balance += deposit;
            transactionCount++;
            isDepositing = true;
        }
        return isDepositing;
    }
    public boolean withdraw(int withdraw){
        boolean isWithdraw = false;
        if(withdraw < balance){
            balance -= withdraw;
            transactionCount++;
            isWithdraw = true;
        }
        return isWithdraw;
    }
    public void endMonth(){
        System.out.println("Balance: "+getBalance()
                        +"\nTransaction count: "+getTransactionCount()
                        +"\nEnd month charge: "+this.endMonthCharge());

        this.setTransactionCount(0);
    }

    public abstract int endMonthCharge();
}
