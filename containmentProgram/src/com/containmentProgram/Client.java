package com.containmentProgram;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmployeeAddress empadd =new  EmployeeAddress("pune ",145301);
		CourierEmployee cemp1 = new CourierEmployee(1,"akshay",90000.00,empadd);
		System.out.println(cemp1);
		
		CourierEmployee cemp2 =new CourierEmployee(2,"aman",909009,new EmployeeAddress("pune ",3556));
		System.out.println(cemp2);
	}

}
