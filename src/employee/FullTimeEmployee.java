package employee;

public 
/**
 * This class represents the FullTimeEmployee entity in the system.
 * 
 * @author Auto-generated
 */
class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {super();}

    public FullTimeEmployee(int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {System.out.println("(Full time)" + this.getName() + " clocked in!");}

    @Override
    public void clockOut() {System.out.println("(Full time) " + this.getName() + " clocked out!");}

    @Override
    public void trackWorkHours() {System.out.println("Tracking hours for (Full time) employee " + this.getName());}
}
