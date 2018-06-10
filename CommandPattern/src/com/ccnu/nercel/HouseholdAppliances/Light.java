package com.ccnu.nercel.HouseholdAppliances;

public class Light implements HouseholdAppliances{

	private String name;
	
	public Light(String name) {
		this.name=name;
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("turn on the "+name+" Light");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("turn off the "+name+" Light");
	}

}
