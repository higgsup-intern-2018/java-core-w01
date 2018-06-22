package com.higgsup.intern.w01.OOP_Part01;

public class Invoice {
    private String number;
    private String description;
    private int quantityItemPurchased;
    private double price;

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

    public int getQuantityItemPurchased() {

        return quantityItemPurchased;
    }

    public void setQuantityItemPurchased(int quantityItemPurchased) {
        if(this.quantityItemPurchased <0){
            this.quantityItemPurchased = 0;
        } else{
            this.quantityItemPurchased = quantityItemPurchased;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price <0){
            this.price = 0.0;
        } else{
            this.price = price;
        }
    }
    public Invoice(String number, String description, int quantityItemPurchased, double price){
        this.number = number;
        this.description = description;
        this.quantityItemPurchased = quantityItemPurchased;
        this.price = price;
    }

    public double getInvoiceAmount(){
        double amount = quantityItemPurchased * price;
        return amount;
    }

}
