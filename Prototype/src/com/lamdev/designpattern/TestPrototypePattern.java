package com.lamdev.designpattern;

public class TestPrototypePattern {

	public static void main(String[] args) {
		AccessControl accessControl = AccessControlProvider.getAccessControl("USER");
		User user = new User("Hoai Lam", "USER Level", accessControl);
		System.out.println(user.toString());
	}

}
