package com.oracle.session05.srp.good;

/*
 * Single Responsibility Principle (SRP) states that:

A class should have only one reason to change.

In other words, each class, module, 
or function should focus on doing one thing (one responsibility) and do it well.
 */
interface Connection{
	public Connection getConnection();
}

class XMLConnection implements Connection{
	@Override
	public Connection getConnection() {
		return new XMLConnection();
	}
}

class CSVConnection implements Connection{
	@Override
	public Connection getConnection() {
		return new CSVConnection();
	}
}

class JsonConnection implements Connection{
	@Override
	public Connection getConnection() {
		return new JsonConnection();
	}
}

class ConnClient{
	
}

public class DemoSRP {

	public static void main(String[] args) {

	}

}
