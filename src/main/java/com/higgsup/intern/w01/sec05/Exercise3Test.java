package com.higgsup.intern.w01.sec05;

public class Exercise3Test
{
    public static void main(String[] args)
    {
        //create invoice with positive quantity and price
        Exercise3 invoice = new Exercise3("2KHCB", "At store", 3, 13.25);

        //create invoice with negative quantity and price
        Exercise3 anotherInvoice = new Exercise3("EPFKH", "At mall", -2, -8.85);

        //Invoices information
        System.out.println(invoice + "\n");
        System.out.println(anotherInvoice + "\n");

        //set price with negative number
        System.out.println("Before set price with negative number: " + invoice.getPrice());
        invoice.setPrice(-4);
        System.out.println("After set price with negative number: " + invoice.getPrice());

        //set price with positive number
        System.out.println("Before set price with positive number: " + invoice.getPrice());
        invoice.setPrice(8.84);
        System.out.println("After set price with positive number: " + invoice.getPrice());

        //set quantity with negative number
        System.out.println("Before set quantity with negative number: " + invoice.getQuantity());
        invoice.setQuantity(-2);
        System.out.println("After set quantity with negative number: " + invoice.getQuantity());

        //set quantity with positive number
        System.out.println("Before set quantity with positive number: " + invoice.getQuantity());
        invoice.setQuantity(5);
        System.out.println("After set quantity with positive number: " + invoice.getQuantity());
    }
}
