package com.lamdev.designpattern;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		DisplayService displayService = new OrderDisplayService();
		displayService.display();
		
		displayService = new ErrorDisplayService();
		displayService.display();
		
		displayService = new FeedbackDisplayService();
		displayService.display();
	}

}
