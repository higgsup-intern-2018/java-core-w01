package com.higgsup.intern.w01.sec05;

public class Exercise3
{
    private String number;
    private String description;
    private int quantity;
    private double price;

    public Exercise3(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
        if(quantity > 0) {
            this.quantity = quantity;
        }
        if(price > 0) {
            this.price = price;
        }
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        if(quantity > 0)
        {
            this.quantity = quantity;
        }else{
            this.quantity = 0;
        }
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if(price > 0)
        {
            this.price = price;
        }else{
            this.price = 0;
        }
    }

    public double getInvoiceAmount()
    {
        return quantity * price;
    }

    public String toString()
    {
        return "Invoice information: \nNumber: " + number + "\nDescription: " + description + "\nQuantity: "
                + quantity + "\nPrice of item: " + price + "\nInvoice amount: " + getInvoiceAmount();
    }
}
