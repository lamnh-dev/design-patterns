package com.lamdev.designpattern;

public class TestDecoratorPattern {
	
	public static void main(String[] args) {
		Pizza pizza = new Neapolitan();
		pizza = new Ham(pizza);
		pizza = new Cheese(pizza);
		pizza = new Sausage(pizza);
		pizza = new Anchovies(pizza);
		
		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + pizza.getPrice());
	}

}
