package manager;

import employee.Employee;
import java.util.ArrayList;
import java.util.List;

public 
/**
 * This class represents the EmployeeManager entity in the system.
 * 
 * @author Igwilo Chidumebi
 */
class EmployeeManager {
    private static final EmployeeManager employeeManager = new EmployeeManager();
    private final List<Employee> employees = new ArrayList<>();

    private EmployeeManager() {}

    public static EmployeeManager getInstance() {return employeeManager;}

    public boolean addEmployee(Employee employee) {return this.employees.add(employee);}

    public boolean removeEmployee(Employee e) {return this.employees.remove(e);}

    public List<Employee> getEmployees() {return this.employees;}
    
}
