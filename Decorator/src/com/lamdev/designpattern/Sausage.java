package com.lamdev.designpattern;

public class Sausage extends PizzaDecorator{

	private final Pizza pizza;
	
	public Sausage(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+ ", Sausage [0.6]";
	}
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.6;
	}

}
