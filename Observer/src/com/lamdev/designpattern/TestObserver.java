package com.lamdev.designpattern;

import java.util.ArrayList;

public class TestObserver {

	public static void main(String[] args) {
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match [2025JU17]");
		Observer observer = new SMSUsers(subject, "Hoai Lam [TPHCM]");
		observer.subcribe();
		
		System.out.println();
		
		Observer observer2 = new SMSUsers(subject, "Lam Nguyen [Long An]");
		observer2.subcribe();
		
		Commentary cObject = (Commentary) subject;
		cObject.setDesc("Welcome to live soccer match");
		cObject.setDesc("Current score 0-0");
		
		System.out.println();
		
		observer2.unSubcribe();
		
		System.out.println();
		
		cObject.setDesc("It is a goal!");
		cObject.setDesc("Current score 1-0");
		
		System.out.println();
		
		Observer observer3= new SMSUsers(subject,"Marrie [Paris]");
		observer3.subcribe();
		
		System.out.println();
		
		cObject.setDesc("It’s another goal!!");
		cObject.setDesc("Half-time score 2-0");
	}

}
