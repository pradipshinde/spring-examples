package com.pradip.di.constructor.ambiguities;

public class Student {

	private int rollno;
	private String name;
	private String address;
	

	public Student(String name,int rollno,String address)
	{
	
		this.name=name;
		this.rollno=rollno;
		this.address=address;
		
	}
	
	public Student(String name,String address,int rollno)
	{
		this.name=name;
		this.address=address;
		this.rollno=rollno;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Name: "+name+" "+"Roll No: "+rollno+" "+"Addres: "+address;
	}
}
