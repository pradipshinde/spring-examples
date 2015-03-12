package com.pradip.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

//@XmlRootElement
public class Student {
	
	private int studentId;
	private Date date;
	private String studentName;

	public Student(){};
	
	public Student ( int studentId ){
		setStudentId( studentId );
	}
	public Student(int studentId, String studentName){
		setStudentId(studentId);
		setStudentName(studentName);
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + "]";
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate( Date date ) {
		this.date = date;
	}
	
	@SuppressWarnings("deprecation")
	@JsonProperty( "date" )
	public void setDate( String date ){
		try{
			
			this.date = new Date( date);
		}catch( Exception ex ){
			
		}
	}
	

}
