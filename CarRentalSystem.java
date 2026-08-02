class Car {
    
    private int carNumber;
    private String brand;
    private int PricePerDay;
    private int days;

    Car(int carNumber, String brand, int PricePerDay, int days){
        this.carNumber = carNumber;
        this.brand = brand;
        this.PricePerDay = PricePerDay;
        this.days = days;
    }
    public int getcarNumber(){
        return carNumber;
    }
    public String getbrand(){
        return brand;
    }
    public int getPricePerDay(){
        return PricePerDay;
    }
    public int getdays(){
        return days;
    }
    public void setcarNumber(int carNumber){
        this.carNumber = carNumber;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
    public void setPricePerDay(int PricePerDay){
        this.PricePerDay = PricePerDay;
    }
    public void setdays(int days){
        this.days = days;
    }
    public void CalculateRent(){
        int totalrent = PricePerDay * days;
        System.out.println("\n----- Rent Details -----");
        System.out.println("Car Number   : " + carNumber); 
        System.out.println("Brand        : " + brand);
        System.out.println("Price Per Day: " + PricePerDay);
        System.out.println("Days         : " + days);
        System.out.println("Total Rent   : " + totalrent);
    }
    public void displayCar(){
        System.out.println("\n----- Car Details -----");
        System.out.println("Car Number   : " + carNumber); 
        System.out.println("Brand        : " + brand);
        System.out.println("Price Per Day: " + PricePerDay);
        System.out.println("Days         : " + days);
    }

}
 
public class CarRentalSystem{
    
    public static void main(String[] args) {
        Car car1 = new Car(101, "Toyota", 3000, 3);
        car1.displayCar();
        car1.CalculateRent();

        Car car2 = new Car(102, "Honda", 2000, 5);
        car2.displayCar();
        car2.CalculateRent();
    }
}
