package session05.part01;

public class TestSavingAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.annualInterestRate = 4;
        //in ra số tiền trong tài khoản
        System.out.printf(" Monthly interest rate first : %1.2f" ,saver1.getSavingBalance());
        System.out.println();
        System.out.printf(" Monthly interest rate second : %1.2f",saver2.getSavingBalance());
        //in ra số tiền sau khi nhân với lãi xuất
        saver1.calculateMonthlyInterestRate();
        saver2.calculateMonthlyInterestRate();
        //số tiền trong tài khoản sau khi nhân với lãi suất
        System.out.println("\n----------------------------------------------------------");
        System.out.printf(" Monthly interest rate first when change : %1.2f",saver1.getSavingBalance());
        System.out.println();
        System.out.printf(" Monthly interest rate second when change : %1.2f",saver2.getSavingBalance());
        System.out.println("\n----------------------------------------------------------");
        SavingsAccount.modifyInteresRate(5);
        saver1.calculateMonthlyInterestRate();
        saver2.calculateMonthlyInterestRate();
        System.out.println("\n----------------------------------------------------------");
        System.out.printf(" Monthly interest rate first when change : %1.2f",saver1.getSavingBalance());
        System.out.println();
        System.out.printf(" Monthly interest rate second when change : %1.2f",saver2.getSavingBalance());

    }
}
