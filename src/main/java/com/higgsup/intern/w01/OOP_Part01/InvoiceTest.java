package com.higgsup.intern.w01.OOP_Part01;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
       Invoice invoice = new Invoice("001","Key board",36,1500.0);
        System.out.println("Invoice amont: "+invoice.getInvoiceAmount());

    }
}
