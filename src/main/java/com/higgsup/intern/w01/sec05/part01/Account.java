package com.higgsup.intern.w01.sec05.part01;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }
    // credit (add) an amount to the account
    public void credit(double amount) {
        balance = balance + amount; // add amount to balance
    }

    // return the account balance
    public double getBalance() {
        return balance;
    }

    //debit the account
    public void debit(double amount){
        if (amount > getBalance()){
            System.out.println("Debit amount exceeded account balance.");
        } else System.out.println("Withdraw money successful!");
    }

}
