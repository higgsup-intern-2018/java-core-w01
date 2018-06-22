package com.higgsup.intern.w01.sec06.exercise5_6;

public abstract class BankAccount
{
    private double balance;
    private int transaction;

    public BankAccount(double balance)
    {
        this.balance = balance;
        transaction = 0;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public int getTransaction()
    {
        return this.transaction;
    }

    public boolean deposit(int amount)
    {
        if(amount > 0)
        {
            balance += amount;
            transaction++;
            return true;

        }else {
            return false;
        }
    }

    public boolean withdraw(int amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            transaction++;
            return true;
        }
        else {
            return false;
        }
    }

    public void endMonth()
    {
        System.out.println("Account data: " + "\nBalance: " + balance
                            + "\nTransaction count: " + transaction
                            + "\nFee: " + endMonthCharge());
        transaction = 0;
    }

    public abstract double endMonthCharge();
}
