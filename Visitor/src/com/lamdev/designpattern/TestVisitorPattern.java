package com.lamdev.designpattern;

public class TestVisitorPattern {

	public static void main(String[] args) {
		Visitor cssClassVisitor = new CssClassVisitor();
		Visitor styleVisitor = new StyleVisitor();
		
		HtmlTag htmlParentTag = new HtmlParentElement("HTML");
		htmlParentTag.setStartTag("<html>");
		htmlParentTag.setEndTag("</html>");
		htmlParentTag.accept(cssClassVisitor);
		htmlParentTag.accept(styleVisitor);
		
		HtmlTag headerTag = new HtmlParentElement("Header");
		headerTag.setStartTag("<header>");
		headerTag.setEndTag("</header>");
		headerTag.accept(cssClassVisitor);
		headerTag.accept(styleVisitor);
		htmlParentTag.addChildTag(headerTag);
		
		HtmlTag bodyTag = new HtmlParentElement("Body");
		bodyTag.setStartTag("<body>");
		bodyTag.setEndTag("</body>");
		bodyTag.accept(cssClassVisitor);
		bodyTag.accept(styleVisitor);
		htmlParentTag.addChildTag(bodyTag);
		
		HtmlTag footerTag = new HtmlParentElement("Footer");
		footerTag.setStartTag("<footer>");
		footerTag.setEndTag("</footer>");
		htmlParentTag.addChildTag(footerTag);
		
		HtmlTag h1Tag = new HtmlParentElement("H1");
		h1Tag.setStartTag("<h1>");
		h1Tag.setEndTag("</h1>");
		bodyTag.addChildTag(h1Tag);
		
		HtmlElement divTag = new HtmlElement("Div");
		divTag.setStartTag("<div>");
		divTag.setEndTag("</div>");
		divTag.setBody("Hello World!");
		h1Tag.addChildTag(divTag);
		
		htmlParentTag.generateHtml();
	}

}
