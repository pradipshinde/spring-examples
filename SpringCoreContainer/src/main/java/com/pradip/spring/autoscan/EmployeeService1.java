package com.pradip.spring.autoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceBean")
public class EmployeeService1 {
	
	@Autowired
	EmployeeDao1 employeeDao;

	public String m1()
	{
		
		return "Hello I am responding from EmployeeService1 class";
		
	}

	
	
	@Override
	public String toString() {
		
		return "This is EmployeeService1 Class [Employee Dao= "+employeeDao +" ]";
		
	}
	
	
	
	
	
}
