package com.example.myprescriptions.java;

import java.util.ArrayList;

public class Pharmacy {
	
	private String name;
	
	private Address address;
	
	private boolean hasDelivery;
	
	private ArrayList<Insurance> acceptedInsurance;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setHasDelivery(boolean hasDelivery) {
		this.hasDelivery = hasDelivery;
	}

	public void setAcceptedInsurance(ArrayList<Insurance> acceptedInsurance) {
		this.acceptedInsurance = acceptedInsurance;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public boolean hasDelivery() {
		return hasDelivery;
	}

	public ArrayList<Insurance> getAcceptedInsurance() {
		return acceptedInsurance;
	}

}
