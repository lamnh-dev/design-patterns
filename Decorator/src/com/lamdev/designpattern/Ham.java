package com.lamdev.designpattern;

public class Ham extends PizzaDecorator{

	private final Pizza pizza;
	
	public Ham(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Ham [2.0]";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 2.0;
	}

}
