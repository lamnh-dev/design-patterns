package com.lamdev.designpattern;

public abstract class DisplayService {
	public void display() {
		XMLParser xmlParser = getParser();
		String msg = xmlParser.parse();
		System.out.println(msg);
	};
	
	public abstract XMLParser getParser();
}
