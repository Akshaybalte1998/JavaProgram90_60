package com.containmentProgram;

public class CourierEmployee {

	private int id;
	private String name;
	private double salary;
	private EmployeeAddress empadd;
	
   
	public CourierEmployee(int id , String name , double salary,EmployeeAddress empadd)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.empadd=empadd;
	}
	
	@Override
	public String toString()
	{
		return "id: "+id+
				" name: "+name+
				" salary: "+salary+" "+empadd;
	}
	
	
}
