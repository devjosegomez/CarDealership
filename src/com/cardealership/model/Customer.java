package com.cardealership.model;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	private double loanAmount;
	
	//constructor
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}
	
	
	//Getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		address += ", Guadalajara, Jalisco.";
		this.address = address;
	}
	
	public double getCashOnHand() {
		return this.cashOnHand;
	}
	
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public double getLoanAmount() {
		return this.loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public String toString() {
		
		String message = "";
		message = decoration();
		message += "\n-- Customer info--\n";
		message += "Name: " + this.getName() + "\n";
		message += "Address: " + this.getAddress() + "\n";
		message += "Cash on hand: " + this.getCashOnHand() + "\n";
		message += "Loan: " + this.getLoanAmount() + "\n";
		message += decoration();
		return message;
	}
	
	public String finances() {
		String message = "Customer [" + this.getName() + "]'s finances:\n";
		message += "Cash: $" + this.getCashOnHand() + "\n";
		message += "Loan: $" + this.getLoanAmount();
		return message;
	}
	
	public void PurchaseCar(Vehicle vehicle, Employee emp) {
		emp.handleCustomer(this, vehicle);
	}
	
	public String decoration() {
		int decMax = this.getAddress().length() + 10;
		String tmp = "";
		for(int i=0; i< decMax ; i++ ) {
			tmp += "-";
		}
		return tmp;
	}
	
}
