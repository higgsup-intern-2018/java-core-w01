package session05.part01;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00); // create Account object
        Account account2 = new Account(-7.53); // create Account object

        // display initial balance of each object
        System.out.printf("account1 balance:$%.2f\n", account1.getBalance());
        System.out.printf("account2 balance:$%.2f\n\n", account2.getBalance());

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        double depositAmount;
        System.out.print("Enter deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);

        // display balances
        System.out.printf("account1 balance:$%.2f\n", account1.getBalance());
        System.out.printf("account2 balance:$%.2f\n\n", account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);

        // display balances
        System.out.printf("account1 balance:$%.2f\n", account1.getBalance());
        System.out.printf("account2 balance:$%.2f\n", account2.getBalance());

        double withdraw;
        System.out.print("Enter withdraw amount for account 1: ");
        withdraw = input.nextDouble();
        account1.debit(withdraw);

        System.out.println("\n");
        System.out.print("Enter withdraw amount for account 2: ");
        withdraw = input.nextDouble();
        account2.debit(withdraw);
    }

}
