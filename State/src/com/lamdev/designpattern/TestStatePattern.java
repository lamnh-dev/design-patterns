package com.lamdev.designpattern;

public class TestStatePattern {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.walk();
		robot.cook();
		robot.off();
		robot.walk();
		robot.off();
		robot.cook();
	}

}
