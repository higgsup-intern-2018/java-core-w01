package com.higgsup.intern.w01.sec05.part01;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Iphone7", "Mobile phone of Apple", 10, 500);
        System.out.print("The amount of your invoice: $" + invoice.getInvoiceAmount());

        invoice.setNumber("Iphone X");
        invoice.setDescription("Mobile phone of Apple");
        invoice.setQuantity(-9);
        invoice.setPrice(-20.5);
        System.out.println();
        System.out.println("The information of your invoice:");
        System.out.println("Product Name: " + invoice.getNumber()+ ", Description: " + invoice.getDescription() + ", Quantity: " +invoice.getQuantity()
        + ", Price: $" + invoice.getPrice());
        System.out.println("The amount of your invoice: $" + invoice.getInvoiceAmount());

    }
}
