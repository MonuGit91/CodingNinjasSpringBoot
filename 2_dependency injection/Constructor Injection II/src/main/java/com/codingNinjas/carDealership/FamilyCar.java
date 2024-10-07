package com.codingNinjas.carDealership;

public class FamilyCar implements Car {
     
	String owner;

	@Override
	public String getInfo() {
		return "A family Car";
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
