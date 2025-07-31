package com.lamdev.designpattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag{
	
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag> childrenTags;
	
	public HtmlParentElement(String tagName) {
		this.tagName =  tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTags = new ArrayList<HtmlTag>();
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
	
	public void addChildTag(HtmlTag tag) {
		childrenTags.add(tag);
	}
	public void removeChildTag(HtmlTag tag) {
		childrenTags.remove(tag);
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		childrenTags.forEach(childrenTag -> childrenTag.generateHtml());
		System.out.println(endTag);
	}

}
