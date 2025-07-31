package com.lamdev.designpattern;

public class TestAbstractFactoryMethodPattern {

	public static void main(String[] args) {
		AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NY");
		XMLParser parser = parserFactory.getInstance("ORDER");
		String msg="";
		msg = parser.parse();
		System.out.println(msg);
		System.out.println("************************************");
		parserFactory = ParserFactoryProducer.getFactory("TW");
		parser = parserFactory.getInstance("FEEDBACK");
		msg = parser.parse();
		System.out.println(msg);
	}

}
