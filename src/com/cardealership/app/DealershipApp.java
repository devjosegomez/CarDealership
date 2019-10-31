package com.cardealership.app;

import java.util.Scanner;

import com.cardealership.model.Customer;
import com.cardealership.model.Employee;
import com.cardealership.model.Vehicle;

public class DealershipApp {

	public static void main(String[] args) {
		double cashOnHand = 0;
		double vehiclePrice = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter customer's cash: ");
		cashOnHand = input.nextDouble();
		System.out.println("Enter vehicle's price: ");
		vehiclePrice = input.nextDouble();
		
		
		Customer customer = new Customer("José Gómez Camacho", "123 Siempre vida St", cashOnHand);
		Vehicle vehicle = new Vehicle("Tesla", "Model 3", vehiclePrice);
		Employee emp = new Employee();
		
		customer.PurchaseCar(vehicle, emp);
		
		input.close();

	}
}
