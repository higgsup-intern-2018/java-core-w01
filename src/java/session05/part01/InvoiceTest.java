package session05.part01;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice iv= new Invoice("PR01","CPU",2,1000);
        iv.displayInvoice();
        iv.getInvoiceAmount();
    }
}
