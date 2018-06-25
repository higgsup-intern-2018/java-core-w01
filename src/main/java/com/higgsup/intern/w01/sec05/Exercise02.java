/*Modify class Account to provide a method called debit that withdraws money from an Account.
 Ensure that the debit amount does not exceed the Account's balance.
 If it does, the balance should be left unchanged and the method should print a message indicating
 "Debit amount exceeded account balance." Modify class AccountTest to test method debit.
  */
package com.higgsup.intern.w01.sec05;

public class Exercise02 {
    private double balance;

    public Exercise02(double initialBalance){ // truyền một biến số tiền ban đầu vào tài khoản */
        if(initialBalance >0.0){
            balance = initialBalance;
        }
    }

    public void credit(double amount){
        balance = balance + amount; // them tien vao tai khoan
    }

    public void debit(double amount){ // debit: khoản nợ
        if(amount > getBalance()){
            System.out.println("debit amount exceed account balance");
        }else {
            System.out.println("Succesfully tranction");
        }
    }

    public double getBalance(){
        return balance; // tra ve so tien hien co trong tai khoan
    }

}
