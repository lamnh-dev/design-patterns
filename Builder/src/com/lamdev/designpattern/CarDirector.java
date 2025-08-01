package com.lamdev.designpattern;

public class CarDirector {
	
	private CarBuilder carBuilder;

	public CarDirector(CarBuilder carBuilder) {
		super();
		this.carBuilder = carBuilder;
	}
	
	public void build() {
		carBuilder.buildBodyStyle();
		carBuilder.buildBreaks();
		carBuilder.buildEngine();
		carBuilder.buildFuelType();
		carBuilder.buildPower();
		carBuilder.buildSeats();
		carBuilder.buildWindows();
	}

}
