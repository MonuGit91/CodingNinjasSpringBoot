package com.rahuMohan.testingSpringDemo;

public class LongTable implements Table {
	
	double height;
	double length;
	
	public LongTable() {
		this.height = 40.5;
		this.length = 100.5;
	}

	@Override
	public String showDetails() {
		return "the table has length"+ this.length + " height "+ this.height;
	}

}
