package session05.part02.excercies05_06;

public class FlatFee extends BankAccount{

    public FlatFee(double balance) {
        super(balance);
    }

    @Override
    public double endMonthCharge() {
        return 10000;
    }
}
