// Abstract Class
abstract class Hospital {

   
    private String hospitalName;
    private String location;

    Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;
    }
    void displayHospitalInfo() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Location      : " + location);
    }
    abstract void calculateBill();
}

class Patient extends Hospital {

    int days;
    double chargePerDay;

    Patient(String hospitalName, String location, int days, double chargePerDay) {
        super(hospitalName, location);
        this.days = days;
        this.chargePerDay = chargePerDay;
    }
    void calculateBill() {
        double bill = days * chargePerDay;
        System.out.println("Total Bill : " + bill);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {

        Patient p = new Patient("City Hospital", "Pune", 5, 2000);

        p.displayHospitalInfo();
        p.calculateBill();
    }
}