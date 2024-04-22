package com.containmentProgram;

public class EmployeeAddress {
	private String city;
	private int pincode;
	
	public EmployeeAddress(String city,int pincode)
	{
		this.city = city;
		this.pincode=pincode;
	}
	
	@Override 
	public String toString()
	{
		return "city: "+city+ " pincode :"+pincode;
	}
}
