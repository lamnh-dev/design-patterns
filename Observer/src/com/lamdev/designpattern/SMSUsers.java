package com.lamdev.designpattern;

public class SMSUsers implements Observer{

	private final Subject subject;
	private String desc;
	private final String userInfo; 
	
	
	public SMSUsers(Subject subject, String userInfo) {
		this.subject = subject;
		this.userInfo = userInfo;
	}

	@Override
	public void update(String desc) {
		this.desc = desc;
		display();
	}
	
	private void display() {
		System.out.println("["+userInfo+"]: " + desc);
	}

	@Override
	public void subcribe() {
		System.out.println("Subscribing " + userInfo + " to "+ subject.subjectDetails() + "...");
		this.subject.subcribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	@Override
	public void unSubcribe() {
		System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + "...");
		this.subject.unSubcribeObserver(this);
		System.out.println("Unsubscribed successfully.");
	}

}
