import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
public class Start
{
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		PcMarket pm=new PcMarket();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Market>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		boolean choice=true;
		
	while(choice)
	 {
			System.out.println("Select Your Option");
			System.out.println("1. Pc Shop Management");
			System.out.println("2. Employee Management");
			System.out.println("3. Component Management");
			System.out.println("4. Component Quantity Add-Sell");
			System.out.println("5. Exit");
		
		    System.out.println("Select Your Option: ");
		    int op=sc.nextInt();
		
/*op*/switch(op)
		 {
			   case 1://For Pc Shope
			        System.out.println("################################"); 
			        System.out.println("##You Select PcShop Management##");
					System.out.println("################################"); 
					System.out.println("Select Your Option");
			        System.out.println("1. Insert New PcShop");
					System.out.println("2. Remove Existing PcShop");
					System.out.println("3. Search a PcShop");
					System.out.println("4. Show All PcShop");
					System.out.println("5. Go Back");
					
					System.out.println("Select Your Option: ");
				    int c1=sc.nextInt();
					
	/*c1*/		switch(c1)
					{
					case 1: //Inseting PcShop*******************************************************************
					System.out.println("*********************"); 
			        System.out.println("**Insert New PcShop**");
					System.out.println("*********************");
					//Shop Info input
					System.out.println("Enter PcShop Name: ");
					String s1=sc.next();
					System.out.println("Enter PcShop No: ");
					String s2=sc.next();
			
					PcShop ps =new PcShop();
					ps.setName(s1);
					ps.setSid(s2);
					pm.insertShop(ps);
					break;
					
					case 2: //Removeing PcShop
					System.out.println("**************************"); 
			        System.out.println("**Remove Existing PcShop**");
					System.out.println("**************************");
					
					System.out.println("Enter PcShop No: ");
					String s3=sc.next();
					PcShop ps1=pm.SearchPcShop(s3);
					pm.removePcShop(ps1);
					break;
					
					case 3://Search PcShop
					System.out.println("*******************"); 
			        System.out.println("**Search a PcShop**");
					System.out.println("*******************");
					
					System.out.print("Enter PcShop No: ");
					String s4 = sc.next();
					
					PcShop ps2=pm.SearchPcShop(s4);
					if(ps2 != null)
					{
						ps2.showInfo();
						ps2.showAllComponent();
					}
					else
					{
						System.out.println("Shop Not Found");
					}
					break;
					
					case 4: //Show All pcShop
					System.out.println("********************"); 
			        System.out.println("** Show All PcShop**");
					System.out.println("********************");
					
					pm.showAllPcShops();
						  
					break;
					case 5:
					System.out.println("**************");
					System.out.println("**Going Back**");
					System.out.println("**************");
					
					break;
					default:
					System.out.println("***********");
					System.out.println("**Invalid**");
					System.out.println("***********");
					break;
					}
				
					
			        break;
		
               case 2://For Employee*************************************************************************
			         System.out.println("################################"); 
			         System.out.println("#You Select Employee Management#");
					 System.out.println("################################");
					 System.out.println("Select Your Option");
			         System.out.println("1. Insert New Employee");
					 System.out.println("2. Remove Existing Employee");
					 System.out.println("3. Search a Employee");
					 System.out.println("4. Show All Employee");
					 System.out.println("5. Go Back");
					 System.out.println("Select Your Option: ");
					 int c2=sc.nextInt();
					
		/*c2*/	 switch(c2) 
					{
					
					case 1://Employee Info input
					System.out.println("***********************"); 
			        System.out.println("**Insert New Employee**");
					System.out.println("***********************");
					
					System.out.println("Enter Employee Name: ");
					String eN=sc.next();
					System.out.println("Enter Employee ID: ");
					String eId=sc.next();
					System.out.println("Enter Employee Salary: ");
					double eS=sc.nextDouble();
					
					Employee em=new Employee();
					em.setName(eN);
	                em.setEmpId(eId);
	                em.setSalary(eS);
					pm.insertEmployee(em);
					break;
					case 2://Employee Removing
					System.out.println("****************************"); 
			        System.out.println("**Remove Existing Employee**");
					System.out.println("****************************");
					System.out.println("Enter Employee ID: ");
					String eId2=sc.next();
					Employee em2 =pm.searchEmployee(eId2);
					pm.removeEmployee(em2);
					break;
					case 3://Search Employee
					System.out.println("****************************"); 
			        System.out.println("**Search Existing Employee**");
					System.out.println("****************************");
					System.out.println("Enter Employee ID: ");
					String eId3=sc.next();
					Employee em3 =pm.searchEmployee(eId3);
					if(em3!=null)
					{
					em3.showInfo();
					}
					else
					{
						System.out.println("Employee not Found");
					}
					break;
					case 4:
					System.out.println("******************************"); 
			        System.out.println("**Show All Existing Employee**");
					System.out.println("******************************");
					pm.showAllEmployees();
					break;
					case 5:
					System.out.println("**************");
					System.out.println("**Going Back**");
					System.out.println("**************");
					break;
					default:
					System.out.println("***********");
					System.out.println("**Invalid**");
					System.out.println("***********");
					break;
					}
			         break;
					 
			    
			   case 3://For Component*******************************************************************************
			         System.out.println("#################################");
			         System.out.println("#You Select Component Management#");
					 System.out.println("#################################");
					 System.out.println("1. Insert New Component");
					 System.out.println("2. Remove Existing Component");
					 System.out.println("3. Search a Component");
					 System.out.println("4. Show All Component");
					 System.out.println("5. Go Back");
					 System.out.println("Select Your Option: ");
					 int c3=sc.nextInt();
					
		/*c3*/	  switch(c3) 
					{
					case 1://Insert Component
					System.out.println("***********************");
			        System.out.println("*Insert New Component**");
					System.out.println("***********************");
					System.out.println("Which Type of Component Do you Want?");
					System.out.println("1. Laptop Component ");
					System.out.println("2. PC Component ");
					System.out.println("3. Going Back");
					
					Component com= null;
					System.out.println("Select Your Option: ");
					int op1=sc.nextInt();
					
					if(op1==1)//For laptop Component*********************************************************************
					{
					System.out.println("Laptop Component Name: ");
					String comN = sc.next();
					System.out.println("Component Id: ");
					String comId = sc.next();
					System.out.println("Component Price: ");
					
					double comP = sc.nextDouble();
					System.out.println("Company Name: ");
					String comC = sc.next();
					
					LaptopComponent lc=new LaptopComponent();
					 lc.setName(comN);
	                 lc.setCid(comId);
	                 lc.setprice(comP);
					 lc.setCname(comC);
					 com=lc;
					
					}
					else if(op1==2) //For Pc Component****************************************************************
					{
					System.out.println("Pc Component Name: ");
					String comN1 = sc.next();
					System.out.println("Component Id: ");
					String comId1 = sc.next();
					System.out.println("Component Price: ");
					double comP1 = sc.nextDouble();
					
					System.out.println("Condition: ");
					String comC1 = sc.next();
					
					PcComponent pc=new PcComponent();
					 pc.setName(comN1);
	                 pc.setCid(comId1);
	                 pc.setprice(comP1);
					 pc.setCondition(comC1);
					 
					 com=pc;
					}
					else if(op1 == 3) //Going Back
					{
						System.out.println("Going Back");
					}
					else
					{
					System.out.println("Invalid");
					}
					if (com !=null)
					{
						
					System.out.print("Enter PcShop ID: ");
					String psId1 = sc.next();
					pm.SearchPcShop(psId1).insertComponent(com);
					}
					
					break;
					case 2: //Removing Component
					System.out.println("****************************");
			        System.out.println("*Remove Existing Component**");
					System.out.println("****************************");
					
					System.out.print("Enter PcShop No: ");
					String psId2 = sc.next();
					System.out.print("Enter component ID: ");
					String comId2 = sc.next();
					
					pm.SearchPcShop(psId2).removeComponent(pm.SearchPcShop(psId2).SearchComponent(comId2));
					break;
					
					case 3:
					System.out.println("*********************");
			        System.out.println("*Search a Component**");
					System.out.println("*********************");
					
					System.out.print("Enter PcShop No: ");
					String psId3 = sc.next();
					System.out.print("Enter Component ID: ");
					String comId3 = sc.next();
					Component com2=pm.SearchPcShop(psId3).SearchComponent(comId3);
					if(com2 != null)
							{
								com2.showInfo();
							}
					break;
					
					case 4: //Show All Component
					System.out.println("*********************");
			        System.out.println("*Show All Component**");
					System.out.println("*********************");
					
					System.out.print("Enter PcShop No: ");
					String psId4 = sc.next();
					
					pm.SearchPcShop(psId4).showAllComponent();
					break;
					 
					case 5:
					System.out.println("*************");
			        System.out.println("*Going Back**");
					System.out.println("*************");
					break;
					
					default:
					 System.out.println("##########");
			         System.out.println("#Inavlid##");
					 System.out.println("##########");
					break;
					}
			         break;
			   
			   case 4://Component Add-sell ***********************************************************
			          System.out.println("########################################");
			          System.out.println("#You Select Component Quantity Add-Sell#");
					  System.out.println("########################################");
					  System.out.println("1. Add Component");
					  System.out.println("2. Sell Component");
					  System.out.println("3. Go Back");
					  System.out.println("Select Your Option: ");
		 		      int c4=sc.nextInt();
					
		/*c4*/   switch(c4) //Add Component
					{
					case 1:
					System.out.println("****************");
			        System.out.println("*Add Component**");
					System.out.println("****************");
					
					System.out.print("Enter PcShop No: ");
					String psId5 = sc.next();
					System.out.print("Enter Component ID: ");
					String comId4= sc.next();
					System.out.print("Enter Amount: ");
					int amnt1 = sc.nextInt();
					
					if(amnt1>0)
						{
								PcShop ps3 =pm.SearchPcShop(psId5);
								Component com3 = ps3.SearchComponent(comId4);
								com3.addQuantity(amnt1);
						}
					
					break;
					case 2:
					System.out.println("*****************");
			        System.out.println("*Sell Component**");
					System.out.println("*****************");
					
					System.out.print("Enter PcShop No: ");
					String psId6 = sc.next();
					System.out.print("Enter Component ID: ");
					String comId5= sc.next();
					System.out.print("Enter Amount: ");
					int amnt2 = sc.nextInt();
					
					if(amnt2>0 && amnt2 <pm.SearchPcShop(psId6).SearchComponent(comId5).getAvailableQuantity())
						{
					
								PcShop ps3 =pm.SearchPcShop(psId6);
								Component com3 = ps3.SearchComponent(comId5);
								com3.sellQuantity(amnt2);
								

						}
					break;
					case 3:
					System.out.println("*************");
			        System.out.println("*Going Back**");
					System.out.println("*************");
					break;
					default:
					System.out.println("##########");
			        System.out.println("#Inavlid##");
					System.out.println("##########");
					break;
					}
			          break;
			   
			   case 5:
			          System.out.println("############################");
			          System.out.println("#You Exited From Management#");
					  System.out.println("############################");
					  choice=false; 
			          break;
				default :
				      System.out.println("################");
			          System.out.println("#Invalid Option#");
					  System.out.println("################");
					  break;
		   }
	   }
	}
}
	