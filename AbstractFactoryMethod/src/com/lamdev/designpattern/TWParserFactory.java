package com.lamdev.designpattern;

public class TWParserFactory implements AbstractParserFactory{

	@Override
	public XMLParser getInstance(String parserType) {
		switch (parserType) {
		case "FEEDBACK":
			return new FeedbackXMLParser();
		case "ORDER":
			return new OrderXMLParser();
		case "ERROR":
			return new ErrorXMLParser();
		}
		return null;
	}

}
