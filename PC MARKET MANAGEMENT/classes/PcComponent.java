package classes;
import java.lang.*;
public class PcComponent extends Component
{
	private String condition; //Component name;
	
	public void setCondition(String condition)
	{
		this.condition =condition;
	}
	public String getCondition()
	{
		return condition;
	}
	public void showInfo()
	{
		System.out.println("Component Name: " +name);
		System.out.println("Product ID: "+cid);
		System.out.println("Price: "+price);
		System.out.println("Component Name: "+ condition);
		System.out.println();
	}
}