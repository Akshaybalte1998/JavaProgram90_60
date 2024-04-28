package akshay;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of baskeet ");
		int basketsize=sc.nextInt();
		Fruit[] basket=new Fruit[basketsize];
		int index=0;
	
		int choice;
		do {
			
			System.out.println("1.add mango\n2.add apples \n3.add orange \n4.Display names\n5.display name,colour,weight,taste\n"
					+ "" );
			
			
			System.out.println("enter a choice");
			
			choice=sc.nextInt();
			switch(choice)
			{
			   case 1:
				 basket[index]=new Mango("hapus",0.5,color.YELLOW);
		    	  index++;
		    	  System.out.println(" mango is added");
		    	  if(basketsize<=index)
		    	  {
		    		  System.out.println("basket is full");
		    	  }
		    	  break;
		    	  
			 case 2:
			      	basket[index]=new Apple("kasmire apples",1,color.RED);
			      	index++;
			      	System.out.println(" apples is added");
			        if(basketsize<=index)
			    	  {
			    		  System.out.println("basket is full");
			    	  }
			    	  break;
			    	  
			  case 3:
				      	basket[index]=new Orange("nagapur orange ",1,color.orange);
				      	index++;
				      	System.out.println(" orange is added");
				        if(basketsize<=index)
				    	  {
				    		  System.out.println("basket is full");
				    	  }
				    	  break;
	
			case 4:
				UtilityFruit.DisplayName(basket);
				
				break;
				
			case 5:
				UtilityFruit.displayAllDeatils(basket);
				
				break;
			
			
		
			case 9:
				System.out.println("exist");
				break;
			
			}
			
			
			
		
		}while(choice!=9);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
