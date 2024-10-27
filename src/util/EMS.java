package util;

import employee.Employee;
import factory.EmployeeFactory;
import manager.EmployeeManager;

public 
/**
 * This class represents the EMS entity in the system.
 * 
 * @author Igwilo Chidumebi
 */
class EMS {
    public static void main(String[] args) {
        EmployeeManager.getInstance().addEmployee(EmployeeFactory.createEmployee(
                    "PartTime", 1, "Igwilo", "Chidumebi", "C", 23, 4));
        EmployeeManager.getInstance().addEmployee(EmployeeFactory.createEmployee(
                    "PartTime", 2, "Udeani", "Gossy", "L", 13, 124));
        EmployeeManager.getInstance().addEmployee(EmployeeFactory.createEmployee(
                    "FullTime", 3, "Bonny", "Brown", "E" , 24, 143));
        EmployeeManager.getInstance().addEmployee(EmployeeFactory.createEmployee(
                    "FullTime", 4, "Adilo", "Stephanie", "C", 3, 144));
        
        
        for (Employee employee: EmployeeManager.getInstance().getEmployees()) {
            employee.clockIn();
            employee.clockOut();
            employee.trackWorkHours();
        }
    }
}
