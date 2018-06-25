package session05.part02.excercies05_06;

public abstract class BankAccount {
    public double balance;
    public int numberOfTransactions;// số lần giao dịch

    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance()
    {
        return this.balance;
    }

    public int getNumberOfTransactions()
    {
        return this.numberOfTransactions;
    }

    public boolean deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            numberOfTransactions++;
            return true;
        }
        else
        {
            return false;
        }
    };
    public boolean withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance = balance - amount;
            numberOfTransactions++;
            return true;
        }
        else
        {
            return false;
        }
    };
    public void endMonth()
    {
        System.out.println("Account data: " + "\nBalance: " + balance
                + "\nTransaction count: " + numberOfTransactions
                + "\nFee: " + endMonthCharge());
        numberOfTransactions = 0;
    }
    public abstract double endMonthCharge();
}
