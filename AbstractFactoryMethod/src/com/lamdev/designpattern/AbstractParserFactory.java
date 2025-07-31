package com.lamdev.designpattern;

public interface AbstractParserFactory {
	XMLParser getInstance(String parserType);
}
