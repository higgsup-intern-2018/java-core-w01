package session05.part01;

import java.awt.datatransfer.MimeTypeParseException;

public class SavingsAccount {
    public static double annualInterestRate;
    private double savingBalance;

    //Contructor có tham số
    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    //get/set
    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    //method modifyInteresRate
    public static void modifyInteresRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    //khai báo biến lãi suất hàng tháng
    private double monthlyInterestRate;

    //method calculateMonthlyInterestRate
    public double calculateMonthlyInterestRate() {
        monthlyInterestRate = savingBalance * (annualInterestRate / 12);
        this.savingBalance = savingBalance * monthlyInterestRate;
        return monthlyInterestRate;
    }

}
