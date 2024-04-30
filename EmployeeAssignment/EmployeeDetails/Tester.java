package employee;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		/*size
		
		//1.add employee
			enter details
		//2.show employee
		//3.show my details
			ip->id
		//4.chnge my nam,e
			ip id name
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a id");
		int id=scan.nextInt();
		System.out.println("enter the name");
		String name =scan.next();
		System.out.println("enter the rollNumber");
		int rollNumber=scan.nextInt();

		EMployeeInfo emp1=new EMployeeInfo(id,name,rollNumber);
	System.out.println(emp1);
	
	EMployeeInfo emp2 =new EMployeeInfo(2,"balte",899);
System.out.println(emp2);
	

EMployeeInfo emp3 = new EMployeeInfo();
emp3.setName("pankaj");
emp3.setId(4);
emp3.setRollNumber(56);
System.out.println(" all info :"+ "id: "+emp3.getID()+"name: "+emp3.getName()+"RollNUmber"+emp3.getRollNumber());


	}

}
