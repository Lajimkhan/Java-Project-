package classes;
import java.lang.*;
import interfaces.*;
public abstract class Component implements QuantityAddSell
{
	
	protected String name;
	protected String cid; //Componenet id ;
	protected int availableQuantity;
	protected double price;
	
	
	public void setName(String name){this.name = name;}
	public void setCid(String cid){this.cid = cid;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	public void setprice(double price){this.price = price;}
	
	public String getcid(){return cid;}
	public String getName(){return name;}
	public int getAvailableQuantity(){return availableQuantity;}
	public double getprice(){return price;}
	
	public abstract void showInfo(); //AbstractMethod of show info
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Quantity: "+availableQuantity);
			System.out.println("Add Quantity: "+ amount);
			availableQuantity += amount;
			System.out.println("Current Quantity: "+ availableQuantity);
		}
		else
		{
			System.out.println("Can Not Add Quantity");
		}
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<availableQuantity)
		{
			System.out.println("Previous Quantity:	"+ availableQuantity);
			System.out.println("Sell Quantity:	"+ amount);
			availableQuantity -= amount;
			System.out.println("Current Quantity:	"+ availableQuantity);
		}
		else
		{
			System.out.println("Error Sell Quantity. Try again.");
		}
	}
	
	
}