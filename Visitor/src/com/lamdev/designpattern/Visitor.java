package com.lamdev.designpattern;

public interface Visitor {
	void visit(HtmlElement htmlElement);
	void visit(HtmlParentElement htmlParentElement);
	
}
