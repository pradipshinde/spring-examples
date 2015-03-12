package com.pradip.spring.autoscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutoScan1.xml");
		EmployeeService1 employeeService=(EmployeeService1)applicationContext.getBean("serviceBean");
		
		System.out.println(employeeService.m1());
		
		System.out.println(employeeService);
		
	}
}
