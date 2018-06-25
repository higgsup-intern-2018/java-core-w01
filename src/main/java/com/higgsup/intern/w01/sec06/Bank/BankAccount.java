/*Implement classes FlatFee, NickelNDime, Gambler that model three types of bank accounts described as follows:
Data about each account includes current balance, number of transactions during the current month.
Each account object responses to the following message:

a constructor that create a new account given an initial balance as a parameter.
** boolean deposit(int) put some money to the account. It updates transaction count then returns true if successful.
** boolean withdraw(int) get some money from the account. It updates transaction count then returns true if successful.
** void endMonth() is called by client programs at the end of each month to charge monthly fee
    (amount calculated by endMonthCharge()),

 print account data including balance, transaction count, and fee, then reset transaction count to 0 ready for the next month.
 endMonthCharge() return the amount to be charged as fee for the last month. Fees depend on the type of account:
+ FlatFee account has a fix fee of 10000 per month.
+ NickelNDime accounts are charged 2000 for each successful withdraw.
Fees for FlatFee and NickelNDime accounts are collected at the end of each month.
+ Gamble accounts don't have monthly fee. But each withdraw is done in a gambling way.
For a probability of 49%, a withdraw results in zero deduction from the account balance,
 the owner gets the withdrawn amount for free. For a probability of 51%,
 the amount deducted from the balance is twice the amount the account owner requests and receives. */

package com.higgsup.intern.w01.sec06.Bank;

public abstract class BankAccount {
    private double balance; // số tiền dư trong tài khoản
    private int transaction;  // số lần giao dịch

    public BankAccount(double balance){
        this.balance = balance;
        transaction  = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransaction() {
        return transaction;
    }

    public boolean deposit(int amount){ // phuong thuc gui tien
        if (amount > 0){
            balance = balance + amount;
            transaction++; // sau khi đã chuyển tiền vào thành công thì nó sẽ đếm tăng thêm 1 lần
            return true;
        }else{
            return false;
        }
    }

    public boolean withDraw(int amount){ // phuong thuc rut tien
        if(amount < balance){
            balance = balance - amount;
            transaction++;
            return true;
        }else {
            return  false;
        }
    }

    public void endMonth(){ //
        System.out.println("Account data: "+"Balance: "+balance+"Transaction count: "+
                transaction+"Fee:"+endMonthCharge());
            transaction = 0;

    }

    public abstract double endMonthCharge();
}
