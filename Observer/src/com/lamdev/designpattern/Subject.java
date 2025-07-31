package com.lamdev.designpattern;

public interface Subject {
	
	void subcribeObserver(Observer observer);
	void unSubcribeObserver(Observer observer);
	void notifyObserver();
	String subjectDetails();
}
