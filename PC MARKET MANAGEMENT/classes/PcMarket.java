package classes;
import java.lang.*;
import interfaces.*;

public class PcMarket implements PcShopOperation,EmployeeOperation
{
	private PcShop pcshops[] = new PcShop[500];
	private Employee employees[] = new Employee[100];
	
	public void insertShop(PcShop ps)
	{
		int flag = 0;
		
		for(int i=0; i<pcshops.length; i++)
		{
			if(pcshops[i] == null)
			{
				pcshops[i] = ps;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Pc Shop Inserted");
		}
		else
		{
			System.out.println("Pc Shop Can Not be Inserted");
		}
	}
	public void removePcShop(PcShop ps)
	{
		int flag = 0;
		
		for(int i=0; i<pcshops.length; i++)
		{
			if(pcshops[i] == ps)
			{
				pcshops[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("PcShop Removed");
		}
		else
		{
			System.out.println("PcShop Can Not be Removed");
		}
	}
	public void showAllPcShops()
	{
		for(int i=0; i<pcshops.length; i++)
		{
			if(pcshops[i]!= null)
			{
				pcshops[i].showInfo();
				System.out.println("*************************");
				pcshops[i].showAllComponent();
				System.out.println("**************************");
				System.out.println();
			}
		}
	}
	public PcShop SearchPcShop(String sid)
	{
		for(int i=0; i<pcshops.length; i++)
		{
			if(pcshops[i] != null)
			{
				if(pcshops[i].getSid().equals(sid))
				{
					return pcshops[i];
					
				}
			}
		}
		return null;
	}
	
	
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Employee Can Not be Inserted");
		}
	}
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Removed");
		}
		else
		{
			System.out.println("Employee Can Not be Removed");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("#####################################");
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i]!= null)
			{
				employees[i].showInfo();
			}
		}
		System.out.println("#####################################");
	}
	public Employee searchEmployee(String empId)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return null;
	}
}