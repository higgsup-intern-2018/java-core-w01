package session05.part01;

public class Invoice {
    private String productId;
    private String description;
    private int quantity;
    private double price;
    public Invoice(String Id , String description,int quantity,double price)
    {
        this.productId=Id;
        this.description=description;
        this.quantity =quantity;
        this.price=price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void displayInvoice()
    {
        System.out.println("Product : " +getProductId());
        System.out.println("Discription : " +getDescription());
        System.out.println("Quantity : " +getQuantity());
        System.out.println("Price : " +getPrice());
    }
    private double amount;
    public void getInvoiceAmount()
    {
        if (quantity<0)
        {
            quantity=0;
        }else if (price<0)
        {
            price=0.0;
        }else
        {
            amount=quantity*price;
            System.out.println("Sum amount : "+amount);
        }
    }
}
