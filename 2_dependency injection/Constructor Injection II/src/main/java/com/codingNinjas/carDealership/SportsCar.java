package com.codingNinjas.carDealership;

public class SportsCar implements Car {
	
	String owner;

	@Override
	public String getInfo() {
		return "A Sports Car";
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
