package com.lamdev.designpattern;

import java.util.List;

public class CommentaryObject implements Subject, Commentary{
	
	private final List<Observer> observers;
	private String desc;
	private final String subjectDetails;
	
	public CommentaryObject(List<Observer> observers, String subjectDetails) {
		this.observers = observers;
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void subcribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubcribeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		System.out.println();
		observers.forEach(observer -> observer.update(desc));
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObserver();
	}
	
	@Override
	public String subjectDetails() {
		return subjectDetails;
	}

}
