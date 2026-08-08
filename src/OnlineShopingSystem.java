import java.sql.SQLOutput;

/*Q3. Online Shopping System
  Create Product, Electronics, and Clothing classes. Display details and calculate bill.*/
class Product{
    private String ProductName;
    private double Price;
    private int Quantity;

    Product(String ProductName, double Price, int Quantity){
        this.ProductName = ProductName;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public double getPrice(){
        return Price;
    }
    public int getQuantity(){
        return Quantity;
    }

    public void display(){
        System.out.println("Product Name : " + ProductName);
        System.out.println("Price : " + Price);
    }
}
class Electronics extends Product{

    Electronics( String ProductName, double Price, int Quantity){
        super(ProductName, Price, Quantity);
    }

    public void calculateBill(){
        double cost = getPrice() * getQuantity();
        System.out.println("Total Payable Amount : " +cost);
    }
}
class Clothing extends Product{

    Clothing( String ProductName, double Price, int Quantity){
        super(ProductName, Price, Quantity);
    }
    public void calculateBill() {
        double cost = getPrice() * getQuantity();
        System.out.println("Total Payable Amount : " +cost);
    }
}

public class OnlineShopingSystem {

    public static void main(String[] args) {

        Electronics e = new Electronics("Laptop",50000,2);
        Clothing c = new Clothing("Jeans",1200, 2);

        System.out.println("========Your Bill========");


        System.out.println("Electronics Product");
        e.display();
        e.calculateBill();

        System.out.println();

        System.out.println("Clothing Products");
        c.display();
        c.calculateBill();
    }
}
