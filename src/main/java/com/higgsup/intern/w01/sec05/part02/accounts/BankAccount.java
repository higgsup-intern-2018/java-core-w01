package com.higgsup.intern.w01.sec05.part02.accounts;

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
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    boolean deposit(double deposits){
        balance = balance + deposits;
        transactionCount++;
        return true;
    }
    boolean withdraw(double withdrawalMoney){
        if (withdrawalMoney < balance){
            balance = balance - withdrawalMoney;
            return true;
        }else return false;

    }
    void endMonth(){
        double charge = endMonthCharge();
        balance = balance - charge;
        System.out.println("Information of charging monthly fee:");
        System.out.println("Balance: " + balance + ", Transaction: " + transactionCount + ", Fee: " + charge);
        transactionCount = 0;
    }
    abstract double endMonthCharge();

    public String toString() {
        return String.format("(%f, %d)", balance, transactionCount);
    }
}
