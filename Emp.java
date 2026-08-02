// Practical 3: Employee Salary Management 
class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateHRA(){
        return basicSalary * 0.20;
    }

    public double calculateGrossSalary(){
        double hra = calculateHRA();
        double da = basicSalary * 0.15;
        return basicSalary + hra + da;
    }
}
public class Emp{
    
     public static void main(String[] args) {
        
        Employee emp1 = new Employee(1,"Shreyash", 50000);
        
        
        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Employee Name: " + emp1.getEmployeeName());
        System.out.println("Basic Salary: " + emp1.getBasicSalary());
        System.out.println("HRA: " + emp1.calculateHRA());
        System.out.println("Gross Salary: " + emp1.calculateGrossSalary());
    }

}
