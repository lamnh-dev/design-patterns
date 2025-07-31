package com.lamdev.designpattern;

public class HtmlElement extends HtmlTag{
	
	private String tagName;
	private String startTag;
	private String endTag;
	private String body;
	
	public HtmlElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.body = "";
	}

	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	@Override
	public String getStartTag() {
		return this.startTag;
	}

	@Override
	public String getEndTag() {
		return this.endTag;
	}
	
	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag+body+endTag);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
}
