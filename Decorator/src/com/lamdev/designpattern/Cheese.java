package com.lamdev.designpattern;

public class Cheese extends PizzaDecorator{

	private final Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Cheese [0.9]";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.9;
	}

}
