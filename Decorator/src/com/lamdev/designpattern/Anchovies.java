package com.lamdev.designpattern;

public class Anchovies extends PizzaDecorator{

	private final Pizza pizza;
	
	public Anchovies(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Anchovies [1.5]";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 1.5;
	}

}
