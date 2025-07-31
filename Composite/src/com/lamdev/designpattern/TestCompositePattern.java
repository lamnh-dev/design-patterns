package com.lamdev.designpattern;

public class TestCompositePattern {
	
	public static void main(String... agrs) {
		HtmlTag htmlParentTag = new HtmlParentElement("HTML");
		htmlParentTag.setStartTag("<html>");
		htmlParentTag.setEndTag("</html>");
		
		HtmlTag headerTag = new HtmlParentElement("Header");
		headerTag.setStartTag("<header>");
		headerTag.setEndTag("</header>");
		htmlParentTag.addChildTag(headerTag);
		
		HtmlTag bodyTag = new HtmlParentElement("Body");
		bodyTag.setStartTag("<body>");
		bodyTag.setEndTag("</body>");
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
