// Parent Class
class Employee {

    // Private Data Members
    private int employeeId;
    private String employeeName;
    private double salary;

    // Constructor
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Display Method
    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

// Child Class
class Manager extends Employee {

    // Private Data Members
    private String department;
    private int teamSize;

    // Constructor
    Manager(int employeeId, String employeeName, double salary,
            String department, int teamSize) {

        super(employeeId, employeeName, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    // Display Method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department : " + department);
        System.out.println("Team Size : " + teamSize);
    }
}

// Child Class
class Developer extends Employee {

    // Private Data Members
    private String programmingLanguage;
    private int experience;

    // Constructor
    Developer(int employeeId, String employeeName, double salary,
              String programmingLanguage, int experience) {

        super(employeeId, employeeName, salary);
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
    }

    // Display Method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Experience : " + experience + " Years");
    }
}

// Main Class
public class EmployeeManagment{

    public static void main(String[] args) {

        // Creating Manager Object
        Manager manager = new Manager(
                101,
                "Rahul",
                75000,
                "HR",
                10
        );

        // Creating Developer Object
        Developer developer = new Developer(
                102,
                "Amrish",
                65000,
                "Java",
                3
        );

        System.out.println("===== Manager Details =====");
        manager.displayDetails();

        System.out.println();

        System.out.println("===== Developer Details =====");
        developer.displayDetails();
    }
}