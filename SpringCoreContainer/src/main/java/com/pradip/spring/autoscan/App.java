package com.pradip.spring.autoscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutoScan.xml");
		EmployeeService employeeService=(EmployeeService)applicationContext.getBean("employeeService");
		
		System.out.println(employeeService.m1());
		
		System.out.println(employeeService);
	}
}
