package com.lamdev.designpattern;

public class RoboticOff implements RoboticState{

	private Robot robot;
	
	public RoboticOff(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void walk() {
		System.out.println("Walking ...");
		robot.setRobotState(robot.getRobotOn());	
	}

	@Override
	public void cook() {
		System.out.println("Can not cook in Off state ...");
	}

	@Override
	public void off() {
		System.out.println("Already switched off ...");
	}
	
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

}
