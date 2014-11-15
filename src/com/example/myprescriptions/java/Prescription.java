package com.example.myprescriptions.java;

import java.util.Date;

public class Prescription {
	
	private String name;
	
	private int refills;
	
	private Date orderDate;
	private Date expirationDate;
	
	private boolean expired;
	private boolean ready;
	private boolean delivery;
	
	private Pharmacy pharmacy;

	public void setName(String name) {
		this.name = name;
	}

	public void setRefills(int refills) {
		this.refills = refills;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public String getName() {
		return name;
	}

	public int getRefills() {
		return refills;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public boolean isExpired() {
		return expired;
	}

	public boolean isReady() {
		return ready;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}	

}
