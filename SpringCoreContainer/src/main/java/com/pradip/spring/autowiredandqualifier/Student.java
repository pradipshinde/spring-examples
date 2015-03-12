package com.pradip.spring.autowiredandqualifier;

/**
 * @author Pradip
 *
 */
public class Student {
	
	private int rollno;
	private String name;
	private String address;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
  	public String toString() {
	return "Roll No : "+rollno+" "+"Name : "+name+" "+"Addres : "+address;  
  	}
}
