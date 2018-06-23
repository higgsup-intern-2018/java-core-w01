package com.higgsup.intern.w01.sec05.part02.accounts;

public abstract class BankAccount {
    private double balance;
    private int transaction;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    boolean deposit(double deposits){
        balance = balance + deposits;
        transaction++;
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
        System.out.println("Balance: " + balance + ", Transaction: " + transaction + ", Fee: " + charge);
        transaction = 0;
    }
    abstract double endMonthCharge();
}
