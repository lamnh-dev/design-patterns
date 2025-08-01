package com.lamdev.designpattern;

public class SingletonEager {
	private static SingletonEager sc = new SingletonEager();

	private SingletonEager() {
	}

	public static SingletonEager getInstance() {
		return sc;
	}
}
