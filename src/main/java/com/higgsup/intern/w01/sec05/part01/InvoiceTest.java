package com.higgsup.intern.w01.sec05.part01;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Iphone7", "Mobile phone of Apple", 10, 500);
        System.out.print("The amount of your invoice: $" + invoice.getInvoiceAmount());
    }
}
