package com.lamdev.designpattern;

public class TestIteratorPattern {

	public static void main(String[] args) {
		ShapeStorage shapeStorage = new ShapeStorage();
		shapeStorage.addShape("Polygon");
		shapeStorage.addShape("Hexagon");
		shapeStorage.addShape("Circle");
		shapeStorage.addShape("Rectangle");
		shapeStorage.addShape("Square");
		
		ShapeIterator iterator = new ShapeIterator(shapeStorage.getShapes());
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		System.out.print("Apply removing while iterating...\n");
		iterator = new ShapeIterator(shapeStorage.getShapes());
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			iterator.remove();
		}
	}

}
