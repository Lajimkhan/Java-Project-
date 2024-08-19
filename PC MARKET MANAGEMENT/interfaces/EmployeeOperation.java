package interfaces;
import classes.*;
public interface EmployeeOperation{
	public void insertEmployee(Employee e);
	public void removeEmployee(Employee e);
	public void showAllEmployees();
	public Employee searchEmployee(String empId);
}