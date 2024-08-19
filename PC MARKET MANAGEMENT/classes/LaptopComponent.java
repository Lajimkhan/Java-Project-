package classes;
import java.lang.*;
public class LaptopComponent extends Component
{
	private String cName; //Company Name
	
	public void setCname(String cName){this.cName = cName;}
	
	public String getCname(){return cName;}
	public void showInfo()
	{
		System.out.println("Component Name: " +name);
		System.out.println("Component ID: "+cid);
		System.out.println("Price: "+price);
		System.out.println("Company Name: "+cName);
		System.out.println();
	}
}