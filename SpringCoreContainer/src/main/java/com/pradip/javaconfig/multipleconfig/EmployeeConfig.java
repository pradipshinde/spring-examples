package com.pradip.javaconfig.multipleconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

@Bean(name="employeeBean")
public Employee getEmployee()
	{
		
	return	new Employee();
	}
	
}
