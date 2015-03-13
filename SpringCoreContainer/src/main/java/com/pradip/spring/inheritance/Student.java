package com.pradip.spring.inheritance;

/**
 * @author Pradip
 *
 */
public class Student {

	private int rollno;
	private String name;
	private String address;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
	return "Student Information [Roll No: "+rollno+" Name: "+name+" Address: "+address+"]";
	}
	
}
