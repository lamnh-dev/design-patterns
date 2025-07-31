package com.lamdev.designpattern;

public class RoboticOn implements RoboticState{

	private Robot robot;
	
	public RoboticOn(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void walk() {
		System.out.println("Walking ...");
		
	}

	@Override
	public void cook() {
		System.out.println("Cooking ...");
		robot.setRobotState(robot.getRobotCook());
	}

	@Override
	public void off() {
		System.out.println("Off ...");
		robot.setRobotState(robot.getRobotOff());	
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
}
