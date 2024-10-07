package com.codingNinjas.carDealership;

public class Truck implements Car{
	
	String owner;

	@Override
	public String getInfo() {
		return "A Truck";
	}

	@Override
	public void setOwnerName(String name) {
		this.owner = name;
		
	}

	@Override
	public String getOwnerName() {
		return this.owner;
	}

}
