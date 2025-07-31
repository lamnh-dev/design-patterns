package com.lamdev.designpattern;

public class RoboticCook implements RoboticState{

	private Robot robot;
	
	public RoboticCook(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void walk() {
		System.out.println("Walking ...");
		robot.setRobotState(robot.getRobotOn());
		
	}

	@Override
	public void cook() {
		System.out.println("Cooking ...");
	}

	@Override
	public void off() {
		System.out.println("Can not switched off while cooking ...");
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

}
