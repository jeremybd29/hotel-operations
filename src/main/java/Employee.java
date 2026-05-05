
//employee class stores employee details such as name, position, and salary
public class Employee {

    // backing variables
    private String name;
    private String role;
    private double hourlyWage;
    private int hoursWorked;
    private int startTime;

    // constructor to initialize employee object
    public Employee(String name, String role, double hourlyWage, int hoursWorked){
        this.name = name;
        this.role = role;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.startTime = -1; //-1 means not clocked in
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
    // derived getter calculates total pay based on hours
    public double getTotalPay() {
        return hourlyWage * hoursWorked;
    }
    // time tracker
    // records time the employee clocks in.
    public void punchIn(int time){
        if (startTime == -1){
            startTime = time;
        } else {
            System.out.println("Employee is already clocked in.");
        }
    }
    //calculate hours worked and adds them to total hours
    public void punchOut(int time){
        if (startTime != -1){
            int hoursWorkedThisShift = time - startTime;
            hoursWorked += hoursWorkedThisShift;
            startTime = -1; // reset start time for next shift
        } else {
            System.out.println("Employee is not clocked in.");
        }

    }

}
