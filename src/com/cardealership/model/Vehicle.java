package com.cardealership.model;

public class Vehicle {
	private String make;
	private String model;
	private double price;
	
	//constructor
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	//getters and setters
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		String message = "";
		message = "-- Vehicle info--\n";
		message += "Make: " + this.getMake() + "\n";
		message += "Model: " + this.getModel() + "\n";
		message += "Price: " + this.getPrice() + "\n";
		message += "-----------------";
		return message;
	}
}
