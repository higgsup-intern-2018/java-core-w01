package session05.part02.excercies05_06;

public class NickelNDime extends BankAccount {
    static double withdraw;
    public NickelNDime(double balance){
        super(balance);
    }
    @Override
    public double endMonthCharge() {
        return 20000*withdraw;
    }
}
