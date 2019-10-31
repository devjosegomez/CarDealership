package com.cardealership.model;

public class Employee {
	
	public void handleCustomer(Customer custumer, Vehicle vehicle) {
		if(custumer.getCashOnHand() < vehicle.getPrice()) {
			double loanAmount = vehicle.getPrice() - custumer.getCashOnHand();
			runCreditHistory(custumer, Math.abs(loanAmount));
		}else {
			processTransaction(custumer, vehicle);
		}
	}
	
	public void runCreditHistory(Customer custumer, double loanAmount) {
		System.out.println("Your loan has been approved!");
		custumer.setLoanAmount(loanAmount);
		custumer.setCashOnHand(0);
	}
	
	public void processTransaction(Customer custumer, Vehicle vehicle) {
		System.out.println("Transaction has been completed");
		System.out.println("Transaction details:");
		System.out.println(custumer.toString());
		System.out.println(vehicle.toString());
		custumer.setCashOnHand(custumer.getCashOnHand() - vehicle.getPrice());
		System.out.println(custumer.finances());
	}
}
