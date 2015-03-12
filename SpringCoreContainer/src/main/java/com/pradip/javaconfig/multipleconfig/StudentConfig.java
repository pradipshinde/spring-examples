package com.pradip.javaconfig.multipleconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

@Bean(name="studentBean")
public Student getEmployee()
	{
		
	return	new Student();
	}
}
