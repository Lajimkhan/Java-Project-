package classes;
import java.lang.*;
import interfaces.*;
public class PcShop implements ComponentOperation
{
	private String name;
	private String sid;
	private Component components[] = new Component[500];
	
	
	public void setName(String name){this.name = name;}
	public void setSid(String sid){this.sid = sid;}
	
	
	public String getName(){return name;}
	public String getSid(){return sid;}
	
	
	public void showInfo()
	{
		 System.out.println("************************");
		 System.out.println("Pc Shop Name: "+this.name );
		 System.out.println("Pc Shop No: "+this.sid );
	}
	
	public void insertComponent(Component c)
	{
		int flag = 0;
		for(int i=0; i<components.length; i++)
		{
			if(components[i] == null)
			{
				components[i] = c;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Component Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeComponent(Component c)
	{
		int flag = 0;
		for(int i=0; i<components.length; i++)
		{
			if(components[i] == c)
			{
				components[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Product Removed");}
		else{System.out.println("Can Not Remove");}
	}
	
	public void showAllComponent()
	{
		for(int i=0; i<components.length; i++)
		{
			if(components[i]!= null)
			{
				components[i].showInfo();
			}
		}
	}
	
	public Component SearchComponent(String cid)
	{
		for(int i=0; i<components.length; i++)
		{
			if(components[i] != null)
			{
				if(components[i].getcid().equals(cid))
				{
					return components[i];
				}
			}
		}
		return null;
	}
}