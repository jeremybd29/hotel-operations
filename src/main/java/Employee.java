
//employee class stores employee details such as name, position, and salary
public class Employee {

    // backing variables
    private String name;
    private String role;
    private double hourlyWage;
    private int hoursWorked;

    // constructor to initialize employee object
    public Employee(String name, String role, double hourlyWage, int hoursWorked){
        this.name = name;
        this.role = role;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    //getters

    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public double getHourlyWage(){
        return hoursWorked;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    // derived getter to calculate total salary
    public double getTotalSalary() {
        return hourlyWage * hoursWorked;
    }

}
