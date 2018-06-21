package com.higgsup.intern.w01.sec05.part01;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;
    int count = 0;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price < 0) {
            this.price = 0.0;
        } else this.price = price;
    }

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        count ++;
    }

    public double getInvoiceAmount(){
        return getQuantity()*getPrice();
    }
}
