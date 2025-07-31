package com.lamdev.designpattern;

public abstract class PizzaDecorator implements Pizza{
	@Override
	public String getDesc() {
		return "Topping";
	}
}
