package com.lamdev.designpattern;

public class NYParserFactory implements AbstractParserFactory{

	@Override
	public XMLParser getInstance(String parserType) {
		switch (parserType) {
		case "FEEDBACK":
			return new NYFeedbackXMLParser();
		case "ORDER":
			return new NYOrderXMLParser();
		case "ERROR":
			return new NYErrorXMLParser();
		}
		return null;
	}

}
