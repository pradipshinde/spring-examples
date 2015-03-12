package com.pradip.javaconfig.multipleconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		System.out.println("Spring load multiple configuration file");
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee=(Employee)context.getBean("employeeBean");
		System.out.println(employee);
		
		Student student=(Student)context.getBean("studentBean");
		
		System.out.println(student);
		
		
		/*
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class,EmployeeConfig.class);

		Employee employee=(Employee)context.getBean("employeeBean");
		System.out.println(employee);
		
		Student student=(Student)context.getBean("studentBean");
		
		System.out.println(student);
*/		
		
		
	}
}
