package session05.part02.excercies05_06;

public class Gamble extends BankAccount{
    public Gamble(double balance){
        super(balance);
    }
    @Override
    public boolean withdraw(double amount)
    {
    double rd = Math.random();
       if (rd<0.5)
       {
          super.deposit(amount);
           numberOfTransactions++;
       }
      else
      {
         super.withdraw(amount);
         numberOfTransactions++;
      }
      return true;
}
    @Override
    public double endMonthCharge() {
        return 0;
    }
}
