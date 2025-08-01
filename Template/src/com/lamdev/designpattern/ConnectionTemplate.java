package com.lamdev.designpattern;

public abstract class ConnectionTemplate {
	
	public final void run() {
		setDBDriver();
		setCredentials();
		connect();
		prepareStatement();
		setData();
		insert();
		close();
		destroy();
	}
	
	public abstract void setDBDriver();
	
	public abstract void setCredentials();
	
	public void connect() {
		System.out.println("Inserting data...");
	};
	
	public void prepareStatement() {
		System.out.println("Preparing insert statement...");
	};
	
	public abstract void setData();
	
	public void insert() {
		System.out.println("Inserting data...");
	};
	
	public void close() {
		System.out.println("Cloning connections...");
	};
	
	public void destroy() {
		System.out.println("Destroy connection objects...");
	};
}
