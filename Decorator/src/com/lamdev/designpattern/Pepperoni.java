package com.lamdev.designpattern;

public class Pepperoni extends PizzaDecorator{

	private final Pizza pizza;
	
	public Pepperoni(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Pepperoni [0.5]";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.5;
	}

}
