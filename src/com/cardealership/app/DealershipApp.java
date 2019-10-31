package com.cardealership.app;

import com.cardealership.model.Customer;

public class DealershipApp {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.setName("José Gómez Camacho");
		cust1.setAddress("123 Siempre vida St.");
		cust1.setCashOnHand(12000);
		System.out.println(cust1.toString());
	}

}
