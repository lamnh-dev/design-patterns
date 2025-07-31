package com.lamdev.designpattern;

public class Robot implements RoboticState{
	
	private RoboticState robotOn;
	private RoboticState robotCook;
	private RoboticState robotOff;
	
	private RoboticState robotState;

	public Robot() {
		super();
		this.robotOn = new RoboticOn(this);
		this.robotCook = new RoboticCook(this);
		this.robotOff = new RoboticOff(this);
		
		this.robotState = robotOn;
	}

	public void setRobotState(RoboticState robotState) {
		this.robotState = robotState;
	}
	
	@Override
	public void walk() {
		robotState.walk();
		
	}

	@Override
	public void cook() {
		robotState.cook();
		
	}

	@Override
	public void off() {
		robotState.off();
	}


	public RoboticState getRobotOn() {
		return robotOn;
	}


	public void setRobotOn(RoboticState robotOn) {
		this.robotOn = robotOn;
	}


	public RoboticState getRobotCook() {
		return robotCook;
	}


	public void setRobotCook(RoboticState robotCook) {
		this.robotCook = robotCook;
	}


	public RoboticState getRobotOff() {
		return robotOff;
	}


	public void setRobotOff(RoboticState robotOff) {
		this.robotOff = robotOff;
	}


	public RoboticState getRobotState() {
		return robotState;
	}

}
