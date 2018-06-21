package session05.part01;

public class Account {
    private double balance ;

    public Account(double initialBlance){
        if (initialBlance>0.0)
        {
            balance=initialBlance;
        }

    }
    public void credit(double amount){
        balance=balance+amount;
    }
    public void debit( double amount){
        if (amount> getBalance())
        {
            System.out.println("Debit amount exceeded account balance !");
        }else
        {
            System.out.println("Successful transaction !");
        }
    }
    public double getBalance(){
        return balance;
    }
}
