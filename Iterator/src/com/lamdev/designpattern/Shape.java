package com.lamdev.designpattern;

public class Shape {
	private int id;
	private String name;
	
	public Shape(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Shape [id=" + id + ", name=" + name + "]" + "\n";
	}
}
