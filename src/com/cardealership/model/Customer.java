package com.cardealership.model;

public class Customer {
	private String name;
	private String address;
	private double cashOnHand;
	
//	public void PurchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
//		
//	}
//	
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
		this.address = address;
	}
	
	public double getCashOnHand() {
		return this.cashOnHand;
	}
	
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public String toString() {
		String message = "";
		message = "Customer info\n";
		message += "Name: " + this.getName() + "\n";
		message += "Address: " + this.getAddress() + "\n";
		message += "Cash on hand: " + this.getCashOnHand();
		return message;
	}
	
}
