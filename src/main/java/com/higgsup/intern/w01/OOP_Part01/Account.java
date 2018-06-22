package com.higgsup.intern.w01.OOP_Part01;

public class Account {
    private double balance; // instance variable that stores the balance


    // constructor
    public Account(double initialBalance) {
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
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
        return balance; // gives the value of balance to the calling method
    }
    public void debit(double withdrawsMoney){
        if(withdrawsMoney <= balance){
            balance = balance - withdrawsMoney;
            System.out.println("Balance = "+balance+"\nTransaction success!");
        } else {
            System.out.println("Balance = "+balance+"\nDebit amount exceeded account balance");
        }
    }
}
