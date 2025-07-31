package com.lamdev.designpattern;

public class FeedbackDisplayService extends DisplayService{

	@Override
	public XMLParser getParser() {
		return new FeedbackXMLParser();
	}

}
