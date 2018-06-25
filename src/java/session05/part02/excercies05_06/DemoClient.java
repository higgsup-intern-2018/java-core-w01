package session05.part02.excercies05_06;

public class DemoClient {
    public static void main(String[] args) {
        BankAccount flat = new FlatFee(20000.0);
        BankAccount nic = new NickelNDime(12000.0);
        BankAccount gamble = new Gamble(24000.0);
        flat.deposit(500);
        nic.deposit(2000);
        gamble.withdraw(4000);
        MyComparator comparator = new BalanceAscending();
        MyComparator comparator1 = new BalanceDescending();
        MyComparator comparator2 = new TransactionCountDescending();
        InsertionSort insertionSortort = new InsertionSort();
        BankAccount[] accounts = new BankAccount[] {flat,nic,gamble};
        //ascending
        for (BankAccount item : accounts) {
            System.out.println("Balance ascending: "+item.getBalance());
        }
        System.out.println();

        insertionSortort.sort(accounts,comparator);
        for (BankAccount item : accounts) {
            System.out.println("Sort ascending balance "+item.getBalance());
        }
        System.out.println();
        //descending
        insertionSortort.sort(accounts,comparator1);
        for (BankAccount item : accounts) {
            System.out.println("Sort descending balance: "+item.getBalance());
        }
        System.out.println();
        //transaction
        insertionSortort.sort(accounts,comparator2);
        for (BankAccount item : accounts) {
            System.out.println("Sort transaction balance: "+item.getNumberOfTransactions());
        }
        System.out.println();
    }

}
