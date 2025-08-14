package com.oracle.session05.srp.bad;

/*
 * Single Responsibility Principle (SRP) states that:

A class should have only one reason to change.

In other words, each class, module, 
or function should focus on doing one thing (one responsibility) and do it well.
 */
class XMLConnection{}
class CSVConnection{}
class JsonConnection{}

//SRP
class ConnectionFactory{
	public XMLConnection getXmlConnection() {
		return new XMLConnection();
	}
	public CSVConnection getCSVConnection() {
		return new CSVConnection();
	}
	public JsonConnection getJsonConnection() {
		return new JsonConnection();
	}
}
public class DemoSRP {

	public static void main(String[] args) {

	}

}
