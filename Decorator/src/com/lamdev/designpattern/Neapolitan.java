package com.lamdev.designpattern;

public class Neapolitan implements Pizza{

	@Override
	public String getDesc() {
		return "Neapolitan";
	}

	@Override
	public double getPrice() {
		return 11.0;
	}

}
