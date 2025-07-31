package com.lamdev.designpattern;

public class Sicilian implements Pizza{

	@Override
	public String getDesc() {
		return "Sicilian";
	}

	@Override
	public double getPrice() {
		return 10.0;
	}

}
