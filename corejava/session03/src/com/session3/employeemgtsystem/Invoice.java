package com.session3.employeemgtsystem;

public class Invoice implements Payable{
	private int invoiceId;
	private int regNo;
	private double totalInvoiceValue;
	
	public Invoice(int invoiceId, int regNo, double totalInvoiceValue) {
		super();
		this.invoiceId = invoiceId;
		this.regNo = regNo;
		this.totalInvoiceValue = totalInvoiceValue;
	}
	
	public void print() {
		System.out.println("invoiceId: "+ invoiceId);
		System.out.println("regNo: "+ regNo);
		System.out.println("totalInvoiceValue: "+ totalInvoiceValue);
		
	}

	@Override
	public double getPay() {
		return totalInvoiceValue*.8;
	}
}
