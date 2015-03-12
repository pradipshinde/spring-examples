package com.pradip.spring.autoscan;

public class EmployeeService {
	
	EmployeeDao employeeDao;

	public String m1()
	{
		
		return "Hello I am responding from EmployeeService class";
		
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	@Override
	public String toString() {
		
		return "This is EmployeeService Class [Employee Dao= "+employeeDao +" ]";
		
	}
	
	
	
	
	
}
