class Vehicle {

    // Private Data Members
    private String vehicleName;
    private double rentPerDay;

    // Constructor
    Vehicle(String vehicleName, double rentPerDay) {
        this.vehicleName = vehicleName;
        this.rentPerDay = rentPerDay;
    }

    // Getter
    public double getRentPerDay() {
        return rentPerDay;
    }

    // Display Method
    public void display() {
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Rent Per Day : " + rentPerDay);
    }
}

// Child Class
class Car extends Vehicle {

    Car(String vehicleName, double rentPerDay) {
        super(vehicleName, rentPerDay);
    }

    public void calculateRentalCost() {
        double cost = getRentPerDay() * 5;
        System.out.println("Car Rental Cost for 5 Days : " + cost);
    }
}

// Child Class
class Bike extends Vehicle {

    Bike(String vehicleName, double rentPerDay) {
        super(vehicleName, rentPerDay);
    }

    public void calculateRentalCost() {
        double cost = getRentPerDay() * 5;
        System.out.println("Bike Rental Cost for 5 Days : " + cost);
    }
}

// Main Class

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car car = new Car("Swift", 1500);
        Bike bike = new Bike("Activa", 500);

        System.out.println("Car Details");
        car.display();
        car.calculateRentalCost();

        System.out.println();

        System.out.println("Bike Details");
        bike.display();
        bike.calculateRentalCost();
    }
}