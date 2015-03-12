package com.pradip.spring.autowiredandqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	
	private String collegename;
	private String collegeaddress;
	
	@Autowired
	//@Qualifier("student2") 
	private Student student;

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public void setCollegeaddress(String collegeaddress) {
		this.collegeaddress = collegeaddress;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

	
@Override
public String toString() {

	return "College details College name : "+collegename+" "+"College Address : "+collegeaddress+" "+"Student Information : "+student;
	
}
}
