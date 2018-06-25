package com.higgsup.intern.w01.sec05;

import java.util.Scanner;

public class Invoice {
    private String Id;
    private String Description;
    private int quantity;

    public String getId()  {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public Invoice(String Id, String Description , int quantity , double price ){
        this.Id = Id;
        this.Description = Description;
        this.quantity = quantity;
        this.price   = price;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã: ");
        Id = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        Description = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        quantity = sc.nextInt();
        System.out.println("Nhập giá: ");
        price = sc.nextDouble();
    }

    public void Display(){
        System.out.println("Mã sản phẩm là: "+this.Id);
        System.out.println("Mô tả sản phẩm: "+this.Description);
        System.out.println("Số lượng sản phẩm: "+this.quantity);
        System.out.println("Giá sản phẩm: "+this.price);
        System.out.println("Số tiền sản phẩm là: "+this.getInvoiceAmount());
    }

    public Invoice(){}

    public double getInvoiceAmount(){
        double amount = quantity * price;
        return amount;
    }


}
