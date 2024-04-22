package com.simlemenudriven;

public class Courier {
	
	private int id;
	private String name;
	private double salary;
	
	public Courier()
	{
		id=100;
		name="akshay";
		salary=70000.00;
	}
   
	public Courier(int id , String name , double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString()
	{
		return "id: "+id+
				" name: "+name+
				" salary: "+salary;
	}
}
