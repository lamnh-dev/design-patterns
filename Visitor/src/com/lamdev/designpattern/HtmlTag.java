package com.lamdev.designpattern;

import java.util.List;

public abstract class HtmlTag implements Element{

	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public abstract String getStartTag();
	public abstract String getEndTag();
	public void setBody(String body) {
		throw new UnsupportedOperationException("Not support method");
	};
	public void addChildTag(HtmlTag tag) {
		throw new UnsupportedOperationException("Not support method");
	}
	public void removeChildTag(HtmlTag tag) {
		throw new UnsupportedOperationException("Not support method");
	}
	public List<HtmlTag> getChildren(){
		throw new UnsupportedOperationException("Not support method");
	}
	public abstract void generateHtml();
}
