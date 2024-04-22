package com.simlemenudriven;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling only courier class
		System.out.println("calling only courier class");
		Courier C1=new Courier();
		System.out.println((C1));
		
		Courier c2=new Courier(2,"ajay",50000);
		System.out.println(c2);

		
		//calling onlyaddress class
		System.out.println("calling onlyaddress class");
		Address a1=new Address("pune",612155);
		System.out.println(a1);
		
		
		
		//taking  input from user  courier data
		System.out.println("taking  input from user courier   data  ");
		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter the id");
		int id =scan.nextInt();
		
		System.out.println("enter name");
		String name =scan.next();
		System.out.println("enter the salary");
		double salary =scan.nextDouble();
		
		Courier c5=new Courier(id,name,salary);
		System.out.println(c5);
		
		
		//taking input from user address 
		System.out.println("taking input from user address ");
		System.out.println("enter name city name");
		String city =scan.next();
		System.out.println("enter the  pincode");
		int pincode =scan.nextInt();
		Address a5 = new Address(city,pincode);
		System.out.println(a5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}


/*
 *    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter courier id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter courier name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter courier salary:");
        double salary = scanner.nextDouble();
        
        // Create Courier object using user input
        Courier courier = new Courier(id, name, salary);
 */
