package com.cg.rest.restServices;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
@Override
	public String toString() {
		return "Address [flatNumber=" + flatNumber + ", streetName=" + streetName + ", pincode=" + pincode + ", city="
				+ city + ", State=" + State + "]";
	}
public Address() {
		super();
		
	}
public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
private int flatNumber;
private String streetName;
private int pincode;
private String city;
private String State;
}
