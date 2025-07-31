package com.lamdev.designpattern;

public class AccessControl implements Prototype{

	private String controlLevel;
	private String access;
	
	public AccessControl(String controlLevel, String access) {
		super();
		this.controlLevel = controlLevel;
		this.access = access;
	}
	public String getControlLevel() {
		return controlLevel;
	}
	public void setControlLevel(String controlLevel) {
		this.controlLevel = controlLevel;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	
	@Override
	public AccessControl clone() {
		try {
			return (AccessControl) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
