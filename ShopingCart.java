class Product{
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    Product(int productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public int getproductId(){
        return productId;
    }
    public String getproductName(){
        return productName;
    }
    public double getprice(){
        return price;
    }
    public int getquantity(){
        return quantity;
    }
    public void setproductId(int productId){
        this.productId = productId;
    }
    public void setproductName(String productName){
        this.productName = productName;
    }
    public void setprice(double price){
        this.price = price;
    }
    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    public double calculateTotal(){
        return price * quantity;
    }
    public void displayInvoice(){
        System.out.println("\n----- Invoice -----");
        System.out.println("Product ID   : " + productId); 
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price  : " + calculateTotal());
        System.out.println("-------------------");
    }
}
public class ShopingCart{
    
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 50000.0, 2);
        Product product2 = new Product(2, "Smartphone", 20000.0, 3);
        product1.displayInvoice();
        product2.displayInvoice();
      

       
    }
}
