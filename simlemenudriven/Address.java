package com.simlemenudriven;

public class Address {

	
	private String city;
	private int pincode;
	
	public Address(String city,int pincode)
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
