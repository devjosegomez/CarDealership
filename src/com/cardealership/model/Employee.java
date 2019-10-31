package com.cardealership.model;

public class Employee {
	
	public void handleCustomer(Customer custumer, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - custumer.getCashOnHand();
			runCreditHistory(custumer, loanAmount);
		}else if(vehicle.getPrice() <= custumer.getCashOnHand()) {
			processTransaction(custumer, vehicle);
		}else {
			System.out.println("Customer " + custumer.getName() + " will need more money to purchase the vehicle!");
		}
	}
	
	public void runCreditHistory(Customer custumer, double loanAmount) {
		System.out.println("Ran credit history for customer " + custumer.getName());
		System.out.println("Customer has been approved to purchase the vehicle");
		System.out.println("Loan: " + loanAmount);
	}
	
	public void processTransaction(Customer custumer, Vehicle vehicle) {
		System.out.println("Customer " + custumer.getName()  + 
				" has been purchased the vehicle " + vehicle + 
				" for the price of " + vehicle.getPrice());
	}
}
