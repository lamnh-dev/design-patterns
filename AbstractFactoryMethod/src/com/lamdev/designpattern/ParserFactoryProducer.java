package com.lamdev.designpattern;

public final class ParserFactoryProducer {

	private ParserFactoryProducer() {
		throw new AssertionError();
	}
	
	public static AbstractParserFactory getFactory(String factoryType) {
		switch (factoryType) {
		case "NY":
			return new NYParserFactory();
		case "TW":
			return new TWParserFactory();
		}
		return null;
	}
}
