package builder;

import employee.Employee;

public 
/**
 * This class represents the EmployeeDirector entity in the system.
 * 
 * @author Igwilo Chidumebi
 */
class EmployeeDirector {
    public static Employee buildEmployee(EmployeeBuilder builder, int id, String name, String department, String role, double workingHoursPerWeek, double salary) {
        return builder.setID(id).setName(name).setDepartment(department).setRole(role).setWrkingHoursPerWeek(workingHoursPerWeek).setSalary(salary).getEmployee();
    }
}
