package classes;
import java.lang.*;
public class Employee
{
	private String name;
	private String empId;
	private double salary;
	
	
	public void setName(String name){this.name = name;}
	public void setEmpId(String empId){this.empId = empId;}
	public void setSalary(double salary){this.salary = salary;}
	
	 
	public String getName(){return name;}
	public String getEmpId(){return empId;}
	public double getSalary(){return salary;} 
	
	public void showInfo()
	{
		        System.out.println("Employee Name: "+ name );
				System.out.println("Employee Id: "+ empId );
				System.out.println("Employee Salary: "+salary );
				System.out.println();
	}
}