/*Modify class Account to provide a method called debit that withdraws money from an Account.
 Ensure that the debit amount does not exceed the Account's balance.
 If it does, the balance should be left unchanged and the method should print a message indicating
 "Debit amount exceeded account balance." Modify class AccountTest to test method debit.
  */
package com.higgsup.intern.w01.sec05;

import java.util.Scanner;

public class Exercise02Test {
    public static void main(String[] args) {
        Exercise02 account1 = new Exercise02(50);
        Exercise02 account2 = new Exercise02(-7.53);

        System.out.println("Account1 balance: "+account1.getBalance());
        System.out.println("Account2 balance: "+account2.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền trong tài khoản 1: ");
        double depositAmount = sc.nextDouble(); // deposit: khoan tien gui vao mot tai khoan
        System.out.println("Thêm số dư vào tài khoản 1: ");
        account1.credit(depositAmount);

        System.out.println("Account1 balance: "+account1.getBalance());
        System.out.println("Account2 balance: "+account2.getBalance());

        System.out.println("Nhập số tiền vào trong tài khoản 2: ");
         double depositAmount1 = sc.nextDouble();
        System.out.println("Thêm số dư vào tài khoản 2: ");
        account2.credit(depositAmount1);

        System.out.println("Account1 balance: "+account1.getBalance());
        System.out.println("Account2 balance: "+account2.getBalance());

        System.out.println("Nhập số tiền rút tài khoản 1: ");
        double withDraw = sc.nextDouble();
        account1.debit(withDraw);

        System.out.println("Nhập số tiền rút tài khoản 2: ");
        double withDraw1 = sc.nextDouble();
        account2.debit(withDraw1);



    }
}
