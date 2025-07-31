package com.lamdev.designpattern;

public class User {
	
	private String username;
	private String level;
	private AccessControl accessControl;
	
	public User(String username, String level, AccessControl accessControl) {
		super();
		this.username = username;
		this.level = level;
		this.accessControl = accessControl;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public AccessControl getAccessControl() {
		return accessControl;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", level=" + level + ", accessControl=" + accessControl + "]";
	}
}
