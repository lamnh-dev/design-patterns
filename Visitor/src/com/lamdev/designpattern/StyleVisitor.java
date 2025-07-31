package com.lamdev.designpattern;

public class StyleVisitor implements Visitor{
	
	@Override
	public void visit(HtmlElement htmlElement) {
		htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " style=`visitor`>"));
	}

	@Override
	public void visit(HtmlParentElement htmlParentElement) {
		htmlParentElement.setStartTag(htmlParentElement.getStartTag().replace(">", " style=`visitor`>"));
	}

}
