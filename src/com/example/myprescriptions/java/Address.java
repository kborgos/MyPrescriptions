package com.example.myprescriptions.java;

public class Address {
	
	private String street;
	private String streetNumber;
	private String city;
	private String country;
	private String zipCode;
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getStreet() {
		return street;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getZipCode() {
		return zipCode;
	}	

}
