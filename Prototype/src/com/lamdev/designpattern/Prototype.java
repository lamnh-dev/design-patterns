package com.lamdev.designpattern;

public interface Prototype extends Cloneable{
	
	public AccessControl clone() throws CloneNotSupportedException;
}
