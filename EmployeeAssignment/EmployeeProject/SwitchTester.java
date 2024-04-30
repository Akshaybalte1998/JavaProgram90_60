package SwitchWithEmployee;

import java.util.Scanner;

public class SwitchTester {

	public static void main(String[] args) {
	/*size
		
		//1.add employee
			enter details
		//2.show employee
		//3.show my details
			ip->id
		//4.chnge my nam,e
			ip id name
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
	   Employee[] arr =new Employee[size];	
	   //int choice;
	   int counter=0;
	   while(true)
	   {
		   System.out.println("1.add employee");
		   System.out.println("2.Details employee");
		   System.out.println("3.finding employee details using id");
		   System.out.println("4.changing name of employee using id");
		   System.out.println("5.exist");
		   System.out.println("enter the choice");
		   int choice = scan.nextInt();
		 
		  switch(choice)
		  {
		  case 1:
			  if(counter<arr.length)
			  {
				 System.out.println("enter the id of emploee");
				 int id=scan.nextInt();
				 System.out.println("enter the name of employee");
				 String name=scan.next();
				 System.out.println("enter rollNUmber");
				 int rollNumber=scan.nextInt();
				// Employee emp=new Employee(id,name,rollNumber);
				 //for(int i=0;i<arr.length;i++)
				 
					 arr[counter]=new Employee(id,name,rollNumber);
				 
				 counter++;
			  }
			  else
			  {
				  System.out.println(" employee array is full");
			  }
			  break;
			  
		  case 2:
			  System.out.println("List of employees:");
			  for(Employee employee :arr)
			  {
				     if (employee !=null )
				     {
				          System.out.println(employee);
				     }
			  }
			  break;
		  
		  case 3:
			  System.out.println("enter the id of employee");
			  int searchId=scan.nextInt();
			  boolean found=false;
			  for(Employee employee :arr)
			  {
				  if(employee !=null && employee.getID()==searchId)
				  {
					System.out.println(employee);
					  found=true;
					  break;
				  }
				 
			  }
			  if(!found)
				  System.out.println("employee id is not found");
			  
			  break;
			  
		  case 4:
			  System.out.println("enter employee id");
			  int searchId1=scan.nextInt();
			 
			
			  boolean idFound=false;
			  for(Employee employee:arr)
			  {
				  if(employee !=null && employee.getID()==searchId1)
				  { System.out.println("enter a name for change");
				  String newName=scan.next();
					  employee.setName(newName);
					  System.out.println("name change succefully");
					  idFound=true;
					  break;
				  }
			  }
			  if(!idFound)
				  System.out.println("id is not founnd in employee");
			  break;
          case 5:
              System.out.println("Exiting program.");
              System.exit(0);
              break;
		  
		  
		  
		  }
		   
		   
		   
		   
		   
		   
		   
		   
	   }
		
		
		

	}

}
