package com.example.demo.model;
public class Address {
	
	private int pincode;
private String employeeName;
private String address;

public Address() {
super();
// TODO Auto-generated constructor stub
}
public Address(int pincode,String employeeName, String address) {
super();
this.employeeName = employeeName;
this.address = address;
this.pincode = pincode;
}
public String getEmployeeName() {
return employeeName;
}
public void setEmployeeName(String employeeName) {
this.employeeName = employeeName;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public int getPincode() {
return pincode;
}
public void setPincode(int pincode) {
this.pincode = pincode;
}
public String toString() {
return employeeName+" "+address+" "+pincode;
}
}

